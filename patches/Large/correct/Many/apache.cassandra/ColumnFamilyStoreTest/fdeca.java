diff --git a/test/unit/org/apache/cassandra/db/ColumnFamilyStoreTest.java b/test/unit/org/apache/cassandra/db/ColumnFamilyStoreTest.java
index 60fb195..c85b2e0 100644
--- a/test/unit/org/apache/cassandra/db/ColumnFamilyStoreTest.java
+++ b/test/unit/org/apache/cassandra/db/ColumnFamilyStoreTest.java
@@ -1109,7 +1109,7 @@
         CellName cname = cellname("c1");
         Keyspace keyspace = Keyspace.open(keyspaceName);
         ColumnFamilyStore cfs = keyspace.getColumnFamilyStore(cfName);
-        cfs.clearUnsafe();
+        cfs.truncateBlocking();
 
         // Create a cell a 'high timestamp'
         putColsStandard(cfs, key, new BufferCell(cname, ByteBufferUtil.bytes("a"), 2));
