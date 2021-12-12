diff --git a/codeInsight/impl/com/intellij/codeInsight/completion/JavaCompletionContributor.java b/codeInsight/impl/com/intellij/codeInsight/completion/JavaCompletionContributor.java
index 2e5f5b4..52c9048 100644
--- a/codeInsight/impl/com/intellij/codeInsight/completion/JavaCompletionContributor.java
+++ b/codeInsight/impl/com/intellij/codeInsight/completion/JavaCompletionContributor.java
@@ -77,7 +77,7 @@
   @Nullable 
   private static ElementFilter getReferenceFilter(PsiElement position) {
     // Completion after extends in interface, type parameter and implements in class
-    final PsiClass containingClass = PsiTreeUtil.getParentOfType(position, PsiClass.class, false, PsiCodeBlock.class, PsiMethod.class);
+    final PsiClass containingClass = PsiTreeUtil.getParentOfType(position, PsiClass.class, false, PsiCodeBlock.class, PsiMethod.class, PsiExpressionList.class);
     if (containingClass != null && psiElement().afterLeaf(PsiKeyword.EXTENDS, PsiKeyword.IMPLEMENTS, ",", "&").accepts(position)) {
       return new AndFilter(new ClassFilter(PsiClass.class), new NotFilter(new AssignableFromContextFilter()));
     }
