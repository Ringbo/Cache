diff --git a/test/unit/org/apache/cassandra/streaming/StreamingTransferTest.java b/test/unit/org/apache/cassandra/streaming/StreamingTransferTest.java
index abf867b..088b3db 100644
--- a/test/unit/org/apache/cassandra/streaming/StreamingTransferTest.java
+++ b/test/unit/org/apache/cassandra/streaming/StreamingTransferTest.java
@@ -183,7 +183,7 @@
         }
 
         StreamOutSession session = StreamOutSession.create(keyspace, LOCAL, null);
-        StreamOut.transferSSTables(session, ssTableReaders, ranges);
+        StreamOut.transferSSTables(session, ssTableReaders, ranges, OperationType.BOOTSTRAP);
 
         session.await();
 
