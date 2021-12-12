diff --git a/src/java/org/apache/cassandra/db/compaction/CompactionStrategyManager.java b/src/java/org/apache/cassandra/db/compaction/CompactionStrategyManager.java
index 7ad6e91..61f0630 100644
--- a/src/java/org/apache/cassandra/db/compaction/CompactionStrategyManager.java
+++ b/src/java/org/apache/cassandra/db/compaction/CompactionStrategyManager.java
@@ -745,7 +745,7 @@
         readLock.lock();
         try
         {
-            getCompactionStrategyFor(deleted).removeSSTable(deleted);
+            compactionStrategyFor(deleted).removeSSTable(deleted);
         }
         finally
         {
