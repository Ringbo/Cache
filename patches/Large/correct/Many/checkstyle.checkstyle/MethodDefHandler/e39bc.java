diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/MethodDefHandler.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/MethodDefHandler.java
index 0763a29..4a895fa 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/MethodDefHandler.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/MethodDefHandler.java
@@ -79,7 +79,7 @@
      *            The method definition ast.
      * @return The start column position of the method.
      */
-    private int getMethodDefLineStart(DetailAST mainAst) {
+    private static int getMethodDefLineStart(DetailAST mainAst) {
         // get first type position
         int lineStart = mainAst.findFirstToken(TokenTypes.IDENT).getLineNo();
 
