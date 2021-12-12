diff --git a/python/src/com/jetbrains/python/inspections/PyUnboundLocalVariableInspection.java b/python/src/com/jetbrains/python/inspections/PyUnboundLocalVariableInspection.java
index c84e451..a29ea80 100644
--- a/python/src/com/jetbrains/python/inspections/PyUnboundLocalVariableInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyUnboundLocalVariableInspection.java
@@ -110,7 +110,8 @@
           }
         }
         if (owner instanceof PyFile) {
-          if (isBuiltin) {
+          // Ignore builtins and variables that are not named elements, i. e. are defined by name definers
+          if (isBuiltin || scope.getNamedElement(name) == null) {
             return;
           }
           registerProblem(node, PyBundle.message("INSP.unbound.name.not.defined", name));
