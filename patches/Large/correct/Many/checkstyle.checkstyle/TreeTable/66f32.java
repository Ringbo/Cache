diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/TreeTable.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/TreeTable.java
index e72d771..971c521 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/TreeTable.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/TreeTable.java
@@ -54,7 +54,7 @@
  * @author Lars Kühne
  * @noinspection ThisEscapedInObjectConstruction
  */
-public class TreeTable extends JTable {
+public final class TreeTable extends JTable {
 
     private static final long serialVersionUID = -8493693409423365387L;
     /** A subclass of JTree. */
@@ -207,7 +207,7 @@
      * Overridden to pass the new rowHeight to the tree.
      */
     @Override
-    public final void setRowHeight(int newRowHeight) {
+    public void setRowHeight(int newRowHeight) {
         super.setRowHeight(newRowHeight);
         if (tree != null && tree.getRowHeight() != newRowHeight) {
             tree.setRowHeight(getRowHeight());
