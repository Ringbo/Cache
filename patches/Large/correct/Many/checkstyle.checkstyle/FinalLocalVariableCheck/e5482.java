diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/FinalLocalVariableCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/FinalLocalVariableCheck.java
index fa2cf38..93082d7 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/FinalLocalVariableCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/FinalLocalVariableCheck.java
@@ -303,7 +303,7 @@
      * @param ast the variable ast.
      * @return true, if the variable should be removed.
      */
-    private boolean shouldRemoveVariable(ScopeData scopeData, DetailAST ast) {
+    private static boolean shouldRemoveVariable(ScopeData scopeData, DetailAST ast) {
         boolean shouldRemove = true;
         for (DetailAST variable : scopeData.uninitializedVariables) {
             if (variable.getText().equals(ast.getText())) {
