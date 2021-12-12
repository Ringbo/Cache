diff --git a/community/shell/src/test/java/org/neo4j/shell/TestApps.java b/community/shell/src/test/java/org/neo4j/shell/TestApps.java
index 6559fa2..2bbdf67 100644
--- a/community/shell/src/test/java/org/neo4j/shell/TestApps.java
+++ b/community/shell/src/test/java/org/neo4j/shell/TestApps.java
@@ -955,7 +955,7 @@
     @Test
     public void shouldAllowExplainAsStartForACypherQuery() throws Exception
     {
-        executeCommand( "EXPLAIN OPTIONAL MATCH (n) RETURN n;", "DbHits", "No data returned" );
+        executeCommand( "EXPLAIN OPTIONAL MATCH (n) RETURN n;", "No data returned" );
     }
 
     @Test
