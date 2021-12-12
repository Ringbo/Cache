diff --git a/driver-core/src/main/java/com/datastax/driver/core/Metadata.java b/driver-core/src/main/java/com/datastax/driver/core/Metadata.java
index 4d173c6..cc981b4 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/Metadata.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/Metadata.java
@@ -67,7 +67,7 @@
             // If we update a keyspace we don't know about, something went
             // wrong. Log an error and schedule a full schema rebuild.
             if (keyspace == null) {
-                logger.error(String.format("Asked to rebuild table %s.%s but I don't know keyspace %s", keyspaceToRebuild, tableToRebuild, keyspaceToRebuild));
+                logger.info(String.format("Asked to rebuild table %s.%s but I don't know keyspace %s", keyspaceToRebuild, tableToRebuild, keyspaceToRebuild));
                 cluster.submitSchemaRefresh(null, null);
                 return;
             }
