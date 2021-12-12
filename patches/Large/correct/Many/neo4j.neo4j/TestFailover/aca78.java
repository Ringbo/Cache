diff --git a/enterprise/ha/src/test/java/org/neo4j/kernel/ha/TestFailover.java b/enterprise/ha/src/test/java/org/neo4j/kernel/ha/TestFailover.java
index 40a65f2..a6dc3ed 100644
--- a/enterprise/ha/src/test/java/org/neo4j/kernel/ha/TestFailover.java
+++ b/enterprise/ha/src/test/java/org/neo4j/kernel/ha/TestFailover.java
@@ -41,7 +41,8 @@
 {
     @Rule
     public LoggerRule logger = new LoggerRule();
-    public TargetDirectory dir = TargetDirectory.forTest( getClass() );
+    @Rule
+    public TargetDirectory.TestDirectory dir = TargetDirectory.testDirForTest( getClass() );
 
     // parameters
     private int clusterSize;
@@ -65,10 +66,13 @@
     private void testFailOver( int clusterSize ) throws Throwable
     {
         // given
-        ClusterManager clusterManager = new ClusterManager( clusterOfSize( clusterSize ), dir.cleanDirectory( "failover" ), stringMap(
+        ClusterManager clusterManager = new ClusterManager.Builder().withRootDirectory( dir.cleanDirectory( "failover" ) ).
+        withProvider( ClusterManager.clusterOfSize( clusterSize ) )
+                .withSharedConfig( stringMap(
                 ClusterSettings.default_timeout.name(),    "1",
                 ClusterSettings.heartbeat_interval.name(), "1",
-                ClusterSettings.heartbeat_timeout.name(),  "2" ) );
+                    ClusterSettings.heartbeat_timeout.name(),  "2" ) )
+                .build();
 
         clusterManager.start();
         ClusterManager.ManagedCluster cluster = clusterManager.getDefaultCluster();
@@ -79,13 +83,13 @@
         // When
         long start = System.nanoTime();
         ClusterManager.RepairKit repairKit = cluster.fail( oldMaster );
-        logger.getLogger().warn( "Shut down master" );
+        logger.getLogger().warning( "Shut down master" );
 
         // Then
         cluster.await( ClusterManager.masterAvailable( oldMaster ) );
         long end = System.nanoTime();
 
-        logger.getLogger().warn( "Failover took:" + (end - start) / 1000000 + "ms" );
+        logger.getLogger().warning( "Failover took:" + (end - start) / 1000000 + "ms" );
 
         repairKit.repair();
         Thread.sleep( 3000 ); // give repaired instance chance to cleanly rejoin and exit faster
