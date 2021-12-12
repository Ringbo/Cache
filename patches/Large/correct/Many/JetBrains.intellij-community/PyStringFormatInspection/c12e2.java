diff --git a/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java b/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
index 1e012cf..17638d5 100644
--- a/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
@@ -121,7 +121,7 @@
           if (PyNames.DICT.equals(rightExpression.getName())) return -1;
 
           final PsiElement pyElement = ((PyReferenceExpression)rightExpression).followAssignmentsChain(resolveContext).getElement();
-          if (!(pyElement instanceof PyExpression)) {
+          if (pyElement == rightExpression || !(pyElement instanceof PyExpression)) {
             return -1;
           }
           if (pyElement instanceof PyDictLiteralExpression) {
