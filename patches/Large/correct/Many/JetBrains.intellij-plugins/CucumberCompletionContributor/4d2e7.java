diff --git a/cucumber/src/org/jetbrains/plugins/cucumber/completion/CucumberCompletionContributor.java b/cucumber/src/org/jetbrains/plugins/cucumber/completion/CucumberCompletionContributor.java
index 83d4f09..294e3d3 100644
--- a/cucumber/src/org/jetbrains/plugins/cucumber/completion/CucumberCompletionContributor.java
+++ b/cucumber/src/org/jetbrains/plugins/cucumber/completion/CucumberCompletionContributor.java
@@ -65,7 +65,7 @@
           // but don't suggest scenario keywords inside steps
           final PsiElement coveringElement = PsiTreeUtil.getParentOfType(position, GherkinStep.class, GherkinFeature.class, PsiFileSystemItem.class);
           if (coveringElement instanceof PsiFileSystemItem) {
-            addFeatureKeywords(result, psiFile, position);
+            addFeatureKeywords(result, psiFile);
           } else if (coveringElement instanceof GherkinFeature) {
             addScenarioKeywords(result, psiFile, position);
           }
@@ -111,7 +111,7 @@
     addKeywordsToResult(keywords, result, true);
   }
 
-  private static void addFeatureKeywords(CompletionResultSet result, PsiFile originalFile, PsiElement originalPosition) {
+  private static void addFeatureKeywords(CompletionResultSet result, PsiFile originalFile) {
     final Project project = originalFile.getProject();
     final GherkinKeywordTable table = GherkinKeywordTable.getKeywordsTable(originalFile, project);
 
@@ -227,7 +227,7 @@
             final String matchedText = shiftedRange.substring(stepText);
             builder.replaceRange(shiftedRange, matchedText);
           }
-          builder.run();
+          builder.run(context.getEditor(), false);
         }
       }
     }
