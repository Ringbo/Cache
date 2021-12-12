diff --git a/tools/stress/src/org/apache/cassandra/stress/operations/CqlOperation.java b/tools/stress/src/org/apache/cassandra/stress/operations/CqlOperation.java
index 1f734be..744e7f6 100644
--- a/tools/stress/src/org/apache/cassandra/stress/operations/CqlOperation.java
+++ b/tools/stress/src/org/apache/cassandra/stress/operations/CqlOperation.java
@@ -334,7 +334,7 @@
         {
             String formattedQuery = formatCqlQuery(query, queryParams, true);
             return handler.simpleNativeHandler().apply(
-                    client.execute_cql3_query(query, key, Compression.NONE, state.settings.command.consistencyLevel)
+                    client.execute_cql3_query(formattedQuery, key, Compression.NONE, state.settings.command.consistencyLevel)
             );
         }
 
