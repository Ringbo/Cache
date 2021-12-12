diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/AstTreeStringPrinter.java b/src/main/java/com/puppycrawl/tools/checkstyle/AstTreeStringPrinter.java
index ebc63bb..2a97a8f 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/AstTreeStringPrinter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/AstTreeStringPrinter.java
@@ -88,7 +88,7 @@
      * @return Full tree
      */
     private static String printJavaAndJavadocTree(DetailAST ast) {
-        final StringBuilder messageBuilder = new StringBuilder();
+        final StringBuilder messageBuilder = new StringBuilder(1024);
         DetailAST node = ast;
         while (node != null) {
             messageBuilder.append(getIndentation(node))
@@ -140,7 +140,7 @@
      * @return string AST.
      */
     private static String printTree(DetailAST ast) {
-        final StringBuilder messageBuilder = new StringBuilder();
+        final StringBuilder messageBuilder = new StringBuilder(1024);
         DetailAST node = ast;
         while (node != null) {
             messageBuilder.append(getIndentation(node))
@@ -172,7 +172,7 @@
     private static String getIndentation(DetailAST ast) {
         final boolean isLastChild = ast.getNextSibling() == null;
         DetailAST node = ast;
-        final StringBuilder indentation = new StringBuilder();
+        final StringBuilder indentation = new StringBuilder(1024);
         while (node.getParent() != null) {
             node = node.getParent();
             if (node.getParent() == null) {
