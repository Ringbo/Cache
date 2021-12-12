diff --git a/src/java/org/apache/cassandra/service/AntiEntropyService.java b/src/java/org/apache/cassandra/service/AntiEntropyService.java
index 61e4219..ca03af2 100644
--- a/src/java/org/apache/cassandra/service/AntiEntropyService.java
+++ b/src/java/org/apache/cassandra/service/AntiEntropyService.java
@@ -805,7 +805,8 @@
                 ColumnFamilyStore cfstore = Table.open(tablename).getColumnFamilyStore(cfname);
                 try
                 {
-                    Collection<SSTableReader> sstables = cfstore.getSSTables();
+                    // We acquire references for transferSSTables
+                    Collection<SSTableReader> sstables = cfstore.markCurrentSSTablesReferenced();
                     Callback callback = new Callback();
                     // send ranges to the remote node
                     StreamOutSession outsession = StreamOutSession.create(tablename, remote, callback);
