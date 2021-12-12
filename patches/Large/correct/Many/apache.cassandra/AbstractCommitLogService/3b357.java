diff --git a/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java b/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
index 59bf691..517ebe3 100644
--- a/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
+++ b/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
@@ -182,6 +182,6 @@
 
     public long getPendingTasks()
     {
-        return pending.incrementAndGet();
+        return pending.get();
     }
 }
\ No newline at end of file
