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

class PerformanceContext constructor(performance: Performance) {
  var performance : Performance = performance
  var channelIndex : Int = 0

  fun channel(channel: Int, instrument: String, init: () -> Unit) : PerformanceContext {
    return channel(Channel(channel, instrument), init)
  }

  fun channel(channel: Int, init: () -> Unit) : PerformanceContext {
    return channel(Channel(channel), init)
  }

  private fun channel(channel: Channel, init: () -> Unit) : PerformanceContext {
    performance.channels.add(channel)
    this.channelIndex = channel.index
    init.invoke()
    return this
  }

  infix fun play(sequence: Sequence) : Sequence {
    if (sequence.channel == 0) sequence.channel = channelIndex
    performance.sequences.add(sequence)
    return sequence
  }

  infix fun play(bits: Int): Sequence {
    return play(Sequence(bits = bits))
  }

  infix fun play(notation: String): Sequence {
    return play(Sequence(notation = notation))
  }
}

infix fun Sequence.at(value: Tick) : Sequence {
  tick = value
  return this
}

// Override +
operator fun Sequence.plus(value: Int) : Sequence {
  offset = value
  return this
}