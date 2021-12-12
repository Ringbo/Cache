diff --git a/community/server/src/main/java/org/neo4j/server/webadmin/console/GremlinSession.java b/community/server/src/main/java/org/neo4j/server/webadmin/console/GremlinSession.java
index ef4afe3..6122cba 100644
--- a/community/server/src/main/java/org/neo4j/server/webadmin/console/GremlinSession.java
+++ b/community/server/src/main/java/org/neo4j/server/webadmin/console/GremlinSession.java
@@ -138,6 +138,6 @@
 
     private TransactionalGraph getGremlinWrappedGraph() throws DatabaseBlockedException
     {
-        return new Neo4jGraph( database.graph );
+        return new Neo4jGraph( database.graph, false );
     }
 }
