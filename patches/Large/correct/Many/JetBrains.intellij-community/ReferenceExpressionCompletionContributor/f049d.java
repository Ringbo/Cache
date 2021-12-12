diff --git a/codeInsight/impl/com/intellij/codeInsight/completion/ReferenceExpressionCompletionContributor.java b/codeInsight/impl/com/intellij/codeInsight/completion/ReferenceExpressionCompletionContributor.java
index 054f86a..7973356 100644
--- a/codeInsight/impl/com/intellij/codeInsight/completion/ReferenceExpressionCompletionContributor.java
+++ b/codeInsight/impl/com/intellij/codeInsight/completion/ReferenceExpressionCompletionContributor.java
@@ -315,7 +315,7 @@
                                              final PsiType expectedType) throws IncorrectOperationException {
     final PsiElementFactory elementFactory = JavaPsiFacade.getInstance(place.getProject()).getElementFactory();
     final JavaCodeFragment block = elementFactory.createCodeBlockCodeFragment(qualifierType.getCanonicalText() + " xxx;xxx.xxx;", place, false);
-    final PsiExpressionStatement expressionStatement = (PsiExpressionStatement)block.getChildren()[2];
+    final PsiExpressionStatement expressionStatement = (PsiExpressionStatement)block.getChildren()[1];
     final PsiReferenceExpression mockRef = (PsiReferenceExpression) expressionStatement.getExpression();
 
     final ElementFilter filter = getReferenceFilter(place, true, true);
