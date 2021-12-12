diff --git a/src/java/org/apache/cassandra/db/compaction/PendingRepairManager.java b/src/java/org/apache/cassandra/db/compaction/PendingRepairManager.java
index eafa03c..afde263 100644
--- a/src/java/org/apache/cassandra/db/compaction/PendingRepairManager.java
+++ b/src/java/org/apache/cassandra/db/compaction/PendingRepairManager.java
@@ -359,7 +359,7 @@
         Set<ISSTableScanner> scanners = new HashSet<>(sessionSSTables.size());
         for (Map.Entry<UUID, Set<SSTableReader>> entry : sessionSSTables.entrySet())
         {
-            scanners.addAll(get(entry.getKey()).getScanners(entry.getValue(), ranges).scanners);
+            scanners.addAll(getOrCreate(entry.getKey()).getScanners(entry.getValue(), ranges).scanners);
         }
         return scanners;
     }
