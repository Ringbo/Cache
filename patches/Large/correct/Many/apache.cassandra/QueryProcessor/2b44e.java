diff --git a/src/java/org/apache/cassandra/cql/QueryProcessor.java b/src/java/org/apache/cassandra/cql/QueryProcessor.java
index 71142cd..28ee353 100644
--- a/src/java/org/apache/cassandra/cql/QueryProcessor.java
+++ b/src/java/org/apache/cassandra/cql/QueryProcessor.java
@@ -612,7 +612,7 @@
                                 "Timestamp must be set either on BATCH or individual statements");
                 }
 
-                List<IMutation> mutations = batch.getMutations(keyspace, clientState);
+                List<IMutation> mutations = batch.getMutations(keyspace, clientState, variables);
                 for (IMutation mutation : mutations)
                 {
                     validateKey(mutation.key());
@@ -667,7 +667,7 @@
                 DeleteStatement delete = (DeleteStatement)statement.statement;
 
                 keyspace = delete.keyspace == null ? clientState.getKeyspace() : delete.keyspace;
-                List<IMutation> deletions = delete.prepareRowMutations(keyspace, clientState);
+                List<IMutation> deletions = delete.prepareRowMutations(keyspace, clientState, variables);
                 for (IMutation deletion : deletions)
                 {
                     validateKey(deletion.key());
