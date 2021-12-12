diff --git a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptTypeChecker.java b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptTypeChecker.java
index 5072914..e9d2724 100644
--- a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptTypeChecker.java
+++ b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptTypeChecker.java
@@ -61,7 +61,7 @@
     final JSType type = p.getType();
     Pair<Annotation, String> annotationAndExprType =
       checkExpressionIsAssignableToType(expr, type, problemKey,
-                                        allowChangeVariableTypeFix ? p : null);
+                                        allowChangeVariableTypeFix ? p : null, true);
 
     if (annotationAndExprType != null &&
         p.getParent() instanceof JSParameterList &&
