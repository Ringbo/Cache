diff --git a/plugins/ant/src/com/intellij/lang/ant/config/explorer/AntExplorerTreeBuilder.java b/plugins/ant/src/com/intellij/lang/ant/config/explorer/AntExplorerTreeBuilder.java
index 0389ed8..7187113 100644
--- a/plugins/ant/src/com/intellij/lang/ant/config/explorer/AntExplorerTreeBuilder.java
+++ b/plugins/ant/src/com/intellij/lang/ant/config/explorer/AntExplorerTreeBuilder.java
@@ -111,7 +111,7 @@
     }
   }
 
-  void expandAll() {
+  public void expandAll() {
     ArrayList pathsToExpand = new ArrayList();
     ArrayList selectionPaths = new ArrayList();
     TreeBuilderUtil.storePaths(this, getRootNode(), pathsToExpand, selectionPaths, true);
