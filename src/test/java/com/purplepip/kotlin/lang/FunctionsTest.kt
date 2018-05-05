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

class FunctionsTest {
  @Test fun `when add two numbers then sum is OK`() {
    assertEquals(3, sum(1, 2));
  }

  @Test fun `let's try max of`() {
    assertEquals(2, maxOf(1, 2));
  }
}