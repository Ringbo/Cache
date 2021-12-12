diff --git a/platform/platform-tests/testSrc/com/intellij/ide/codeStyleSettings/CodeStyleTestCase.java b/platform/platform-tests/testSrc/com/intellij/ide/codeStyleSettings/CodeStyleTestCase.java
index 6b6772b..f964e79 100644
--- a/platform/platform-tests/testSrc/com/intellij/ide/codeStyleSettings/CodeStyleTestCase.java
+++ b/platform/platform-tests/testSrc/com/intellij/ide/codeStyleSettings/CodeStyleTestCase.java
@@ -94,7 +94,7 @@
 
   protected String loadExpected(@NotNull String ext) throws IOException {
     return FileUtilRt
-      .loadFile(new File(getBasePath() + File.separator + getTestDir() + File.separator + getTestName(true) + "." + ext));
+      .loadFile(new File(getBasePath() + File.separator + getTestDir() + File.separator + getTestName(true) + "." + ext), true);
   }
 
   protected CodeStyleScheme createTestScheme() {
