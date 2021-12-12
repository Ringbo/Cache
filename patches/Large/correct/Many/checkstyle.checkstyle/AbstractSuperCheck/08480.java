diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/AbstractSuperCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/AbstractSuperCheck.java
index 5a0cfac..807bcc5 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/AbstractSuperCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/AbstractSuperCheck.java
@@ -173,7 +173,7 @@
      * @param methodCallDotAst DOT DetailAST
      * @return true if any parameters found
      */
-    private boolean hasArguments(DetailAST methodCallDotAst) {
+    private static boolean hasArguments(DetailAST methodCallDotAst) {
         final DetailAST argumentsList = methodCallDotAst.getNextSibling();
         return argumentsList.getChildCount() > 0;
     }
