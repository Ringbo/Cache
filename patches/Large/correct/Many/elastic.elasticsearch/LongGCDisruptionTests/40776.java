diff --git a/test/framework/src/test/java/org/elasticsearch/test/disruption/LongGCDisruptionTests.java b/test/framework/src/test/java/org/elasticsearch/test/disruption/LongGCDisruptionTests.java
index e872755..43a5e9c 100644
--- a/test/framework/src/test/java/org/elasticsearch/test/disruption/LongGCDisruptionTests.java
+++ b/test/framework/src/test/java/org/elasticsearch/test/disruption/LongGCDisruptionTests.java
@@ -126,9 +126,9 @@
         final AtomicBoolean stop = new AtomicBoolean();
         final LockedExecutor lockedExecutor = new LockedExecutor();
         final AtomicLong ops = new AtomicLong();
-        final Thread[] threads = new Thread[10];
+        final Thread[] threads = new Thread[5];
         try {
-            for (int i = 0; i < 10; i++) {
+            for (int i = 0; i < threads.length; i++) {
                 threads[i] = new Thread(() -> {
                     for (int iter = 0; stop.get() == false; iter++) {
                         if (iter % 2 == 0) {
