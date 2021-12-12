diff --git a/python/testSrc/com/jetbrains/python/PythonHighlightingTest.java b/python/testSrc/com/jetbrains/python/PythonHighlightingTest.java
index 6e0b5ea..3562095 100644
--- a/python/testSrc/com/jetbrains/python/PythonHighlightingTest.java
+++ b/python/testSrc/com/jetbrains/python/PythonHighlightingTest.java
@@ -63,7 +63,7 @@
   }
 
   public void testContinueInFinallyBlock() throws Exception {
-    doTest();
+    doTest(false, false);
   }
 
   public void testReturnWithArgumentsInGenerator() throws Exception {
