diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/JTreeTable.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/JTreeTable.java
index 2cac5f8..b472bd4 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/JTreeTable.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/JTreeTable.java
@@ -202,7 +202,7 @@
      * Overridden to pass the new rowHeight to the tree.
      */
     @Override
-    public void setRowHeight(int newRowHeight) {
+    public final void setRowHeight(int newRowHeight) {
         super.setRowHeight(newRowHeight);
         if (tree != null && tree.getRowHeight() != newRowHeight) {
             tree.setRowHeight(getRowHeight());
@@ -393,7 +393,7 @@
          *
          * @return the list selection model
          */
-        ListSelectionModel getListSelectionModel() {
+        final ListSelectionModel getListSelectionModel() {
             return listSelectionModel;
         }
 
