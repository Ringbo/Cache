diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/ExecutableStatementCountCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/ExecutableStatementCountCheck.java
index 448f6ef..62e606b 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/ExecutableStatementCountCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/sizes/ExecutableStatementCountCheck.java
@@ -203,7 +203,7 @@
          * Creates new member context.
          * @param ast member AST node.
          */
-        public Context(DetailAST ast) {
+        Context(DetailAST ast) {
             this.ast = ast;
             count = 0;
         }
