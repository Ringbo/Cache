diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
index e7b5625..84dcdbf 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
@@ -1609,7 +1609,7 @@
     actualText = StringUtil.convertLineSeparators(actualText);
 
     if (!Comparing.equal(expectedText, actualText)) {
-      if (loader.filePath != null) {
+      if (loader.filePath != null && !loader.caretState.hasExplicitCaret()) {
         throw new FileComparisonFailure(expectedFile, expectedText, actualText, loader.filePath);
       }
       else {
