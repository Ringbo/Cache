diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/BaseProjectTreeBuilder.java b/platform/lang-impl/src/com/intellij/ide/projectView/BaseProjectTreeBuilder.java
index 417d402..c08e2e8 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/BaseProjectTreeBuilder.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/BaseProjectTreeBuilder.java
@@ -144,7 +144,7 @@
       TreeNode childAt = node.getChildAt(i);
       DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)childAt;
       if (defaultMutableTreeNode.getUserObject() instanceof AbstractTreeNode) {
-        ProjectViewNode treeNode = (ProjectViewNode)defaultMutableTreeNode.getUserObject();
+        AbstractTreeNode treeNode = (AbstractTreeNode)defaultMutableTreeNode.getUserObject();
         result.add(treeNode);
       }
       else if (defaultMutableTreeNode.getUserObject() instanceof FavoritesTreeNodeDescriptor) {
