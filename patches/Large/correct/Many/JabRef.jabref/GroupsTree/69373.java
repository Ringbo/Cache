diff --git a/src/java/net/sf/jabref/groups/GroupsTree.java b/src/java/net/sf/jabref/groups/GroupsTree.java
index 8e2f44e..ad46c82 100644
--- a/src/java/net/sf/jabref/groups/GroupsTree.java
+++ b/src/java/net/sf/jabref/groups/GroupsTree.java
@@ -65,7 +65,7 @@
             return;
         }
         GroupTreeNode target = (GroupTreeNode) path.getLastPathComponent();
-        if (target == null || dragNode.isNodeChild(target) || dragNode == target) {
+        if (target == null || dragNode.isNodeDescendant(target) || dragNode == target) {
             dsde.getDragSourceContext().setCursor(DragSource.DefaultMoveNoDrop);
             return;
         }
@@ -134,14 +134,11 @@
                 dtde.rejectDrop(); // ignore this
                 return;
             }
-            if (source.isNodeChild(target)) {
+            if (source.isNodeDescendant(target)) {
                 dtde.rejectDrop();
-                // JZTODO invokeLater: error message; e.g. status line
                 return;
             }
             Enumeration expandedPaths = groupSelector.getExpandedPaths(); 
-            // JZFIXME somehow it is possible to arrive here with the root
-            // node being dragged...
             UndoableMoveGroup undo = new UndoableMoveGroup(groupSelector,
                     groupSelector.getGroupTreeRoot(), source, target, target
                             .getChildCount());
