diff --git a/examples/triggers/src/org/apache/cassandra/triggers/AuditTrigger.java b/examples/triggers/src/org/apache/cassandra/triggers/AuditTrigger.java
index 2528ec7..b0172b0 100644
--- a/examples/triggers/src/org/apache/cassandra/triggers/AuditTrigger.java
+++ b/examples/triggers/src/org/apache/cassandra/triggers/AuditTrigger.java
@@ -45,7 +45,7 @@
 
         audit.row()
              .add("keyspace_name", update.metadata().keyspace)
-             .add("table_name", update.metadata().table)
+             .add("table_name", update.metadata().name)
              .add("primary_key", update.metadata().partitionKeyType.getString(update.partitionKey().getKey()));
 
         return Collections.singletonList(audit.buildAsMutation());
