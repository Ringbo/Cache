diff --git a/source/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java b/source/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
index fa56f40b..aa41507 100644
--- a/source/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
+++ b/source/com/intellij/testFramework/fixtures/impl/CodeInsightTestFixtureImpl.java
@@ -247,7 +247,7 @@
         assert copy != null : "file not found: " + fullPath;
         final PsiFile psiFile = myPsiManager.findFile(copy);
         assert psiFile != null;
-        checkResultByFile(filePath, psiFile, false);
+        checkResultByFile(expectedFile, psiFile, false);
       }
     }.execute().throwException();
   }
