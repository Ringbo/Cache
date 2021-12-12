diff --git a/src/java/voldemort/utils/RebalanceUtils.java b/src/java/voldemort/utils/RebalanceUtils.java
index aae753c..cb29de6 100644
--- a/src/java/voldemort/utils/RebalanceUtils.java
+++ b/src/java/voldemort/utils/RebalanceUtils.java
@@ -142,7 +142,7 @@
             try {
                 Versioned<Cluster> versionedCluster = adminClient.getRemoteCluster(node.getId());
                 VectorClock newClock = (VectorClock) versionedCluster.getVersion();
-                if(null != newClock && !clusterList.contains(newClock)) {
+                if(null != newClock && !clusterList.contains(versionedCluster)) {
                     // check no two clocks are concurrent.
                     checkNotConcurrent(clusterList, newClock);
 
