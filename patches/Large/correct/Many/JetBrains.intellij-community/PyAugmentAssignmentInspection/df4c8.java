diff --git a/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java b/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
index 5a2985d..69563a6 100644
--- a/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
@@ -46,7 +46,7 @@
         if (PyTokenTypes.ADDITIVE_OPERATIONS.contains(expression.getOperator()) ||
               PyTokenTypes.MULTIPLICATIVE_OPERATIONS.contains(expression.getOperator())) {
           if (leftExpression != null && leftExpression instanceof PyReferenceExpression) {
-            if (leftExpression.getName().equals(target.getName())) {
+            if (leftExpression.getText().equals(target.getText())) {
               if (rightExpression instanceof PyNumericLiteralExpression) {
                 PyElementType op = expression.getOperator();
                 if (op == PyTokenTypes.PLUS || op == PyTokenTypes.MINUS ||
