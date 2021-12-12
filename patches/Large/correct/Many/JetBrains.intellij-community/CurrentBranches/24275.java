diff --git a/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/impl/visible/CurrentBranches.java b/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/impl/visible/CurrentBranches.java
index 3d08c33..d672cc9 100644
--- a/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/impl/visible/CurrentBranches.java
+++ b/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/impl/visible/CurrentBranches.java
@@ -45,7 +45,7 @@
 
   public CurrentBranches(@NotNull LinearGraph permanentGraph) {
     myPermanentGraph = permanentGraph;
-    myVisibleNodesInBranches = new BitSetFlags(permanentGraph.nodesCount(), true);
+    myVisibleNodesInBranches = new BitSetFlags(permanentGraph.nodesCount(), false);
   }
 
   private void selectAllVisibleNodes(@NotNull Set<Integer> startedNodes) {
