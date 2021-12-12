diff --git a/enterprise/ha/src/main/java/org/neo4j/graphdb/factory/HighlyAvailableGraphDatabaseFactory.java b/enterprise/ha/src/main/java/org/neo4j/graphdb/factory/HighlyAvailableGraphDatabaseFactory.java
index 4aa4052..a9bc3f7 100644
--- a/enterprise/ha/src/main/java/org/neo4j/graphdb/factory/HighlyAvailableGraphDatabaseFactory.java
+++ b/enterprise/ha/src/main/java/org/neo4j/graphdb/factory/HighlyAvailableGraphDatabaseFactory.java
@@ -32,7 +32,7 @@
 
     public GraphDatabaseService newHighlyAvailableDatabase( String path )
     {
-        return newEmbeddedDatabaseBuilder( path ).newGraphDatabase();
+        return newHighlyAvailableDatabaseBuilder( path ).newGraphDatabase();
     }
 
     public GraphDatabaseBuilder newHighlyAvailableDatabaseBuilder( final String path )
