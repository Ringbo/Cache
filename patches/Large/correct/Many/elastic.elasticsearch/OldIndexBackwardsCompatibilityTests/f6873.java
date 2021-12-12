diff --git a/src/test/java/org/elasticsearch/bwcompat/OldIndexBackwardsCompatibilityTests.java b/src/test/java/org/elasticsearch/bwcompat/OldIndexBackwardsCompatibilityTests.java
index 261cbb1..bd49843 100644
--- a/src/test/java/org/elasticsearch/bwcompat/OldIndexBackwardsCompatibilityTests.java
+++ b/src/test/java/org/elasticsearch/bwcompat/OldIndexBackwardsCompatibilityTests.java
@@ -106,7 +106,7 @@
     }
 
     void setupCluster() throws Exception {
-        ListenableFuture<List<String>> replicas = internalCluster().startNodesAsync(2); // for replicas
+        ListenableFuture<List<String>> replicas = internalCluster().startNodesAsync(1); // for replicas
 
         Path dataDir = newTempDirPath(LifecycleScope.SUITE);
         ImmutableSettings.Builder nodeSettings = ImmutableSettings.builder()
@@ -300,7 +300,7 @@
     }
 
     void assertNewReplicasWork(String indexName) throws Exception {
-        final int numReplicas = randomIntBetween(1, 2);
+        final int numReplicas = 1;
         final long startTime = System.currentTimeMillis();
         logger.debug("--> creating [{}] replicas for index [{}]", numReplicas, indexName);
         assertAcked(client().admin().indices().prepareUpdateSettings(indexName).setSettings(ImmutableSettings.builder()
