diff --git a/src/java/org/apache/cassandra/db/compaction/CompactionManager.java b/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
index ff50db5..2900c85 100644
--- a/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
+++ b/src/java/org/apache/cassandra/db/compaction/CompactionManager.java
@@ -347,7 +347,7 @@
                     {
                         if (sstables.isEmpty())
                         {
-                            logger.error("No file to compact for user defined compaction");
+                            logger.info("No file to compact for user defined compaction");
                         }
                         // attempt to schedule the set
                         else if ((toCompact = cfs.getDataTracker().markCompacting(sstables, 1, Integer.MAX_VALUE)) != null)
@@ -366,7 +366,7 @@
                         }
                         else
                         {
-                            logger.error("SSTables for user defined compaction are already being compacted.");
+                            logger.info("SSTables for user defined compaction are already being compacted.");
                         }
                     }
                     finally
