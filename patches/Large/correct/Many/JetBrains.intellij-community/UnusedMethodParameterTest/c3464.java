diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/UnusedMethodParameterTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/UnusedMethodParameterTest.java
index 8be36c3..03d0be2 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/UnusedMethodParameterTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/UnusedMethodParameterTest.java
@@ -23,7 +23,7 @@
   private final UnusedParametersInspection myTool = new UnusedParametersInspection();
 
   private void doTest() throws Exception {
-    doTest("unusedMethodParameter/" + getTestName(false), myTool);
+    doTest("unusedMethodParameter/" + getTestName(true), myTool);
   }
 
   public void testFieldInAnonymousClass() throws Exception {
