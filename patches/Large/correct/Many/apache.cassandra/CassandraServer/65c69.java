diff --git a/src/java/org/apache/cassandra/thrift/CassandraServer.java b/src/java/org/apache/cassandra/thrift/CassandraServer.java
index 2f47452..9353d16 100644
--- a/src/java/org/apache/cassandra/thrift/CassandraServer.java
+++ b/src/java/org/apache/cassandra/thrift/CassandraServer.java
@@ -2029,7 +2029,7 @@
         {
             String keyspace = cState.getKeyspace();
             cState.hasColumnFamilyAccess(keyspace, cfname, Permission.MODIFY);
-            CFMetaData metadata = ThriftValidation.validateColumnFamily(keyspace, cfname, true);
+            CFMetaData metadata = ThriftValidation.validateColumnFamily(keyspace, cfname, false);
             if (metadata.isMaterializedView())
                 throw new org.apache.cassandra.exceptions.InvalidRequestException("Cannot truncate Materialized Views");
 
