diff --git a/plugins/groovy/src/org/intellij/plugins/intelliLang/inject/groovy/PatternEditorContextMembersProvider.java b/plugins/groovy/src/org/intellij/plugins/intelliLang/inject/groovy/PatternEditorContextMembersProvider.java
index 745d834..403205f 100644
--- a/plugins/groovy/src/org/intellij/plugins/intelliLang/inject/groovy/PatternEditorContextMembersProvider.java
+++ b/plugins/groovy/src/org/intellij/plugins/intelliLang/inject/groovy/PatternEditorContextMembersProvider.java
@@ -159,7 +159,7 @@
       ((PsiManagerEx)beanClass.getManager()).getCacheManager().processFilesWithWord(new Processor<PsiFile>() {
         @Override
         public boolean process(PsiFile psiFile) {
-          LowLevelSearchUtil.processElementsContainingWordInElement(occurenceProcessor, psiFile, searcher, false, new EmptyProgressIndicator());
+          LowLevelSearchUtil.processElementsContainingWordInElement(occurenceProcessor, psiFile, searcher, true, new EmptyProgressIndicator());
           return true;
         }
       }, searcher.getPattern(), UsageSearchContext.IN_FOREIGN_LANGUAGES, scope, searcher.isCaseSensitive());
