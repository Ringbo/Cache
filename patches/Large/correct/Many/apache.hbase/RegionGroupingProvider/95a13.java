diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/wal/RegionGroupingProvider.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/wal/RegionGroupingProvider.java
index 2885428..0aeaccf 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/wal/RegionGroupingProvider.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/wal/RegionGroupingProvider.java
@@ -185,7 +185,7 @@
   }
 
   private WAL getWAL(final String group) throws IOException {
-    WAL log = cached.get(walCacheLock);
+    WAL log = cached.get(group);
     if (null == log) {
       // only lock when need to create wal, and need to lock since
       // creating hlog on fs is time consuming
