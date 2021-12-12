diff --git a/hazelcast/src/main/java/com/hazelcast/instance/LifecycleServiceImpl.java b/hazelcast/src/main/java/com/hazelcast/instance/LifecycleServiceImpl.java
index 86ad42e..a6dafbb 100644
--- a/hazelcast/src/main/java/com/hazelcast/instance/LifecycleServiceImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/instance/LifecycleServiceImpl.java
@@ -97,7 +97,7 @@
     public void shutdown() {
         synchronized (lifecycleLock) {
             fireLifecycleEvent(SHUTTING_DOWN);
-            instance.managementService.unregister();
+            instance.managementService.destroy();
             instance.node.shutdown(false, true);
             HazelcastInstanceFactory.remove(instance);
             fireLifecycleEvent(SHUTDOWN);
@@ -107,7 +107,7 @@
     public void kill() {
         synchronized (lifecycleLock) {
             fireLifecycleEvent(SHUTTING_DOWN);
-            instance.managementService.unregister();
+            instance.managementService.destroy();
             instance.node.shutdown(true, true);
             HazelcastInstanceFactory.remove(instance);
             fireLifecycleEvent(SHUTDOWN);
