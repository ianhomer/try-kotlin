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

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import org.junit.Test

class CoroutinesTest {
  @Test
  fun `test coroutine`() {
    launch {
      delay(1000)
      println("Hello")
    }

    println("launched")
    Thread.sleep(2000) // wait for 2 seconds
    println("Stop")
  }

  @Test
  fun `test run in parallel`() {
    println((1..1_000).map { n ->
      async {
        delay(1000)
        n
      }
    })
  }
}