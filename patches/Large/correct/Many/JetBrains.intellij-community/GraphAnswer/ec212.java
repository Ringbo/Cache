diff --git a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/actions/GraphAnswer.java b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/actions/GraphAnswer.java
index c350999..beb3d07 100644
--- a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/actions/GraphAnswer.java
+++ b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/actions/GraphAnswer.java
@@ -22,13 +22,13 @@
 /**
  * The graph returns an instance of the GraphAnswer as a reaction to {@link ActionController#performAction(GraphAction)}.
  */
-public interface GraphAnswer<CommitId> {
+public interface GraphAnswer<Id> {
 
   @Nullable
   Cursor getCursorToSet();
 
   @Nullable
-  CommitId getCommitToJump();
+  Id getCommitToJump();
 
   @Nullable
   Runnable getGraphUpdater();
