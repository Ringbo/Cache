diff --git a/driver-core/src/main/com/mongodb/connection/MultiServerCluster.java b/driver-core/src/main/com/mongodb/connection/MultiServerCluster.java
index 0f5b86f..ad5f890 100644
--- a/driver-core/src/main/com/mongodb/connection/MultiServerCluster.java
+++ b/driver-core/src/main/com/mongodb/connection/MultiServerCluster.java
@@ -129,7 +129,7 @@
             }
 
             if (event.getNewValue().isOk()) {
-                if (clusterType == UNKNOWN) {
+                if (clusterType == UNKNOWN && newDescription.getType() != REPLICA_SET_GHOST) {
                     clusterType = newDescription.getClusterType();
                     LOGGER.info(format("Discovered cluster type of %s", clusterType));
                 }
