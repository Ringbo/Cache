diff --git a/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java b/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
index 50fc6d8..859c891 100644
--- a/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
+++ b/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
@@ -1540,7 +1540,7 @@
   public List<Object> getLoadedChildrenFor(Object element) {
     List<Object> result = new ArrayList<Object>();
 
-    DefaultMutableTreeNode node = (DefaultMutableTreeNode)findNodeByElement(element);
+    DefaultMutableTreeNode node = (DefaultMutableTreeNode)getNodeForElement(element, false);
     if (node != null) {
       for (int i = 0; i < node.getChildCount(); i++) {
         TreeNode each = node.getChildAt(i);
