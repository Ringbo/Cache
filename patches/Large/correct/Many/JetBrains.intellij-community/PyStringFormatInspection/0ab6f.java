diff --git a/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java b/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
index a2de9d8..54a6e577 100644
--- a/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
@@ -114,7 +114,7 @@
             final PyType rightType = myTypeEvalContext.getType(rightExpression);
             if (rightType instanceof PyTupleType) {
               final PyTupleType tupleType = (PyTupleType)rightType;
-              for (int i = 0; i <= tupleType.getElementCount(); i += 1) {
+              for (int i = 0; i < tupleType.getElementCount(); i++) {
                 final PyType elementType = tupleType.getElementType(i);
                 if (elementType != null) {
                   final String typeName = myFormatSpec.get(String.valueOf(i + 1));
