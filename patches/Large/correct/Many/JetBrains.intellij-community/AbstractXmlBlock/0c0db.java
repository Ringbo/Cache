diff --git a/xml/impl/src/com/intellij/psi/formatter/xml/AbstractXmlBlock.java b/xml/impl/src/com/intellij/psi/formatter/xml/AbstractXmlBlock.java
index 0364e69..269bd79 100644
--- a/xml/impl/src/com/intellij/psi/formatter/xml/AbstractXmlBlock.java
+++ b/xml/impl/src/com/intellij/psi/formatter/xml/AbstractXmlBlock.java
@@ -1,18 +1,4 @@
-/*
- * Copyright 2000-2016 JetBrains s.r.o.
- *
- * Licensed under the Apache License, Version 2.0 (the "License");
- * you may not use this file except in compliance with the License.
- * You may obtain a copy of the License at
- *
- * http://www.apache.org/licenses/LICENSE-2.0
- *
- * Unless required by applicable law or agreed to in writing, software
- * distributed under the License is distributed on an "AS IS" BASIS,
- * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
- * See the License for the specific language governing permissions and
- * limitations under the License.
- */
+// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 package com.intellij.psi.formatter.xml;
 
 import com.intellij.formatting.*;
@@ -317,7 +303,7 @@
   }
 
 
-  protected XmlBlock createSimpleChild(final ASTNode child, final Indent indent, final Wrap wrap, final Alignment alignment) {
+  protected Block createSimpleChild(final ASTNode child, final Indent indent, final Wrap wrap, final Alignment alignment) {
     return new XmlBlock(child, wrap, alignment, myXmlFormattingPolicy, indent, null, isPreserveSpace());
   }
 
