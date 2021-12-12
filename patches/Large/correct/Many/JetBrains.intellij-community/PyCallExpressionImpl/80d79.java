diff --git a/python/src/com/jetbrains/python/psi/impl/PyCallExpressionImpl.java b/python/src/com/jetbrains/python/psi/impl/PyCallExpressionImpl.java
index 6fdf5dd..1a71e90 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyCallExpressionImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyCallExpressionImpl.java
@@ -148,7 +148,7 @@
     PyExpression callee = getCallee();
     if (callee instanceof PyReferenceExpression) {
       ResolveResult[] targets = ((PyReferenceExpression)callee).multiResolve(false);
-      if (targets.length == 0) {
+      if (targets.length > 0) {
         PsiElement target = targets[0].getElement();
         if (target instanceof PyClass) {
           return new PyClassType((PyClass) target, false); // we call a class name, that is, the constructor, we get an instance.
