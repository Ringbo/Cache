diff --git a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
index 0478a81..f110741 100644
--- a/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
+++ b/python/src/com/jetbrains/python/codeInsight/intentions/SpecifyTypeInPy3AnnotationsIntention.java
@@ -57,7 +57,7 @@
         || PsiTreeUtil.getParentOfType(problemElement, PyLambdaExpression.class) != null) {
       return false;
     }
-    final PyType type = problemElement.getType(TypeEvalContext.fast());
+    final PyType type = problemElement.getType(TypeEvalContext.slow());
     if (type == null || type instanceof PyReturnTypeReference) {
       PyFunction pyFunction = PsiTreeUtil.getParentOfType(problemElement, PyFunction.class);
       PsiReference reference = problemElement.getReference();
