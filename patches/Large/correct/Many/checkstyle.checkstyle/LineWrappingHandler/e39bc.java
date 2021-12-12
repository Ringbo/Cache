diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/LineWrappingHandler.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/LineWrappingHandler.java
index c02fbb7..9ee72d8 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/LineWrappingHandler.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/LineWrappingHandler.java
@@ -251,7 +251,7 @@
      * @return true if all the nodes up to the last annotation node are end of scope nodes
      *         false otherwise
      */
-    private boolean isEndOfScope(final DetailAST lastAnnotationNode, final DetailAST node) {
+    private static boolean isEndOfScope(final DetailAST lastAnnotationNode, final DetailAST node) {
         DetailAST checkNode = node;
         boolean endOfScope = true;
         while (endOfScope && !checkNode.equals(lastAnnotationNode)) {
