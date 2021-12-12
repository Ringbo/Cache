diff --git a/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapContainer.java b/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapContainer.java
index 5fd527b..1dd3326 100644
--- a/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapContainer.java
+++ b/hazelcast/src/main/java/com/hazelcast/multimap/impl/MultiMapContainer.java
@@ -56,7 +56,7 @@
         super(name, service.getNodeEngine());
         this.partitionId = partitionId;
         this.lockNamespace = new DefaultObjectNamespace(MultiMapService.SERVICE_NAME, name);
-        final LockService lockService = nodeEngine.getService(LockService.SERVICE_NAME);
+        final LockService lockService = nodeEngine.getSharedService(LockService.SERVICE_NAME);
         this.lockStore = lockService == null ? null : lockService.createLockStore(partitionId, lockNamespace);
         this.creationTime = currentTimeMillis();
     }
@@ -181,7 +181,7 @@
     }
 
     public void destroy() {
-        final LockService lockService = nodeEngine.getService(LockService.SERVICE_NAME);
+        final LockService lockService = nodeEngine.getSharedService(LockService.SERVICE_NAME);
         if (lockService != null) {
             lockService.clearLockStore(partitionId, lockNamespace);
         }
