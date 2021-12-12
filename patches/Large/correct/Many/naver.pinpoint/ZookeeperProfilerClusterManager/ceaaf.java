diff --git a/collector/src/main/java/com/navercorp/pinpoint/collector/cluster/zookeeper/ZookeeperProfilerClusterManager.java b/collector/src/main/java/com/navercorp/pinpoint/collector/cluster/zookeeper/ZookeeperProfilerClusterManager.java
index e9c61cb..3c046aa 100644
--- a/collector/src/main/java/com/navercorp/pinpoint/collector/cluster/zookeeper/ZookeeperProfilerClusterManager.java
+++ b/collector/src/main/java/com/navercorp/pinpoint/collector/cluster/zookeeper/ZookeeperProfilerClusterManager.java
@@ -156,7 +156,7 @@
     }
 
     public void initZookeeperClusterData() {
-        profileCluster.clear();
+        worker.clear();
 
         synchronized (lock) {
             List clusterPointList = profileCluster.getClusterPointList();
