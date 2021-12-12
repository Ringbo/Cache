diff --git a/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java b/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
index 1f1fb92..16b4c54 100644
--- a/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
+++ b/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
@@ -4082,7 +4082,7 @@
         int row = getRowIfUnderSelection(element);
         if (row == -1) row = myTree.getRowForPath(new TreePath(node.getPath()));
         int top = row - 2;
-        int bottom = row - 2;
+        int bottom = row + 2;
         if (canBeCentered && Registry.is("ide.tree.autoscrollToVCenter")) {
           int count = TreeUtil.getVisibleRowCount(myTree) - 1;
           top = count > 0 ? row - count / 2 : row;
