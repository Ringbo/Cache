diff --git a/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java b/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
index 2f12096..2d27e67 100644
--- a/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
@@ -263,7 +263,7 @@
         final PyKeyValueExpression[] expressions = ((PyDictLiteralExpression)pyElement).getElements();
         if (myUsedMappingKeys.isEmpty()) {
           if (myExpectedArguments > 0) {
-            if (myExpectedArguments == (expressions.length + additionalExpressions.size())) {
+            if (myExpectedArguments > 1 && myExpectedArguments == (expressions.length + additionalExpressions.size())) {
               // probably "%s %s" % {'a':1, 'b':2}, with names forgotten in template
               registerProblem(rightExpression, PyBundle.message("INSP.format.requires.no.mapping"));
             }
