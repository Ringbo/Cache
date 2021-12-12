diff --git a/platform/platform-impl/src/com/intellij/ui/tree/TreeSmartSelectProvider.java b/platform/platform-impl/src/com/intellij/ui/tree/TreeSmartSelectProvider.java
index c51f0d5..8ffe331 100644
--- a/platform/platform-impl/src/com/intellij/ui/tree/TreeSmartSelectProvider.java
+++ b/platform/platform-impl/src/com/intellij/ui/tree/TreeSmartSelectProvider.java
@@ -39,7 +39,7 @@
     TreePath parentPath = path.getParentPath();
     if (parentPath == null) return;
     boolean madeSelection = false;
-    for (int i = 0; i < tree.getVisibleRowCount(); i++) {
+    for (int i = 0; i < tree.getRowCount(); i++) {
       TreePath row = tree.getPathForRow(i);
       if (parentPath.isDescendant(row) && !row.equals(parentPath)) {
         if (!tree.isRowSelected(i)) {
