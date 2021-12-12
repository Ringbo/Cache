diff --git a/src/java/org/apache/cassandra/service/MigrationManager.java b/src/java/org/apache/cassandra/service/MigrationManager.java
index 7b9d64b..2411fe8 100644
--- a/src/java/org/apache/cassandra/service/MigrationManager.java
+++ b/src/java/org/apache/cassandra/service/MigrationManager.java
@@ -220,7 +220,7 @@
         if (ksm == null)
             throw new ConfigurationException(String.format("Cannot add column family '%s' to non existing keyspace '%s'.", cfm.cfName, cfm.ksName));
         else if (ksm.cfMetaData().containsKey(cfm.cfName))
-            throw new AlreadyExistsException(cfm.cfName, cfm.ksName);
+            throw new AlreadyExistsException(cfm.ksName, cfm.cfName);
 
         logger.info(String.format("Create new ColumnFamily: %s", cfm));
         announce(cfm.toSchema(FBUtilities.timestampMicros()));
