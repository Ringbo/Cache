diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeModel.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeModel.java
index b26781a..41c629f 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeModel.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeModel.java
@@ -49,7 +49,7 @@
         return (DetailAST) factory.create(TokenTypes.EOF, "ROOT");
     }
 
-    void setParseTree(DetailAST parseTree) {
+    final void setParseTree(DetailAST parseTree) {
         final DetailAST root = (DetailAST) getRoot();
         root.setFirstChild(parseTree);
         final Object[] path = {root};
