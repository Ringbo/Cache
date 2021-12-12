diff --git a/src/java/org/apache/cassandra/cql3/QueryProcessor.java b/src/java/org/apache/cassandra/cql3/QueryProcessor.java
index 7dcd467..cd4ff25 100644
--- a/src/java/org/apache/cassandra/cql3/QueryProcessor.java
+++ b/src/java/org/apache/cassandra/cql3/QueryProcessor.java
@@ -205,7 +205,7 @@
         logger.trace("CQL QUERY: {}", queryString);
 
         ParsedStatement.Prepared prepared = getStatement(queryString, clientState);
-        ResultMessage.Prepared msg = storePreparedStatement(queryString, clientState.getKeyspace(), prepared, forThrift);
+        ResultMessage.Prepared msg = storePreparedStatement(queryString, clientState.getRawKeyspace(), prepared, forThrift);
 
         assert prepared.statement.getBoundsTerms() == prepared.boundNames.size();
         return msg;
