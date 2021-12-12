diff --git a/src/checkstyle/com/puppycrawl/tools/checkstyle/api/DetailAST.java b/src/checkstyle/com/puppycrawl/tools/checkstyle/api/DetailAST.java
index 1da77ef..d3748e3 100644
--- a/src/checkstyle/com/puppycrawl/tools/checkstyle/api/DetailAST.java
+++ b/src/checkstyle/com/puppycrawl/tools/checkstyle/api/DetailAST.java
@@ -172,7 +172,7 @@
     public DetailAST getLastChild()
     {
         AST ast = getFirstChild();
-        while (ast.getNextSibling() != null) {
+        while (ast != null && ast.getNextSibling() != null) {
             ast = ast.getNextSibling();
         }
         return (DetailAST) ast;
