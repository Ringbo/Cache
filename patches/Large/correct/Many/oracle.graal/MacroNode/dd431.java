diff --git a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/nodes/MacroNode.java b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/nodes/MacroNode.java
index 5b7533a..3497a64 100644
--- a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/nodes/MacroNode.java
+++ b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/nodes/MacroNode.java
@@ -87,7 +87,7 @@
     protected StructuredGraph getLoweredSubstitutionGraph(LoweringTool tool) {
         StructuredGraph methodSubstitution = tool.getReplacements().getMethodSubstitution(getTargetMethod());
         if (methodSubstitution != null) {
-            if (stateAfter() == null) {
+            if (stateAfter() == null || stateAfter().bci == FrameState.AFTER_BCI) {
                 /*
                  * handles the case of a MacroNode inside a snippet used for another MacroNode
                  * lowering
