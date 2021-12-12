diff --git a/src/java/net/sf/jabref/groups/UndoableAddOrRemoveGroup.java b/src/java/net/sf/jabref/groups/UndoableAddOrRemoveGroup.java
index e7a6fb2..316f3b6 100644
--- a/src/java/net/sf/jabref/groups/UndoableAddOrRemoveGroup.java
+++ b/src/java/net/sf/jabref/groups/UndoableAddOrRemoveGroup.java
@@ -78,7 +78,7 @@
         // storing a backup of the whole subtree is not required when children
         // are kept
         m_subtreeBackup = editType != REMOVE_NODE_KEEP_CHILDREN ? editedNode
-                .deepCopy() : new GroupTreeNode(editedNode.getGroup());
+                .deepCopy() : new GroupTreeNode(editedNode.getGroup().deepCopy());
         // remember path to edited node. this cannot be stored as a reference,
         // because the reference itself might change. the method below is more
         // robust.
@@ -131,9 +131,9 @@
                 GroupTreeNode newNode = m_subtreeBackup.deepCopy();
                 for (int i = childIndex; i < childIndex
                         + m_subtreeRootChildCount; ++i) {
-                    newNode.add((GroupTreeNode) cursor.getChildAt(i));
+                    newNode.add((GroupTreeNode) cursor.getChildAt(childIndex));
                 }
-                cursor.insert(m_subtreeBackup.deepCopy(), childIndex);
+                cursor.insert(newNode, childIndex);
                 break;
             case REMOVE_NODE_AND_CHILDREN:
                 cursor.insert(m_subtreeBackup.deepCopy(), childIndex);
