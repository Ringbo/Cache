diff --git a/jetty-io/src/main/java/org/eclipse/jetty/io/SelectorManager.java b/jetty-io/src/main/java/org/eclipse/jetty/io/SelectorManager.java
index b81a09d..3233718 100644
--- a/jetty-io/src/main/java/org/eclipse/jetty/io/SelectorManager.java
+++ b/jetty-io/src/main/java/org/eclipse/jetty/io/SelectorManager.java
@@ -61,11 +61,11 @@
     private long _selectorIndex;
     private int _reservedThreads = -1;
 
-    public static int defaultSchedulers(Executor executor)
+    private static int defaultSelectors(Executor executor)
     {
-        if (executor instanceof ThreadPool)
+        if (executor instanceof ThreadPool.SizedThreadPool)
         {
-            int threads = ((ThreadPool)executor).getThreads();
+            int threads = ((ThreadPool.SizedThreadPool)executor).getMaxThreads();
             int cpus = Runtime.getRuntime().availableProcessors();
             return Math.max(1,Math.min(cpus/2,threads/16));
         }
@@ -87,7 +87,7 @@
     protected SelectorManager(Executor executor, Scheduler scheduler, int selectors)
     {
         if (selectors <= 0)
-            selectors = defaultSchedulers(executor);
+            selectors = defaultSelectors(executor);
         this.executor = executor;
         this.scheduler = scheduler;
         _selectors = new ManagedSelector[selectors];
