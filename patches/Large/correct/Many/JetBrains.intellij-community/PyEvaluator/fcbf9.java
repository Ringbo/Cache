diff --git a/python/src/com/jetbrains/python/psi/impl/PyEvaluator.java b/python/src/com/jetbrains/python/psi/impl/PyEvaluator.java
index 23431cb..79e2b62 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyEvaluator.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyEvaluator.java
@@ -104,11 +104,11 @@
   @Nullable
   private static Boolean getBooleanExpression(@NotNull final PyExpression expression) {
     final boolean py3K = LanguageLevel.forElement(expression).isPy3K();
-    if ((py3K && (expression instanceof PyBoolLiteralExpression))) {
-      return ((PyBoolLiteralExpression)expression).getValue(); // Cool in Py2K
+    if ((expression instanceof PyBoolLiteralExpression)) {
+      return ((PyBoolLiteralExpression)expression).getValue();
     }
     if ((!py3K && (expression instanceof PyReferenceExpression))) {
-      final String text = ((PyReferenceExpression)expression).getReferencedName(); // Ref in Python2
+      final String text = ((PyQualifiedExpression)expression).getReferencedName(); // Ref in Python2
       if (PyNames.TRUE.equals(text)) {
         return true;
       }
