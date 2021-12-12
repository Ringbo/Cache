diff --git a/threads/src/main/java/org/jboss/as/threads/BoundedQueueThreadPoolExecutorElement.java b/threads/src/main/java/org/jboss/as/threads/BoundedQueueThreadPoolExecutorElement.java
index 6d99928..7488677 100644
--- a/threads/src/main/java/org/jboss/as/threads/BoundedQueueThreadPoolExecutorElement.java
+++ b/threads/src/main/java/org/jboss/as/threads/BoundedQueueThreadPoolExecutorElement.java
@@ -146,7 +146,7 @@
         }
         serviceBuilder.addDependency(threadFactoryName, ThreadFactory.class, service.getThreadFactoryInjector());
         final String handoffExecutor = this.handoffExecutor;
-        if (handoffExecutor == null) {
+        if (handoffExecutor != null) {
             final ServiceName handoffExecutorName = JBOSS_THREAD_EXECUTOR.append(handoffExecutor);
             serviceBuilder.addDependency(handoffExecutorName, Executor.class, service.getHandoffExecutorInjector());
         }
