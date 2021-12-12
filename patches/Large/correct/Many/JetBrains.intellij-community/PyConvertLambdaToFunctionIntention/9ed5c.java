diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/PyConvertLambdaToFunctionIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/PyConvertLambdaToFunctionIntention.java
index 036a9c5..58a8c85 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/PyConvertLambdaToFunctionIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/PyConvertLambdaToFunctionIntention.java
@@ -84,7 +84,7 @@
         parent.delete();
       }
       else {
-        PyElement parentScope = PsiTreeUtil.getParentOfType(lambdaExpression, PyClass.class, PyFile.class);
+        PsiFile parentScope = lambdaExpression.getContainingFile();
         final TemplateBuilder builder = TemplateBuilderFactory.getInstance().createTemplateBuilder(parentScope);
         PsiElement functionName = function.getNameIdentifier();
         functionName = CodeInsightUtilBase.forcePsiPostprocessAndRestoreElement(functionName);
