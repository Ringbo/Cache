diff --git a/python/testSrc/com/jetbrains/python/PythonHighlightingTest.java b/python/testSrc/com/jetbrains/python/PythonHighlightingTest.java
index 23b51b8..7aa1edf 100644
--- a/python/testSrc/com/jetbrains/python/PythonHighlightingTest.java
+++ b/python/testSrc/com/jetbrains/python/PythonHighlightingTest.java
@@ -70,7 +70,7 @@
   }
   
   public void testBreakOutsideOfLoop() {
-    doTest();
+    doTest(true, false);
   }
 
   public void testReturnOutsideOfFunction() {
