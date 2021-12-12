diff --git a/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java b/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
index 873a296..0876e2e 100644
--- a/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyAugmentAssignmentInspection.java
@@ -70,7 +70,7 @@
                                                     PyTokenTypes.FLOORDIV, PyTokenTypes.DIV, PyTokenTypes.PERC, PyTokenTypes.AND,
                                                     PyTokenTypes.OR, PyTokenTypes.XOR, PyTokenTypes.LTLT, PyTokenTypes.GTGT,
                                                     PyTokenTypes.EXP);
-        final TokenSet commutativeOperations = TokenSet.create(PyTokenTypes.PLUS, PyTokenTypes.MULT);
+        final TokenSet commutativeOperations = TokenSet.create(PyTokenTypes.PLUS, PyTokenTypes.MULT, PyTokenTypes.OR, PyTokenTypes.AND);
         if ((operations.contains(op) && !changedParts) || (changedParts && commutativeOperations.contains(op))) {
           if (leftExpression.getText().equals(targetText) && (leftExpression instanceof PyReferenceExpression || leftExpression instanceof PySubscriptionExpression)) {
             final PyType type = myTypeEvalContext.getType(rightExpression);
