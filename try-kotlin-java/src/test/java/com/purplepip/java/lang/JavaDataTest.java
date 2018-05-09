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

package com.purplepip.java.lang;

import static org.junit.Assert.assertEquals;

import com.purplepip.kotlin.lang.Data;
import org.junit.Assert;
import org.junit.Test;

public class JavaDataTest {
  @Test
  public void testJavaSong() {
    assertEquals("name", new JavaData("name").getName());
  }

  @Test
  public void testLombokSong() {
    assertEquals("name", new LombokData("name").getName());
  }

  @Test
  public void testSong() {
    Assert.assertEquals(new Data("name"), new Data("name"));
    assertEquals(new Data("name"), new Data("name").copy("name"));
    assertEquals(new Data("name").hashCode(), new Data("name").hashCode());
    assertEquals("Data(name=name)", new Data("name").toString());
    assertEquals("name", new Data("name").getName());
  }
}
