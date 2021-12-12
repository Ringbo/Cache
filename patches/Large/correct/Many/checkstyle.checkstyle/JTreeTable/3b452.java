diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/gui/JTreeTable.java b/src/main/java/com/puppycrawl/tools/checkstyle/gui/JTreeTable.java
index a7e14a0..8cf55f7 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/gui/JTreeTable.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/gui/JTreeTable.java
@@ -195,7 +195,7 @@
         private int visibleRow;
 
         /** Creates a new instance */
-        public TreeTableCellRenderer(TreeModel model) {
+        TreeTableCellRenderer(TreeModel model) {
             super(model);
         }
 
