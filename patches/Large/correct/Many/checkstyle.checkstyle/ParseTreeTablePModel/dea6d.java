diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTablePModel.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTablePModel.java
index cc181c5..feb0910 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTablePModel.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTablePModel.java
@@ -64,7 +64,7 @@
      * Set parse tree.
      * @param parseTree DetailAST parse tree.
      */
-    final void setParseTree(DetailAST parseTree) {
+    protected final void setParseTree(DetailAST parseTree) {
         ((AST) root).setFirstChild(parseTree);
     }
 
