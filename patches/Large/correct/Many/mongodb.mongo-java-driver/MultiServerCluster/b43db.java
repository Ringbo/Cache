diff --git a/src/main/com/mongodb/MultiServerCluster.java b/src/main/com/mongodb/MultiServerCluster.java
index 940d1a3..e245b2f 100644
--- a/src/main/com/mongodb/MultiServerCluster.java
+++ b/src/main/com/mongodb/MultiServerCluster.java
@@ -125,7 +125,7 @@
             }
 
             if (event.getNewValue().isOk()) {
-                if (clusterType == Unknown) {
+                if (clusterType == Unknown && newDescription.getType() != ReplicaSetGhost) {
                     clusterType = newDescription.getClusterType();
                     LOGGER.info(format("Discovered cluster type of %s", clusterType));
                 }
