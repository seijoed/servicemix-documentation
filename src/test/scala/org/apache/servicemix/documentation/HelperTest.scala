/**
 * Copyright (C) 2009-2010 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.servicemix.documentation

import org.apache.servicemix.documentation.Helper._
import org.junit.Test
import org.junit.Assert.{assertEquals,assertFalse,assertTrue}
import org.fusesource.scalate.maven.DummyTemplateEngine
import org.fusesource.scalate.TemplateEngine

/**
 * Test case for org.apache.servicemix.documentation.Helper
 */
class HelperTest {

  @Test
  def testTocHelper = {
    assertEquals("Should return valid TOC for /users-guide/index.conf",
                 "/users-guide/toc.ssp", toc("/users-guide/index.conf"))
  }

  @Test
  def testSitegen = {
    assertTrue("DummyTemplateEngine is used in scalate:sitegen",
               sitegen(new DummyTemplateEngine(List())))
    assertFalse("Any other template engine means we're not in scalate:sitegen",
                sitegen(new TemplateEngine()))

  }

}
