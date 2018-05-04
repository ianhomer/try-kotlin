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

package com.purplepip.kotlin.simple;

import static org.junit.Assert.assertEquals;

import com.purplepip.java.simple.JSong;
import org.junit.Test;

public class SongTest {
  @Test
  public void testJavaSong() {
    assertEquals("name", new JSong("name").getName());
  }

  @Test
  public void testSong() {
    assertEquals(new Song("name"), new Song("name"));
    assertEquals(new Song("name"), new Song("name").copy("name"));
    assertEquals(new Song("name").hashCode(), new Song("name").hashCode());
    assertEquals("Song(name=name)", new Song("name").toString());
    assertEquals("name", new Song("name").getName());
  }
}
