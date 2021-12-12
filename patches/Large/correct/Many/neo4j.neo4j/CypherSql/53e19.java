diff --git a/community/embedded-examples/src/main/java/org/neo4j/examples/CypherSql.java b/community/embedded-examples/src/main/java/org/neo4j/examples/CypherSql.java
index 116be2a..25f3973 100644
--- a/community/embedded-examples/src/main/java/org/neo4j/examples/CypherSql.java
+++ b/community/embedded-examples/src/main/java/org/neo4j/examples/CypherSql.java
@@ -562,7 +562,7 @@
     String executeCypher( String cypher )
     {
         return engine.execute( cypher )
-                .toString();
+                .dumpToString();
     }
 
     String executeSql( String sql ) throws SQLException
