diff --git a/codeInsight/impl/com/intellij/codeInsight/completion/JavaSmartCompletionContributor.java b/codeInsight/impl/com/intellij/codeInsight/completion/JavaSmartCompletionContributor.java
index baf8d11..6054cce 100644
--- a/codeInsight/impl/com/intellij/codeInsight/completion/JavaSmartCompletionContributor.java
+++ b/codeInsight/impl/com/intellij/codeInsight/completion/JavaSmartCompletionContributor.java
@@ -153,7 +153,10 @@
 
     extend(CompletionType.SMART, PlatformPatterns.or(
         psiElement().withParent(PsiExpression.class),
-        psiElement().inside(PsiClassObjectAccessExpression.class)),
+        psiElement().inside(PsiClassObjectAccessExpression.class),
+        psiElement().inside(PsiThisExpression.class),
+        psiElement().inside(PsiSuperExpression.class)
+        ),
            new CompletionProvider<CompletionParameters>(true, false) {
              public void addCompletions(@NotNull final CompletionParameters params, final ProcessingContext matchingContext, @NotNull final CompletionResultSet result) {
                final PsiElement position = params.getPosition();
