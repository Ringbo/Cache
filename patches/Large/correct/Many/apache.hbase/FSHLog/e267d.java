diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/wal/FSHLog.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/wal/FSHLog.java
index d2ba69d..248b71a 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/wal/FSHLog.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/wal/FSHLog.java
@@ -1684,7 +1684,7 @@
     oldestUnflushedStoreSequenceIdsOfRegion =
         new ConcurrentSkipListMap<byte[], Long>(Bytes.BYTES_COMPARATOR);
     ConcurrentMap<byte[], Long> alreadyPut =
-        oldestUnflushedStoreSequenceIds.put(encodedRegionName,
+        oldestUnflushedStoreSequenceIds.putIfAbsent(encodedRegionName,
           oldestUnflushedStoreSequenceIdsOfRegion);
     return alreadyPut == null ? oldestUnflushedStoreSequenceIdsOfRegion : alreadyPut;
   }
