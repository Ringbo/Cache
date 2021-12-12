diff --git a/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java b/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
index 3f7442c..a6a1d49 100644
--- a/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
+++ b/platform-api/src/com/intellij/ide/util/treeView/AbstractTreeUi.java
@@ -677,7 +677,7 @@
       }
     }
 
-    if (myNodeActions.size() == 0 && myUpdaterState != null) {
+    if (myNodeActions.size() == 0 && myUpdaterState != null && !myUpdaterState.isProcessingNow()) {
       final UpdaterTreeState state = myUpdaterState;
       clearUpdaterState();
       state.restore();
@@ -942,7 +942,7 @@
         DefaultMutableTreeNode node1 = (DefaultMutableTreeNode)parentNode.getChildAt(i);
         if (node == node1) continue;
         if (node1.getUserObject() instanceof NodeDescriptor && ((NodeDescriptor)node1.getUserObject()).getElement() == null) continue;
-        if (myNodeComparator.compare(node, node1) > 0) newIndex++;
+        if (myNodeComparator.compare(node, node1) > 0 || isLoadingNode(node1)) newIndex++;
       }
 
       if (oldIndex != newIndex) {
