diff --git a/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java b/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
index 4ca2600..f4c3e28 100644
--- a/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
@@ -383,7 +383,7 @@
         boolean marked_qualified = false;
         if (element instanceof PyQualifiedExpression) {
           final PyQualifiedExpression qexpr = (PyQualifiedExpression)element;
-          if (PyNames.COMPARISON_OPERATORS.contains(qexpr.getReferencedName())) {
+          if (myIgnoredIdentifiers.contains(ref_text) || PyNames.COMPARISON_OPERATORS.contains(qexpr.getReferencedName())) {
             return;
           }
           final PyExpression qualifier = qexpr.getQualifier();
