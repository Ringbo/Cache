diff --git a/hazelcast/src/main/java/com/hazelcast/map/impl/MapManagedService.java b/hazelcast/src/main/java/com/hazelcast/map/impl/MapManagedService.java
index 40b8019..209a6c3 100644
--- a/hazelcast/src/main/java/com/hazelcast/map/impl/MapManagedService.java
+++ b/hazelcast/src/main/java/com/hazelcast/map/impl/MapManagedService.java
@@ -40,7 +40,7 @@
 
     @Override
     public void init(NodeEngine nodeEngine, Properties properties) {
-        final LockService lockService = nodeEngine.getService(LockService.SERVICE_NAME);
+        final LockService lockService = nodeEngine.getSharedService(LockService.SERVICE_NAME);
         if (lockService != null) {
             lockService.registerLockStoreConstructor(MapService.SERVICE_NAME,
                     new ObjectNamespaceLockStoreInfoConstructorFunction());
