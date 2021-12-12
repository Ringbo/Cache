diff --git a/src/java/org/apache/cassandra/cql3/statements/ModificationStatement.java b/src/java/org/apache/cassandra/cql3/statements/ModificationStatement.java
index d08d0ee..88a80e0 100644
--- a/src/java/org/apache/cassandra/cql3/statements/ModificationStatement.java
+++ b/src/java/org/apache/cassandra/cql3/statements/ModificationStatement.java
@@ -379,7 +379,14 @@
         ColumnFamily updates = updateForKey(key, clusteringPrefix, params);
         ColumnFamily expected = buildConditions(key, clusteringPrefix, params);
 
-        ColumnFamily result = StorageProxy.cas(keyspace(), columnFamily(), key, clusteringPrefix, expected, updates, options.getConsistency(), options.getSerialConsistency());
+        ColumnFamily result = StorageProxy.cas(keyspace(),
+                                               columnFamily(),
+                                               key,
+                                               clusteringPrefix,
+                                               expected,
+                                               updates,
+                                               options.getSerialConsistency(),
+                                               options.getConsistency());
         return new ResultMessage.Rows(buildCasResultSet(key, result));
     }
 
