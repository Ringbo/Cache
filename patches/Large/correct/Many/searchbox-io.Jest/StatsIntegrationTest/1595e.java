diff --git a/jest/src/test/java/io/searchbox/cluster/StatsIntegrationTest.java b/jest/src/test/java/io/searchbox/cluster/StatsIntegrationTest.java
index 9121dd1..6a36587 100644
--- a/jest/src/test/java/io/searchbox/cluster/StatsIntegrationTest.java
+++ b/jest/src/test/java/io/searchbox/cluster/StatsIntegrationTest.java
@@ -28,7 +28,7 @@
 
     @Test
     public void clusterStatsWithSpecificNodes() throws IOException {
-        final String localNodeName = clusterService().localNode().name();
+        final String localNodeName = clusterService().localNode().getName();
         JestResult result = client.execute(new Stats.Builder().addNode(localNodeName).build());
         assertTrue(result.getErrorMessage(), result.isSucceeded());
 
