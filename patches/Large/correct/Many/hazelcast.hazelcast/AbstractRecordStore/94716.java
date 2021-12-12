diff --git a/hazelcast/src/main/java/com/hazelcast/map/impl/recordstore/AbstractRecordStore.java b/hazelcast/src/main/java/com/hazelcast/map/impl/recordstore/AbstractRecordStore.java
index d785349..50107b9 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/impl/recordstore/AbstractRecordStore.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/impl/recordstore/AbstractRecordStore.java
@@ -186,7 +186,7 @@
 
     protected LockStore createLockStore() {
         NodeEngine nodeEngine = mapServiceContext.getNodeEngine();
-        final LockService lockService = nodeEngine.getService(LockService.SERVICE_NAME);
+        final LockService lockService = nodeEngine.getSharedService(LockService.SERVICE_NAME);
         if (lockService == null) {
             return null;
         }
