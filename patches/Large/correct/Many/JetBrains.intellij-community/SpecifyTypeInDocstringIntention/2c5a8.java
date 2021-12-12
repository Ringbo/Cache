diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
index 7eacd6c..8c0a9d8 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInDocstringIntention.java
@@ -58,7 +58,7 @@
         || PsiTreeUtil.getParentOfType(problemElement, PyLambdaExpression.class) != null) {
       return false;
     }
-    final PyType type = problemElement.getType(TypeEvalContext.fast());
+    final PyType type = problemElement.getType(TypeEvalContext.slow());
     if (type == null || type instanceof PyReturnTypeReference) {
       PyFunction pyFunction = PsiTreeUtil.getParentOfType(problemElement, PyFunction.class);
       PsiReference reference = problemElement.getReference();
