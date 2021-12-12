diff --git a/activemq-core/src/main/java/org/apache/activemq/thread/TaskRunnerFactory.java b/activemq-core/src/main/java/org/apache/activemq/thread/TaskRunnerFactory.java
index 73b96d6..2d22169 100755
--- a/activemq-core/src/main/java/org/apache/activemq/thread/TaskRunnerFactory.java
+++ b/activemq-core/src/main/java/org/apache/activemq/thread/TaskRunnerFactory.java
@@ -76,7 +76,7 @@
     }
 
     protected ExecutorService createDefaultExecutor() {
-        ThreadPoolExecutor rc = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new ThreadFactory() {
+        ThreadPoolExecutor rc = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new ThreadFactory() {
             public Thread newThread(Runnable runnable) {
                 Thread thread = new Thread(runnable, name);
                 thread.setDaemon(daemon);
