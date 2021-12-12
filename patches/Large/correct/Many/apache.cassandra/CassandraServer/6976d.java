diff --git a/src/java/org/apache/cassandra/thrift/CassandraServer.java b/src/java/org/apache/cassandra/thrift/CassandraServer.java
index d47d988..cfb0e80 100644
--- a/src/java/org/apache/cassandra/thrift/CassandraServer.java
+++ b/src/java/org/apache/cassandra/thrift/CassandraServer.java
@@ -911,7 +911,7 @@
             if (del.super_column == null && Schema.instance.getColumnFamilyType(rm.getKeyspaceName(), cfName) == ColumnFamilyType.Super)
                 rm.deleteRange(cfName,
                                SuperColumns.startOf(del.predicate.getSlice_range().start),
-                               SuperColumns.startOf(del.predicate.getSlice_range().finish),
+                               SuperColumns.endOf(del.predicate.getSlice_range().finish),
                                del.timestamp);
             else if (del.super_column != null)
                 rm.deleteRange(cfName,
