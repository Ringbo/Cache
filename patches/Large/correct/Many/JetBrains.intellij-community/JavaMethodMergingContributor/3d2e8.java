diff --git a/codeInsight/impl/com/intellij/codeInsight/completion/JavaMethodMergingContributor.java b/codeInsight/impl/com/intellij/codeInsight/completion/JavaMethodMergingContributor.java
index a0bbc03..2cba0ee 100644
--- a/codeInsight/impl/com/intellij/codeInsight/completion/JavaMethodMergingContributor.java
+++ b/codeInsight/impl/com/intellij/codeInsight/completion/JavaMethodMergingContributor.java
@@ -27,7 +27,7 @@
 
     final CompletionProcess process = CompletionService.getCompletionService().getCurrentCompletion();
     ProgressManager.getInstance().checkCanceled();
-    if (!process.willAutoInsert(AutoCompletionPolicy.SETTINGS_DEPENDENT, result.getPrefixMatcher())) return true;
+    if (process == null || !process.willAutoInsert(AutoCompletionPolicy.SETTINGS_DEPENDENT, result.getPrefixMatcher())) return true;
 
     final Ref<Boolean> wereNonGrouped = Ref.create(false);
     final Map<String, LookupItem<PsiMethod>> methodNameToItem = new LinkedHashMap<String, LookupItem<PsiMethod>>();
