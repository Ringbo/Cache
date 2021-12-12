diff --git a/src/java/org/apache/cassandra/db/compaction/CompactionController.java b/src/java/org/apache/cassandra/db/compaction/CompactionController.java
index 6104486..ff3de53 100644
--- a/src/java/org/apache/cassandra/db/compaction/CompactionController.java
+++ b/src/java/org/apache/cassandra/db/compaction/CompactionController.java
@@ -114,7 +114,7 @@
         List<SSTableReader> filteredSSTables = overlappingTree.search(key);
         for (SSTableReader sstable : filteredSSTables)
         {
-            if (sstable.getBloomFilter().isPresent(key.key) && sstable.getMinTimestamp() >= maxDeletionTimestamp)
+            if (sstable.getBloomFilter().isPresent(key.key) && sstable.getMinTimestamp() <= maxDeletionTimestamp)
                 return false;
         }
         return true;
