diff --git a/python/src/com/jetbrains/python/inspections/PyUnnecessaryBackslashInspection.java b/python/src/com/jetbrains/python/inspections/PyUnnecessaryBackslashInspection.java
index e218eb6..4ca403b 100644
--- a/python/src/com/jetbrains/python/inspections/PyUnnecessaryBackslashInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyUnnecessaryBackslashInspection.java
@@ -86,7 +86,8 @@
     public void visitPyStringLiteralExpression(final PyStringLiteralExpression stringLiteralExpression) {
       PsiElement parent = stringLiteralExpression.getParent();
       if (parent instanceof PyListLiteralExpression || parent instanceof PyParenthesizedExpression ||
-          parent instanceof PySetLiteralExpression || parent instanceof PyKeyValueExpression) {
+          parent instanceof PySetLiteralExpression || parent instanceof PyKeyValueExpression ||
+          parent instanceof PyNamedParameter || parent instanceof PyArgumentList) {
         findProblem(stringLiteralExpression);
       }
     }
