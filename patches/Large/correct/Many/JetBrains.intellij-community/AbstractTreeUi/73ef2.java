diff --git a/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java b/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
index 6e86599..3453c92 100644
--- a/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
+++ b/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
@@ -1017,7 +1017,7 @@
     invokeLaterIfNeeded(new Runnable() {
       @Override
       public void run() {
-        if (row >= getTree().getVisibleRowCount()) return;
+        if (row >= getTree().getRowCount()) return;
 
         TreePath path = getTree().getPathForRow(row);
         if (path != null) {
