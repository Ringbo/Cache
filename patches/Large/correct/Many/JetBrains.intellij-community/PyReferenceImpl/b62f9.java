diff --git a/python/src/com/jetbrains/python/psi/impl/PyReferenceImpl.java b/python/src/com/jetbrains/python/psi/impl/PyReferenceImpl.java
index 36e8c57..e14db7d 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyReferenceImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyReferenceImpl.java
@@ -183,7 +183,7 @@
       //add possible inferred types
       if ((uexpr instanceof PyTargetExpression || uexpr instanceof PyNamedParameter) && myElement != null) {
         final ScopeOwner scopeOwner = PsiTreeUtil.getParentOfType(myElement, ScopeOwner.class);
-        if (scopeOwner != null && scopeOwner == PsiTreeUtil.getParentOfType(uexpr, ScopeOwner.class)) {
+        if (scopeOwner != null && scopeOwner == PsiTreeUtil.getStubOrPsiParentOfType(uexpr, ScopeOwner.class)) {
           PyAugAssignmentStatement augAssignment = PsiTreeUtil.getParentOfType(myElement, PyAugAssignmentStatement.class);
           try {
             final PyElement[] defs = PyDefUseUtil.getLatestDefs(scopeOwner, (PyElement)uexpr,
