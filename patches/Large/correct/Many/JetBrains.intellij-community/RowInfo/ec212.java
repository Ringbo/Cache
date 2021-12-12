diff --git a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/RowInfo.java b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/RowInfo.java
index 337e63c..a5248b2 100644
--- a/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/RowInfo.java
+++ b/platform/vcs-log/graph-api/src/com/intellij/vcs/log/graph/RowInfo.java
@@ -21,13 +21,13 @@
 
 /**
  */
-public interface RowInfo<CommitId> {
+public interface RowInfo<Id> {
 
   @NotNull
-  CommitId getCommit();
+  Id getCommit();
 
   @NotNull
-  CommitId getOneOfHeads();
+  Id getOneOfHeads();
 
   @NotNull
   Collection<? extends PrintElement> getPrintElements();
