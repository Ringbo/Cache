diff --git a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/PermanentGraphBuilder.java b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/PermanentGraphBuilder.java
index 1bd73de..dbbf73f 100644
--- a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/PermanentGraphBuilder.java
+++ b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/PermanentGraphBuilder.java
@@ -21,9 +21,9 @@
 
 /**
  */
-public interface PermanentGraphBuilder<CommitId> {
+public interface PermanentGraphBuilder<Id> {
 
   @NotNull
-  PermanentGraph<CommitId> build(@NotNull List<GraphCommit<CommitId>> commits);
+  PermanentGraph<Id> build(@NotNull List<GraphCommit<Id>> commits);
 
 }
