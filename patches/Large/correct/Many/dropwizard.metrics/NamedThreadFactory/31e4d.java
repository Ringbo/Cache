diff --git a/metrics-core/src/main/java/com/yammer/metrics/util/NamedThreadFactory.java b/metrics-core/src/main/java/com/yammer/metrics/util/NamedThreadFactory.java
index f269e3b..ca3866e 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/util/NamedThreadFactory.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/util/NamedThreadFactory.java
@@ -19,7 +19,7 @@
 
     @Override
     public Thread newThread(Runnable r) {
-        Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement(), 0);
+        final Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement(), 0);
         t.setDaemon(true);
         if (t.getPriority() != Thread.NORM_PRIORITY) {
             t.setPriority(Thread.NORM_PRIORITY);
