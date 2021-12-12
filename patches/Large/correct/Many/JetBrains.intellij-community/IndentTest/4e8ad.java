diff --git a/java/java-tests/testSrc/com/intellij/java/psi/formatter/java/IndentTest.java b/java/java-tests/testSrc/com/intellij/java/psi/formatter/java/IndentTest.java
index 200eefe..6dea466 100644
--- a/java/java-tests/testSrc/com/intellij/java/psi/formatter/java/IndentTest.java
+++ b/java/java-tests/testSrc/com/intellij/java/psi/formatter/java/IndentTest.java
@@ -106,7 +106,7 @@
   public void testParenthesizedContinuation() throws Exception {
 
     defaultSettings();
-    CodeStyleSettings settings = CodeStyleSettingsManager.getSettings(getProject());
+    CommonCodeStyleSettings settings = getJavaSettings();
     settings.ALIGN_MULTILINE_PARENTHESIZED_EXPRESSION = true;
 
     doTest("ParenthesizedContinuation.java", "ParenthesizedContinuation_after.java");
@@ -115,7 +115,7 @@
   public void testParenthesizedContinuation2() throws Exception {
 
     defaultSettings();
-    CodeStyleSettings settings = CodeStyleSettingsManager.getSettings(getProject());
+    CommonCodeStyleSettings settings = getJavaSettings();
     settings.ALIGN_MULTILINE_PARENTHESIZED_EXPRESSION = true;
 
     doTest("ParenthesizedContinuation2.java", "ParenthesizedContinuation2_after.java");
@@ -159,7 +159,7 @@
   }
 
   private void defaultSettings() {
-    CodeStyleSettings settings = CodeStyleSettingsManager.getSettings(getProject());
+    CommonCodeStyleSettings settings = getJavaSettings();
 
     settings.ALIGN_MULTILINE_PARAMETERS = true;
     settings.ALIGN_MULTILINE_PARAMETERS_IN_CALLS = false;
