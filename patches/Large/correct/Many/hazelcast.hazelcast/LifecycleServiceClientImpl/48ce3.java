diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/LifecycleServiceClientImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/LifecycleServiceClientImpl.java
index 23f9db8..2a57598 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/LifecycleServiceClientImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/LifecycleServiceClientImpl.java
@@ -83,12 +83,12 @@
         Callable<Boolean> callable = new Callable<Boolean>() {
             public Boolean call() {
                 synchronized (lifecycleLock) {
-                    if (paused.get()) {
+                    if (!paused.get()) {
                         fireLifecycleEvent(PAUSING);
                     } else {
                         return false;
                     }
-                    paused.set(false);
+                    paused.set(true);
                     fireLifecycleEvent(PAUSED);
                     return true;
                 }
