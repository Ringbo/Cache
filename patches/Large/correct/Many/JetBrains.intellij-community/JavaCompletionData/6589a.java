diff --git a/codeInsight/impl/com/intellij/codeInsight/completion/JavaCompletionData.java b/codeInsight/impl/com/intellij/codeInsight/completion/JavaCompletionData.java
index f0e850b..a00385c 100644
--- a/codeInsight/impl/com/intellij/codeInsight/completion/JavaCompletionData.java
+++ b/codeInsight/impl/com/intellij/codeInsight/completion/JavaCompletionData.java
@@ -394,7 +394,7 @@
     }
 
     {
-// Keyword completion in returns
+// Keyword completion in returns  !!!!
       final CompletionVariant variant = new CompletionVariant(PsiMethod.class, new LeftNeighbour(new TextFilter(PsiKeyword.RETURN)));
       variant.addCompletion(PsiKeyword.THIS, TailType.NONE);
       variant.addCompletion(PsiKeyword.SUPER, TailType.NONE);
@@ -611,14 +611,14 @@
     }
 
     {
-      // null completion
+      // null completion !!!!!!
       final CompletionVariant variant = new CompletionVariant(and(
           psiElement().inside(or(
               psiElement(PsiExpressionList.class),
               psiElement(PsiExpression.class).withParent(or(psiElement(PsiIfStatement.class), psiElement(PsiLocalVariable.class))),
               psiElement(PsiAssignmentExpression.class))
           ),
-          not(psiElement().afterLeaf(".")),
+          not(psiElement().afterLeaf(".", PsiKeyword.RETURN)),
           not(psiElement().withParent(psiElement(PsiReferenceExpression.class).withParent(PsiTypeCastExpression.class)))
       ));
       variant.addCompletion(PsiKeyword.NULL, TailType.NONE);
