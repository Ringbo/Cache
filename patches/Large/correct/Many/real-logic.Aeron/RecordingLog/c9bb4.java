diff --git a/aeron-cluster/src/main/java/io/aeron/cluster/client/RecordingLog.java b/aeron-cluster/src/main/java/io/aeron/cluster/client/RecordingLog.java
index cd1907f..1e01a8a 100644
--- a/aeron-cluster/src/main/java/io/aeron/cluster/client/RecordingLog.java
+++ b/aeron-cluster/src/main/java/io/aeron/cluster/client/RecordingLog.java
@@ -612,7 +612,7 @@
         {
             final Entry entry = entries.get(size - 1);
 
-            if (entry.leadershipTermId != leadershipTermId)
+            if (entry.type == ENTRY_TYPE_TERM && entry.leadershipTermId != leadershipTermId)
             {
                 throw new IllegalStateException("leadershipTermId out of sequence: previous " +
                     entry.leadershipTermId + " this " + leadershipTermId);
