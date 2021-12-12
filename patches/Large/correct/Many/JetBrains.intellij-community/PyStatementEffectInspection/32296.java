diff --git a/python/src/com/jetbrains/python/inspections/PyStatementEffectInspection.java b/python/src/com/jetbrains/python/inspections/PyStatementEffectInspection.java
index c588732..e85560c 100644
--- a/python/src/com/jetbrains/python/inspections/PyStatementEffectInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyStatementEffectInspection.java
@@ -74,7 +74,7 @@
     private boolean checkStringLiteral(PyExpression expression) {
       if (expression instanceof PyStringLiteralExpression) {
         PyDocStringOwner parent = PsiTreeUtil.getParentOfType(expression, PyFunction.class, PyClass.class);
-        if (parent != null) {
+        if (parent != null && parent.getDocStringExpression() == null) {
           registerProblem(expression, "Docstring seems to be misplaced",
                       new StatementEffectDocstringQuickFix());
           return true;
