diff --git a/threads/src/main/java/org/jboss/as/threads/QueuelessThreadPoolExecutorElement.java b/threads/src/main/java/org/jboss/as/threads/QueuelessThreadPoolExecutorElement.java
index ceaae8b..0ede97a 100644
--- a/threads/src/main/java/org/jboss/as/threads/QueuelessThreadPoolExecutorElement.java
+++ b/threads/src/main/java/org/jboss/as/threads/QueuelessThreadPoolExecutorElement.java
@@ -128,7 +128,7 @@
         serviceBuilder.addDependency(threadFactoryName, ThreadFactory.class, service.getThreadFactoryInjector());
 
         final String handoffExecutor = getHandoffExecutor();
-        if (handoffExecutor == null) {
+        if (handoffExecutor != null) {
             final ServiceName handoffExecutorName = JBOSS_THREAD_EXECUTOR.append(handoffExecutor);
             serviceBuilder.addDependency(handoffExecutorName, Executor.class, service.getHandoffExecutorInjector());
         }
