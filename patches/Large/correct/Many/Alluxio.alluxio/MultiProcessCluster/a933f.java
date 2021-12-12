diff --git a/minicluster/src/main/java/alluxio/multi/process/MultiProcessCluster.java b/minicluster/src/main/java/alluxio/multi/process/MultiProcessCluster.java
index 1616934..dea4af3 100644
--- a/minicluster/src/main/java/alluxio/multi/process/MultiProcessCluster.java
+++ b/minicluster/src/main/java/alluxio/multi/process/MultiProcessCluster.java
@@ -463,7 +463,7 @@
      * @return the builder
      */
     public Builder addProperty(PropertyKey key, String value) {
-      Preconditions.checkState(key.equals(PropertyKey.ZOOKEEPER_ENABLED),
+      Preconditions.checkState(!key.equals(PropertyKey.ZOOKEEPER_ENABLED),
           "Enable Zookeeper via #setDeployMode instead of #addProperty");
       mProperties.put(key, value);
       return this;
