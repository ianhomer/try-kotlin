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

package com.purplepip.kotlin.dsl

class MyPerformance: Performance({
  channel(1) {
    play("A/q G/8 A/q E") at Tick.HALF_BEAT
  }
  channel(2) {
    this play "A B D"
    play(3)  + 1 at Tick.HALF_BEAT
  }
  channel(9, "Power Drums") {
    play(15)  + 1 at Tick.BEAT
  }
})
