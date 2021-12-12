diff --git a/hazelcast/src/main/java/com/hazelcast/impl/ExecutorManager.java b/hazelcast/src/main/java/com/hazelcast/impl/ExecutorManager.java
index 0e08a46..4afa000 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/ExecutorManager.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/ExecutorManager.java
@@ -73,7 +73,7 @@
         ClassLoader classLoader = node.getConfig().getClassLoader();
         threadPoolExecutor = new ThreadPoolExecutor(
                 5, Integer.MAX_VALUE,
-                6L,
+                60L,
                 TimeUnit.SECONDS,
                 new SynchronousQueue(),
                 new ExecutorThreadFactory(node.threadGroup, node.getThreadPoolNamePrefix("cached"), classLoader),
