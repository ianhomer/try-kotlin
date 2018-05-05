/*
 * Copyright (c) 2017 the original author or authors. All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.purplepip.kotlin.lang

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class IdiomsTest {
  data class Bean(val name: String, val email: String = "")

  @Test
  fun `try data class`() {
    val bean = Bean("name", "me@my.com")
    assertEquals("name", bean.name)
    assertEquals(Bean("name"), Bean("name"))
    assertEquals(Bean("name").hashCode(), Bean("name").hashCode())
    assertNotEquals(Bean("name").hashCode(), Bean("another").hashCode())

    assertEquals("me@my.com", bean.email)
    val copy = bean.copy(email = "another@my.com")
    assertEquals("another@my.com", copy.email)

    // Get components
    assertEquals("name", bean.component1())
    assertEquals("me@my.com", bean.component2())

    // Destructuring an object
    val (name, email) = bean
    assertEquals("name", name)
    assertEquals("me@my.com", email)
  }

  @Test
  fun `try traversing a map`() {
    // read-only map with mapOf
    val map = mapOf(1 to "x", 2 to "y", -1 to "zz")

    // traverse map
    for ((k, v) in map) {
      println("$k -> $v")
    }
  }

  @Test
  fun `try lazy`() {
    var created = false
    val p : String by lazy {
      println("Creating lazy")
      created = true
      "lazy hello"
    }
    assertFalse(created)
    println("Before lazy")
    println(p);
    assertTrue(created)
  }


  // Extend String
  private fun String.replaceSpaces(): String {
    return this.replace(' ', '.')
  }

  @Test
  fun `try extension functions`() {
    val s = "My Greatest Moment".replaceSpaces()
    assertEquals("My.Greatest.Moment", s)
  }

  // Singleton
  object Resource {
    val name = "my-name"
  }

  @Test
  fun `try singleton`() {
    assertEquals("my-name", Resource.name)
  }

  private fun getLength(s: String?): Int {
    // Execute if not null
    s?.let {
      println("Non null value : $s")
    }

    // Null safety and elvis
    return s?.length ?: -1
  }

  @Test
  fun `try if not null`() {
    assertEquals(1, getLength("a"))
    assertEquals(0, getLength(""))
    assertEquals(-1, getLength(null))
  }

  // when expression
  private fun Int.asWord(): String {
    return when {
      this == 1 -> "one"
      this == 2 -> "two"
      else -> "too high"
    }
  }

  @Test
  fun `try when expression`() {
    assertEquals("one", 1.asWord())
    assertEquals("too high", 9.asWord())
  }

  // Single answer functions
  private fun theAnswer() = 42

  @Test
  fun `try single answer`() {
    assertEquals(42, theAnswer())
  }

  @Test
  fun `try with`() {
    with(42) {
      assertEquals(42, this)
      if (this == 42) {
        println("This is the answer")
      }
      for (i in 1..this) {
        // Do something
      }
    }
  }
}