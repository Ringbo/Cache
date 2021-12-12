diff --git a/hazelcast/src/main/java/com/hazelcast/instance/HazelcastInstanceImpl.java b/hazelcast/src/main/java/com/hazelcast/instance/HazelcastInstanceImpl.java
index e843b07..8a934b9 100644
--- a/hazelcast/src/main/java/com/hazelcast/instance/HazelcastInstanceImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/instance/HazelcastInstanceImpl.java
@@ -148,7 +148,7 @@
     }
 
     public ILock getLock(Object key) {
-        if (name == null) {
+        if (key == null) {
             throw new NullPointerException("Retrieving a lock instance with a null key is not allowed!");
         }
         return getDistributedObject(LockService.SERVICE_NAME, node.getSerializationService().toData(key));
