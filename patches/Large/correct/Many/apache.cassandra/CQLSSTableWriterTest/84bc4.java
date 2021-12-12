diff --git a/test/unit/org/apache/cassandra/io/sstable/CQLSSTableWriterTest.java b/test/unit/org/apache/cassandra/io/sstable/CQLSSTableWriterTest.java
index 6176505..61b8b83 100644
--- a/test/unit/org/apache/cassandra/io/sstable/CQLSSTableWriterTest.java
+++ b/test/unit/org/apache/cassandra/io/sstable/CQLSSTableWriterTest.java
@@ -248,7 +248,7 @@
 
         loader.stream().get();
 
-        UntypedResultSet rs = QueryProcessor.processInternal("SELECT * FROM cql_keyspace.table2;");
+        UntypedResultSet rs = QueryProcessor.executeInternal("SELECT * FROM cql_keyspace.table2;");
         assertEquals(threads.length * NUMBER_WRITES_IN_RUNNABLE, rs.size());
     }
 }
