diff --git a/platform/platform-api/src/com/intellij/util/ui/tree/TreeUtil.java b/platform/platform-api/src/com/intellij/util/ui/tree/TreeUtil.java
index f186af4..778f2d0 100644
--- a/platform/platform-api/src/com/intellij/util/ui/tree/TreeUtil.java
+++ b/platform/platform-api/src/com/intellij/util/ui/tree/TreeUtil.java
@@ -95,7 +95,7 @@
 
   @NotNull
   public static List<TreePath> collectExpandedPaths(@NotNull JTree tree, @NotNull TreePath path) {
-    return treePathTraverser(tree).expand(tree::isExpanded).withRoot(path).toList();
+    return treePathTraverser(tree).expandAndFilter(tree::isExpanded).withRoot(path).toList();
   }
 
   /**
