diff --git a/java/java-tests/testSrc/com/intellij/codeInspection/UnusedReturnValueTest.java b/java/java-tests/testSrc/com/intellij/codeInspection/UnusedReturnValueTest.java
index 80f9c7c..4e086f0 100644
--- a/java/java-tests/testSrc/com/intellij/codeInspection/UnusedReturnValueTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInspection/UnusedReturnValueTest.java
@@ -23,11 +23,11 @@
   }
 
   private void doTest() throws Exception {
-    doTest("unusedReturnValue/" + getTestName(false), myTool);
+    doTest("unusedReturnValue/" + getTestName(true), myTool);
   }
 
 
-  public void testnonLiteral() throws Exception {
+  public void testNonLiteral() throws Exception {
     doTest();
   }
 
