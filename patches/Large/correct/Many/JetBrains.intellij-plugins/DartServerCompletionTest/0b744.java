diff --git a/Dart/testSrc/com/jetbrains/dart/analysisServer/DartServerCompletionTest.java b/Dart/testSrc/com/jetbrains/dart/analysisServer/DartServerCompletionTest.java
index c4387a5..4c50518 100644
--- a/Dart/testSrc/com/jetbrains/dart/analysisServer/DartServerCompletionTest.java
+++ b/Dart/testSrc/com/jetbrains/dart/analysisServer/DartServerCompletionTest.java
@@ -1,4 +1,4 @@
-// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
+// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 package com.jetbrains.dart.analysisServer;
 
 import com.intellij.codeInsight.completion.CompletionType;
@@ -159,8 +159,9 @@
                               "}");
     myFixture.completeBasic();
     myFixture.assertPreferredCompletionItems(0, "AXX.one", "AXX.two", "main", "const", "false", "new", "null", "true",
-                                             "AbstractClassInstantiationError", "ArgumentError", "AssertionError", "AXB", "AXB.four",
-                                             "AXB.three", "AXX", "BidirectionalIterator");
+                                             "AbstractClassInstantiationError", "AbstractClassInstantiationError", "ArgumentError",
+                                             "ArgumentError", "ArgumentError.notNull", "ArgumentError.value", "AssertionError",
+                                             "AssertionError", "AXB", "AXB.four", "AXB.three", "AXX", "BidirectionalIterator");
   }
 
   public void testNoCompletionAfterDigit() {
