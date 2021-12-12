diff --git a/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java b/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
index 99f920a..8e9c71a 100644
--- a/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
@@ -48,7 +48,8 @@
           leftExpression = tmp;
         }
         if (PyTokenTypes.ADDITIVE_OPERATIONS.contains(expression.getOperator()) ||
-              PyTokenTypes.MULTIPLICATIVE_OPERATIONS.contains(expression.getOperator())) {
+              PyTokenTypes.MULTIPLICATIVE_OPERATIONS.contains(expression.getOperator()) ||
+                PyTokenTypes.SHIFT_OPERATIONS.contains(expression.getOperator())) {
           if (leftExpression != null
               && (leftExpression instanceof PyReferenceExpression || leftExpression instanceof PySubscriptionExpression)) {
             if (leftExpression.getText().equals(target.getText())) {
