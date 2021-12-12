diff --git a/java/java-impl/src/com/intellij/refactoring/rename/RenameJavaMethodProcessor.java b/java/java-impl/src/com/intellij/refactoring/rename/RenameJavaMethodProcessor.java
index a6928d4..c410d76 100644
--- a/java/java-impl/src/com/intellij/refactoring/rename/RenameJavaMethodProcessor.java
+++ b/java/java-impl/src/com/intellij/refactoring/rename/RenameJavaMethodProcessor.java
@@ -210,7 +210,7 @@
           if (element instanceof PsiReferenceExpression) {
             if (((PsiReferenceExpression)element).resolve() == methodToRename) {
               final PsiElement parent = element.getParent();
-              LOG.assertTrue(parent instanceof PsiMethodReferenceExpression, parent.getText());
+              LOG.assertTrue(parent instanceof PsiMethodCallExpression, parent.getText());
               final PsiMethodCallExpression copy = (PsiMethodCallExpression)JavaPsiFacade.getElementFactory(element.getProject())
                 .createExpressionFromText(parent.getText(), element);
               final PsiReferenceExpression expression = (PsiReferenceExpression)processRef(copy.getMethodExpression(), newName);
