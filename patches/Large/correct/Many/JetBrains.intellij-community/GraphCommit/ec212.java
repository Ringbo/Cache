diff --git a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/GraphCommit.java b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/GraphCommit.java
index 02b3378..5ac49d2 100644
--- a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/GraphCommit.java
+++ b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/GraphCommit.java
@@ -21,13 +21,13 @@
 
 /**
  */
-public interface GraphCommit<CommitId> {
+public interface GraphCommit<Id> {
 
   @NotNull
-  CommitId getId();
+  Id getId();
 
   @NotNull
-  List<CommitId> getParents();
+  List<Id> getParents();
 
   /**
    * <p>Returns the timestamp indicating the date & time when this commit was made.</p>
