diff --git a/platform/platform-api/src/com/intellij/util/ui/tree/TreeUtil.java b/platform/platform-api/src/com/intellij/util/ui/tree/TreeUtil.java
index a2d29ea..c1835cd 100644
--- a/platform/platform-api/src/com/intellij/util/ui/tree/TreeUtil.java
+++ b/platform/platform-api/src/com/intellij/util/ui/tree/TreeUtil.java
@@ -694,7 +694,7 @@
       row--;
     }
     Object root = tree.getModel().getRoot();
-    if (root != null) {
+    if (root != null && !tree.isRootVisible()) {
       tree.expandPath(new TreePath(root));
     }
     if (leadSelectionPath != null) {
