diff --git a/jps/javac-ref-scanner-8/src/org/jetbrains/jps/javac/ast/Javac8RefScanner.java b/jps/javac-ref-scanner-8/src/org/jetbrains/jps/javac/ast/Javac8RefScanner.java
index 1e70071..ad6faeb 100644
--- a/jps/javac-ref-scanner-8/src/org/jetbrains/jps/javac/ast/Javac8RefScanner.java
+++ b/jps/javac-ref-scanner-8/src/org/jetbrains/jps/javac/ast/Javac8RefScanner.java
@@ -1,18 +1,4 @@
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
+// Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 package org.jetbrains.jps.javac.ast;
 
 import com.sun.source.tree.LambdaExpressionTree;
@@ -34,7 +20,7 @@
   public Tree visitLambdaExpression(LambdaExpressionTree node, JavacReferenceCollectorListener.ReferenceCollector refCollector) {
     final TypeMirror type = refCollector.getType(node);
     Types types = refCollector.getTypeUtility();
-    if (types != null) {
+    if (types != null && type != null) {
       final Element element = types.asElement(type);
       if (element != null) {
         final JavacRef.JavacElementRefBase ref = refCollector.asJavacRef(element);
