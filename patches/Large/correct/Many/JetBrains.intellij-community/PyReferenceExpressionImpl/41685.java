diff --git a/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java b/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
index 5e38a06..155a72d 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
@@ -433,7 +433,7 @@
       if (callee instanceof PyReferenceExpression) {
         PsiElement def = ((PyReferenceExpression)callee).resolve();
         if (def instanceof PyFunction) {
-          ((PyFunction)def).getParameterList().accept(
+          ((PyFunction)def).getParameterList().acceptChildren(
             new PyElementVisitor() {
               @Override
               public void visitPyParameter(PyParameter par) {
