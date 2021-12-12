diff --git a/java/java-tests/testSrc/com/intellij/refactoring/ExtractMethodObjectWithMultipleExitPointsTest.java b/java/java-tests/testSrc/com/intellij/refactoring/ExtractMethodObjectWithMultipleExitPointsTest.java
index 56ca2fc..8c7e26e 100644
--- a/java/java-tests/testSrc/com/intellij/refactoring/ExtractMethodObjectWithMultipleExitPointsTest.java
+++ b/java/java-tests/testSrc/com/intellij/refactoring/ExtractMethodObjectWithMultipleExitPointsTest.java
@@ -23,7 +23,7 @@
   }
 
   private void doTest(boolean createInnerClass) throws Exception {
-    final String testName = getTestName(true);
+    final String testName = getTestName(false);
     configureByFile("/refactoring/extractMethodObject/multipleExitPoints/" + testName + ".java");
     int startOffset = myEditor.getSelectionModel().getSelectionStart();
     int endOffset = myEditor.getSelectionModel().getSelectionEnd();
