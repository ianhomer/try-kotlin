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
import kotlin.test.assertNotEquals

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
}