diff --git a/python/src/com/jetbrains/python/inspections/quickfix/PyUpdatePropertySignatureQuickFix.java b/python/src/com/jetbrains/python/inspections/quickfix/PyUpdatePropertySignatureQuickFix.java
index 11c5987..a02a02a 100644
--- a/python/src/com/jetbrains/python/inspections/quickfix/PyUpdatePropertySignatureQuickFix.java
+++ b/python/src/com/jetbrains/python/inspections/quickfix/PyUpdatePropertySignatureQuickFix.java
@@ -46,7 +46,7 @@
   @Override
   public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor descriptor) {
     final PsiElement element = descriptor.getPsiElement();
-    final PyFunction function = PsiTreeUtil.getParentOfType(element, PyFunction.class, false);
+    final Callable function = PsiTreeUtil.getParentOfType(element, Callable.class, false);
     assert function != null;
     final PyParameterList parameterList = function.getParameterList();
     final PyParameter[] parameters = parameterList.getParameters();
