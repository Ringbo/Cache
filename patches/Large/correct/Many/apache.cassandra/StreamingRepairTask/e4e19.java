diff --git a/src/java/org/apache/cassandra/streaming/StreamingRepairTask.java b/src/java/org/apache/cassandra/streaming/StreamingRepairTask.java
index 60d80b3..4a93f92 100644
--- a/src/java/org/apache/cassandra/streaming/StreamingRepairTask.java
+++ b/src/java/org/apache/cassandra/streaming/StreamingRepairTask.java
@@ -115,7 +115,8 @@
         try
         {
             logger.info(String.format("[streaming task #%s] Performing streaming repair of %d ranges with %s", id, ranges.size(), dst));
-            Collection<SSTableReader> sstables = cfstore.getSSTables();
+            // We acquire references for transferSSTables
+            Collection<SSTableReader> sstables = cfstore.markCurrentSSTablesReferenced();
             // send ranges to the remote node
             StreamOutSession outsession = StreamOutSession.create(tableName, dst, callback);
             StreamOut.transferSSTables(outsession, sstables, ranges, OperationType.AES);
