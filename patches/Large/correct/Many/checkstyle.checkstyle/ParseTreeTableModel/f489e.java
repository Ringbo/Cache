diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTableModel.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTableModel.java
index 523b1a2..47f4ae1 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTableModel.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/ParseTreeTableModel.java
@@ -222,7 +222,7 @@
      * @param children An array of Object containing the inserted, removed, or changed objects.
      * @see EventListenerList
      */
-    void fireTreeStructureChanged(Object source, Object[] path,
+    final void fireTreeStructureChanged(Object source, Object[] path,
                                   int[] childIndices,
                                   Object... children) {
         // Guaranteed to return a non-null array
