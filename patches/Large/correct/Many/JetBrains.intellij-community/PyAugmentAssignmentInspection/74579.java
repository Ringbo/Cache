diff --git a/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java b/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
index da8d37f..3eaabb6 100644
--- a/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
@@ -50,7 +50,9 @@
         PyElementType op = expression.getOperator();
         if (PyTokenTypes.ADDITIVE_OPERATIONS.contains(op) ||
               PyTokenTypes.MULTIPLICATIVE_OPERATIONS.contains(op) ||
-                PyTokenTypes.SHIFT_OPERATIONS.contains(op)) {
+                PyTokenTypes.SHIFT_OPERATIONS.contains(op) ||
+                PyTokenTypes.BITWISE_OPERATIONS.contains(op) ||
+                op == PyTokenTypes.EXP) {
           if (leftExpression != null
               && (leftExpression instanceof PyReferenceExpression || leftExpression instanceof PySubscriptionExpression)) {
             if (leftExpression.getText().equals(target.getText())) {
