diff --git a/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java b/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
index cd506d2..11d09fb 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyReferenceExpressionImpl.java
@@ -237,7 +237,7 @@
     }
     if (target instanceof PyTargetExpression && context.allowDataFlow() && anchor != null) {
       final ScopeOwner scopeOwner = PsiTreeUtil.getParentOfType(anchor, ScopeOwner.class);
-      if (scopeOwner != null) {
+      if (scopeOwner != null && scopeOwner == PsiTreeUtil.getParentOfType(target, ScopeOwner.class)) {
         final PyElement[] defs = PyDefUseUtil.getLatestDefs(scopeOwner, (PyTargetExpression) target, anchor);
         if (defs.length > 0) {
           PyType type = getTypeIfExpr(defs [0], context);
