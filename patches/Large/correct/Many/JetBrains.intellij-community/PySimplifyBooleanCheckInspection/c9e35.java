diff --git a/python/src/com/jetbrains/python/inspections/PySimplifyBooleanCheckInspection.java b/python/src/com/jetbrains/python/inspections/PySimplifyBooleanCheckInspection.java
index f54140d..2a8fe7a 100644
--- a/python/src/com/jetbrains/python/inspections/PySimplifyBooleanCheckInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PySimplifyBooleanCheckInspection.java
@@ -58,7 +58,8 @@
       super.visitPyBinaryExpression(node);
       final PyElementType operator = node.getOperator();
       final PyExpression rightExpression = node.getRightExpression();
-      if (rightExpression == null) {
+      if (rightExpression == null || rightExpression instanceof PyBinaryExpression ||
+          node.getLeftExpression() instanceof PyBinaryExpression) {
         return;
       }
       final String leftExpressionText = node.getLeftExpression().getText();
