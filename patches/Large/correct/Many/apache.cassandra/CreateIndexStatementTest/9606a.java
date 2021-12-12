diff --git a/test/unit/org/apache/cassandra/cql3/CreateIndexStatementTest.java b/test/unit/org/apache/cassandra/cql3/CreateIndexStatementTest.java
index 18e1be5..847466e 100644
--- a/test/unit/org/apache/cassandra/cql3/CreateIndexStatementTest.java
+++ b/test/unit/org/apache/cassandra/cql3/CreateIndexStatementTest.java
@@ -79,7 +79,7 @@
         else
         {
             execute("USE " + KEYSPACE);
-            dropIndex("DROP INDEX " + indexName);
+            execute("DROP INDEX " + indexName);
         }
 
         assertInvalidMessage("No secondary indexes on the restricted columns support the provided operators",
