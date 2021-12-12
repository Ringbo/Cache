diff --git a/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java b/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
index eb7ebae..529cb8f 100644
--- a/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyStringFormatInspection.java
@@ -237,7 +237,7 @@
           if (myExpectedArguments > 0) {
             if (myExpectedArguments == (expressions.length + additionalExpressions.size())) {
               // probably "%s %s" % {'a':1, 'b':2}, with names forgotten in template
-              registerProblem(pyElement, PyBundle.message("INSP.format.requires.no.mapping"));
+              registerProblem(rightExpression, PyBundle.message("INSP.format.requires.no.mapping"));
             }
             else {
               // "braces: %s" % {'foo':1} gives "braces: {'foo':1}", implicit str() kicks in
