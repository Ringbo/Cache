diff --git a/hazelcast/src/main/java/com/hazelcast/management/operation/UpdateMapConfigOperation.java b/hazelcast/src/main/java/com/hazelcast/management/operation/UpdateMapConfigOperation.java
index b9c26af..4546714 100644
--- a/hazelcast/src/main/java/com/hazelcast/management/operation/UpdateMapConfigOperation.java
+++ b/hazelcast/src/main/java/com/hazelcast/management/operation/UpdateMapConfigOperation.java
@@ -52,7 +52,7 @@
         newConfig.setEvictionPolicy(mapConfig.getEvictionPolicy());
         newConfig.setEvictionPercentage(mapConfig.getEvictionPercentage());
         newConfig.setReadBackupData(mapConfig.isReadBackupData());
-        newConfig.setBackupCount(mapConfig.getTotalBackupCount());
+        newConfig.setBackupCount(mapConfig.getBackupCount());
         newConfig.setAsyncBackupCount(mapConfig.getAsyncBackupCount());
         newConfig.setMaxSizeConfig(mapConfig.getMaxSizeConfig());
         service.getMapContainer(mapName).setMapConfig(newConfig.getAsReadOnly());
