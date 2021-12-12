diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/whitespace/NoWhitespaceBeforeCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/whitespace/NoWhitespaceBeforeCheck.java
index f1d1fac..da57e0d 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/whitespace/NoWhitespaceBeforeCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/whitespace/NoWhitespaceBeforeCheck.java
@@ -121,7 +121,7 @@
      * @param semicolonAst DetailAST of semicolon.
      * @return true if semicolon is in empty for initializer.
      */
-    private boolean isInEmptyForInitializer(DetailAST semicolonAst) {
+    private static boolean isInEmptyForInitializer(DetailAST semicolonAst) {
         boolean result = false;
         if (semicolonAst.getType() == TokenTypes.SEMI) {
             final DetailAST sibling = semicolonAst.getPreviousSibling();
