diff --git a/source/com/intellij/ide/util/treeView/AbstractTreeBuilder.java b/source/com/intellij/ide/util/treeView/AbstractTreeBuilder.java
index 55796f8..baf59d4 100644
--- a/source/com/intellij/ide/util/treeView/AbstractTreeBuilder.java
+++ b/source/com/intellij/ide/util/treeView/AbstractTreeBuilder.java
@@ -568,7 +568,7 @@
       for (int i = 0; i < parentNode.getChildCount(); i++) {
         DefaultMutableTreeNode node1 = (DefaultMutableTreeNode)parentNode.getChildAt(i);
         if (node == node1) continue;
-        if (((NodeDescriptor)node1.getUserObject()).getElement() == null) continue;
+        if ((node1.getUserObject() instanceof NodeDescriptor) && ((NodeDescriptor)node1.getUserObject()).getElement() == null) continue;
         if (myNodeComparator.compare(node, node1) > 0) newIndex++;
       }
 
