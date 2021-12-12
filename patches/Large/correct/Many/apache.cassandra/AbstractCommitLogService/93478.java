diff --git a/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java b/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
index 517ebe3..d9ea683 100644
--- a/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
+++ b/src/java/org/apache/cassandra/db/commitlog/AbstractCommitLogService.java
@@ -177,7 +177,7 @@
 
     public long getCompletedTasks()
     {
-        return written.incrementAndGet();
+        return written.get();
     }
 
     public long getPendingTasks()
