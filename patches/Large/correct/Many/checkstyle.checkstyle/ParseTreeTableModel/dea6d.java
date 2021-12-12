diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTableModel.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTableModel.java
index 812243a..87867a9 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTableModel.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTableModel.java
@@ -53,7 +53,7 @@
      * Sets parse tree.
      * @param parseTree DetailAST parse tree.
      */
-    final void setParseTree(DetailAST parseTree) {
+    protected final void setParseTree(DetailAST parseTree) {
         pModel.setParseTree(parseTree);
         final Object[] path = {pModel.getRoot()};
         // no need to setup remaining info, as the call results in a
@@ -146,7 +146,7 @@
      * @param children An array of Object containing the inserted, removed, or changed objects.
      * @see EventListenerList
      */
-    final void fireTreeStructureChanged(Object source, Object[] path,
+    private void fireTreeStructureChanged(Object source, Object[] path,
                                   int[] childIndices,
                                   Object... children) {
         // Guaranteed to return a non-null array
