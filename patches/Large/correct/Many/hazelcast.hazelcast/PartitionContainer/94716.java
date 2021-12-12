diff --git a/hazelcast/src/main/java/com/hazelcast/map/impl/PartitionContainer.java b/hazelcast/src/main/java/com/hazelcast/map/impl/PartitionContainer.java
index fbd3e63..d5cc5c7 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/impl/PartitionContainer.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/impl/PartitionContainer.java
@@ -167,7 +167,7 @@
 
     private void clearLockStore(String name) {
         final NodeEngine nodeEngine = mapService.getMapServiceContext().getNodeEngine();
-        final LockService lockService = nodeEngine.getService(LockService.SERVICE_NAME);
+        final LockService lockService = nodeEngine.getSharedService(LockService.SERVICE_NAME);
         if (lockService != null) {
             final DefaultObjectNamespace namespace = new DefaultObjectNamespace(MapService.SERVICE_NAME, name);
             lockService.clearLockStore(partitionId, namespace);
