diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ExecutorServiceClientProxy.java b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ExecutorServiceClientProxy.java
index 10e9c08..634354b 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ExecutorServiceClientProxy.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/proxy/ExecutorServiceClientProxy.java
@@ -234,7 +234,7 @@
     }
 
     public <T> Future<T> submit(Runnable task, T result) {
-        return submit(new RunnableAdapter<T>(task, result));
+        return submit(new RunnableAdapter<T>(task));
     }
 
     public Future<?> submit(Runnable task) {
