diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/FinalLocalVariableCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/FinalLocalVariableCheck.java
index eab700d..4135916 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/FinalLocalVariableCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/FinalLocalVariableCheck.java
@@ -521,7 +521,7 @@
      * @param parameterDefAst parameter definition
      * @return true if it is a multiple type catch, false otherwise
      */
-    private boolean isMultipleTypeCatch(DetailAST parameterDefAst) {
+    private static boolean isMultipleTypeCatch(DetailAST parameterDefAst) {
         final DetailAST typeAst = parameterDefAst.findFirstToken(TokenTypes.TYPE);
         return typeAst.getFirstChild().getType() == TokenTypes.BOR;
     }
