diff --git a/jps/jps-builders-6/src/org/jetbrains/jps/javac/ast/JavacReferenceCollectorListener.java b/jps/jps-builders-6/src/org/jetbrains/jps/javac/ast/JavacReferenceCollectorListener.java
index e0007ae..559a6ba 100644
--- a/jps/jps-builders-6/src/org/jetbrains/jps/javac/ast/JavacReferenceCollectorListener.java
+++ b/jps/jps-builders-6/src/org/jetbrains/jps/javac/ast/JavacReferenceCollectorListener.java
@@ -1,18 +1,6 @@
-/*
- * Copyright 2000-2017 JetBrains s.r.o.
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
+// Copyright 2000-2017 JetBrains s.r.o.
+// Use of this source code is governed by the Apache 2.0 license that can be
+// found in the LICENSE file.
 package org.jetbrains.jps.javac.ast;
 
 import com.intellij.util.Consumer;
@@ -338,7 +326,7 @@
 
   //TODO
   private static Element getElementIfJdkUnder8(Tree tree) {
-    if (tree == null) return null;
+    if (tree == null || tree instanceof PrimitiveTypeTree) return null;
     Field symField;
     try {
       //should be the same to com.sun.tools.javac.tree.TreeInfo.symbolForImpl() since com.sun.source.util.Trees.getElement() works improperly under jdk 6-7
