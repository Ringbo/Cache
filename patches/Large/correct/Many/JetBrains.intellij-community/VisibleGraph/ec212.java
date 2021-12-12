diff --git a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/VisibleGraph.java b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/VisibleGraph.java
index 2ecb4b5..76c590d 100644
--- a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/VisibleGraph.java
+++ b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/VisibleGraph.java
@@ -24,17 +24,17 @@
  * This is one per client (page), all access to VisibleGraph should be synchronized. <br/>
  * It refers to the {@link PermanentGraph}, but it occupies a little on its own.
  */
-public interface VisibleGraph<CommitId> {
+public interface VisibleGraph<Id> {
 
   int getVisibleCommitCount();
 
   @NotNull
-  RowInfo<CommitId> getRowInfo(int visibleRow);
+  RowInfo<Id> getRowInfo(int visibleRow);
 
   @Nullable
-  Integer getVisibleRowIndex(@NotNull CommitId commitId);
+  Integer getVisibleRowIndex(@NotNull Id id);
 
   @NotNull
-  ActionController<CommitId> getActionController();
+  ActionController<Id> getActionController();
 
 }
