diff --git a/java/org/apache/tomcat/util/threads/ThreadPoolExecutor.java b/java/org/apache/tomcat/util/threads/ThreadPoolExecutor.java
index b7c14ff..0f0eab7 100644
--- a/java/org/apache/tomcat/util/threads/ThreadPoolExecutor.java
+++ b/java/org/apache/tomcat/util/threads/ThreadPoolExecutor.java
@@ -32,7 +32,7 @@
  */
 public class ThreadPoolExecutor extends java.util.concurrent.ThreadPoolExecutor {
     
-    final AtomicInteger activeCount = new AtomicInteger(0);
+    private final AtomicInteger activeCount = new AtomicInteger(0);
     
     public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
         super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
@@ -92,7 +92,7 @@
             super.execute(command);
         } catch (RejectedExecutionException rx) {
             if (super.getQueue() instanceof TaskQueue) {
-                TaskQueue queue = (TaskQueue)super.getQueue();
+                final TaskQueue queue = (TaskQueue)super.getQueue();
                 try {
                     if (!queue.force(command, timeout, unit)) {
                         throw new RejectedExecutionException("Queue capacity is full.");
@@ -108,7 +108,7 @@
         }
     }
     
-    static class RejectHandler implements java.util.concurrent.RejectedExecutionHandler {
+    private static class RejectHandler implements java.util.concurrent.RejectedExecutionHandler {
         public void rejectedExecution(Runnable r, java.util.concurrent.ThreadPoolExecutor executor) {
             throw new RejectedExecutionException();
         }
