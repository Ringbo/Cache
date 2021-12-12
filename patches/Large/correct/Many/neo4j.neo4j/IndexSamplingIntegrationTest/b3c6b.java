diff --git a/community/neo4j/src/test/java/org/neo4j/index/IndexSamplingIntegrationTest.java b/community/neo4j/src/test/java/org/neo4j/index/IndexSamplingIntegrationTest.java
index 2f957ca..2a6ff61 100644
--- a/community/neo4j/src/test/java/org/neo4j/index/IndexSamplingIntegrationTest.java
+++ b/community/neo4j/src/test/java/org/neo4j/index/IndexSamplingIntegrationTest.java
@@ -209,7 +209,7 @@
             db = new TestGraphDatabaseFactory().newEmbeddedDatabase( testDirectory.graphDbDir().getAbsolutePath() );
             @SuppressWarnings( "deprecation" )
             GraphDatabaseAPI api = (GraphDatabaseAPI) db;
-            CountsTracker countsTracker = api.getDependencyResolver().resolveDependency( NeoStore.class ).getCounts();
+            CountsTracker countsTracker = api.getDependencyResolver().resolveDependency( NeoStores.class ).getCounts();
             IndexStatisticsKey key = CountsKeyFactory.indexStatisticsKey( 0, 0 ); // cheating a bit...
             return countsTracker.get( key, Registers.newDoubleLongRegister() );
         }
