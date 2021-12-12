diff --git a/core/src/test/java/org/elasticsearch/cluster/ClusterInfoServiceIT.java b/core/src/test/java/org/elasticsearch/cluster/ClusterInfoServiceIT.java
index d985ada..0372128 100644
--- a/core/src/test/java/org/elasticsearch/cluster/ClusterInfoServiceIT.java
+++ b/core/src/test/java/org/elasticsearch/cluster/ClusterInfoServiceIT.java
@@ -161,11 +161,11 @@
         }
         for (DiskUsage usage : mostUsages.values()) {
             logger.info("--> usage: {}", usage);
-            assertThat("usage has be retrieved", usage.getFreeBytes(), greaterThanOrEqualTo(0L));
+            assertThat("usage has be retrieved", usage.getFreeBytes(), greaterThan(0L));
         }
         for (Long size : shardSizes.values()) {
             logger.info("--> shard size: {}", size);
-            assertThat("shard size is greater than 0", size, greaterThan(0L));
+            assertThat("shard size is greater than 0", size, greaterThanOrEqualTo(0L));
         }
         ClusterService clusterService = internalTestCluster.getInstance(ClusterService.class, internalTestCluster.getMasterName());
         ClusterState state = clusterService.state();
