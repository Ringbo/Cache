diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/DetailNodeTreeStringPrinter.java b/src/main/java/com/puppycrawl/tools/checkstyle/DetailNodeTreeStringPrinter.java
index 81d2a3d..515ed5c 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/DetailNodeTreeStringPrinter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/DetailNodeTreeStringPrinter.java
@@ -108,7 +108,7 @@
      * @return string AST.
      */
     public static String printTree(DetailNode ast, String rootPrefix, String prefix) {
-        final StringBuilder messageBuilder = new StringBuilder();
+        final StringBuilder messageBuilder = new StringBuilder(1024);
         DetailNode node = ast;
         while (node != null) {
             if (node.getType() == JavadocTokenTypes.JAVADOC) {
@@ -136,7 +136,7 @@
     private static String getIndentation(DetailNode node) {
         final boolean isLastChild = JavadocUtils.getNextSibling(node) == null;
         DetailNode currentNode = node;
-        final StringBuilder indentation = new StringBuilder();
+        final StringBuilder indentation = new StringBuilder(1024);
         while (currentNode.getParent() != null) {
             currentNode = currentNode.getParent();
             if (currentNode.getParent() == null) {
