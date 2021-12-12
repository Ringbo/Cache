diff --git a/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapService.java b/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapService.java
index 0911387..3bd7e47 100644
--- a/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapService.java
+++ b/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapService.java
@@ -101,7 +101,7 @@
         for (int partition = 0; partition < partitionCount; partition++) {
             partitionContainers[partition] = new MultiMapPartitionContainer(this, partition);
         }
-        final LockService lockService = nodeEngine.getService(LockService.SERVICE_NAME);
+        final LockService lockService = nodeEngine.getSharedService(LockService.SERVICE_NAME);
         if (lockService != null) {
             lockService.registerLockStoreConstructor(SERVICE_NAME,
                     new ConstructorFunction<ObjectNamespace, LockStoreInfo>() {
