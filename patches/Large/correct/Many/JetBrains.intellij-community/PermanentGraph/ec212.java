diff --git a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/PermanentGraph.java b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/PermanentGraph.java
index 7dca416..e217440 100644
--- a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/PermanentGraph.java
+++ b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/PermanentGraph.java
@@ -30,24 +30,24 @@
  *
  * @see VisibleGraph
  */
-public interface PermanentGraph<CommitId> {
+public interface PermanentGraph<Id> {
 
   @NotNull
-  VisibleGraph<CommitId> createVisibleGraph(@NotNull SortType sortType,
-                                            @Nullable Set<CommitId> headsOfVisibleBranches,
-                                            @Nullable Set<CommitId> matchedCommits);
+  VisibleGraph<Id> createVisibleGraph(@NotNull SortType sortType,
+                                      @Nullable Set<Id> headsOfVisibleBranches,
+                                      @Nullable Set<Id> matchedCommits);
 
   @NotNull
-  List<GraphCommit<CommitId>> getAllCommits();
+  List<GraphCommit<Id>> getAllCommits();
 
   @NotNull
-  List<CommitId> getChildren(@NotNull CommitId commit);
+  List<Id> getChildren(@NotNull Id commit);
 
   @NotNull
-  Set<CommitId> getContainingBranches(@NotNull CommitId commit);
+  Set<Id> getContainingBranches(@NotNull Id commit);
 
   @NotNull
-  Condition<CommitId> getContainedInBranchCondition(@NotNull Collection<CommitId> currentBranchHead);
+  Condition<Id> getContainedInBranchCondition(@NotNull Collection<Id> currentBranchHead);
 
   enum SortType {
     Normal("Off", "Sort commits topologically and by date"),
