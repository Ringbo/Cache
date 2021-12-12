diff --git a/source/com/intellij/testFramework/fixtures/CodeInsightFixtureTestCase.java b/source/com/intellij/testFramework/fixtures/CodeInsightFixtureTestCase.java
index 76ccc0c..a75ff2c 100644
--- a/source/com/intellij/testFramework/fixtures/CodeInsightFixtureTestCase.java
+++ b/source/com/intellij/testFramework/fixtures/CodeInsightFixtureTestCase.java
@@ -104,7 +104,7 @@
     myFixture.configureByText(fileType, text.replaceAll("\\|", "<caret>"));
     tuneCompletionFile(myFixture.getFile());
     final LookupElement[] elements = myFixture.completeBasic();
-    if (elements != null) {
+    if (elements != null && elements.length > 0) {
       fail(Arrays.toString(elements));
     }
     myFixture.checkResult(resultText.replaceAll("\\|", "<caret>"));
