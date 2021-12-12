diff --git a/quasar-core-jdk8/src/main/java/co/paralleluniverse/fibers/FiberForkJoinScheduler.java b/quasar-core-jdk8/src/main/java/co/paralleluniverse/fibers/FiberForkJoinScheduler.java
index 562972a..90272ab 100644
--- a/quasar-core-jdk8/src/main/java/co/paralleluniverse/fibers/FiberForkJoinScheduler.java
+++ b/quasar-core-jdk8/src/main/java/co/paralleluniverse/fibers/FiberForkJoinScheduler.java
@@ -164,7 +164,7 @@
         return ForkJoinTask.getPool() == fjPool;
     }
 
-    static boolean isFiberThread(Thread t) {
+    public static boolean isFiberThread(Thread t) {
         return t instanceof FiberWorkerThread;
     }
 
