diff --git a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
index 1d8f27e..fd6db9fd 100644
--- a/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
+++ b/platform/testFramework/src/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
@@ -589,7 +589,7 @@
       @Override
       protected void run() throws Exception {
         final PsiElement substitution = RenamePsiElementProcessor.forElement(element).substituteElementToRename(element, myEditor);
-        if (element == null) return;
+        if (substitution == null) return;
         new RenameProcessor(myProjectFixture.getProject(), substitution, newName, searchInComments, searchTextOccurrences).run();
      }
     }.execute().throwException();
