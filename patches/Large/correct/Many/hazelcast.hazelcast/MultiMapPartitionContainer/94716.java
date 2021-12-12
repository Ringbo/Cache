diff --git a/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapPartitionContainer.java b/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapPartitionContainer.java
index d11e2d5..1488b58 100644
--- a/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapPartitionContainer.java
+++ b/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapPartitionContainer.java
@@ -79,7 +79,7 @@
 
     private void clearLockStore(String name) {
         NodeEngine nodeEngine = service.getNodeEngine();
-        LockService lockService = nodeEngine.getService(LockService.SERVICE_NAME);
+        LockService lockService = nodeEngine.getSharedService(LockService.SERVICE_NAME);
         if (lockService != null) {
             DefaultObjectNamespace namespace = new DefaultObjectNamespace(MultiMapService.SERVICE_NAME, name);
             lockService.clearLockStore(partitionId, namespace);
