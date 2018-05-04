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
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Trying out https://kotlinlang.org/docs/reference/basic-syntax.html
 */
class VariablesTest {
  @Test
  fun `try variables`() {
    // Read only variable

    val a = 1
    assertEquals("int", a.javaClass.simpleName)

    // val cannot be reassigned
    // NOK : a = 2

    // Mutable variable

    var b = 1
    b += 2
    assertEquals(3, b)
  }

  @Test
  fun `try string templates`() {
    var a = 1
    // simple name in template:
    val s1 = "a is $a"
    assertEquals("a is 1", s1)

    a = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    assertEquals("a was 1, but now is 2", s2)
  }

  fun identity(a: Any) = a

  fun identityOfNullableString(a: String?) = a

  @Test
  fun `try nulls`() {
    // By default an argument can't be null
    // NOK : identity(null)

    // If we add '?' to type then it can be null
    assertNull(identityOfNullableString(null))
  }

  @Test
  fun `try is`() {
    assertTrue("a" is String)
  }

  private fun getStringLength(obj: Any?): Int? {
    // smart cast so we don't need to explicitly cast right hand side
    if (obj is String && obj.length > 0) {
      return obj.length
    }

    return null
  }

  @Test
  fun `function with smart cast`() {
    assertEquals(5, getStringLength("abcde"))
    assertNull(getStringLength(Object()))
  }

  @Test
  fun `for loop`() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
      // Something
    }
  }

  fun describe(obj: Any): String =
      when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
      }

  @Test
  fun `try when`() {
    assertEquals("One", describe(1))
    assertEquals("Greeting", describe("Hello"))
  }

}