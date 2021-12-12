diff --git a/src/java/org/apache/cassandra/thrift/CassandraServer.java b/src/java/org/apache/cassandra/thrift/CassandraServer.java
index 5b9fbfd..883ab5a 100644
--- a/src/java/org/apache/cassandra/thrift/CassandraServer.java
+++ b/src/java/org/apache/cassandra/thrift/CassandraServer.java
@@ -1407,7 +1407,7 @@
             if (oldCfm == null)
                 throw new InvalidRequestException("Could not find column family definition to modify.");
 
-            if (!oldCfm.isThriftIncompatible())
+            if (oldCfm.isThriftIncompatible())
                 throw new InvalidRequestException("Cannot modify CQL3 table " + oldCfm.cfName + " as it may break the schema. You should use cqlsh to modify CQL3 tables instead.");
 
             state().hasColumnFamilyAccess(cf_def.keyspace, cf_def.name, Permission.ALTER);
