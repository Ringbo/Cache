diff --git a/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java b/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
index 2084a93..9ddad92 100644
--- a/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
+++ b/platform/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
@@ -1008,7 +1008,7 @@
       DefaultMutableTreeNode nodeToUpdate = null;
       boolean updateElementStructure = updateStructure;
       for (Object element = fromElement; element != null; element = getTreeStructure().getParentElement(element)) {
-        final DefaultMutableTreeNode node = getNodeForElement(element, false);
+        final DefaultMutableTreeNode node = getFirstNode(element);
         if (node != null) {
           nodeToUpdate = node;
           break;
