diff --git a/modules/core/src/test/java/org/apache/ignite/lang/utils/GridCircularBufferPerformanceTest.java b/modules/core/src/test/java/org/apache/ignite/lang/utils/GridCircularBufferPerformanceTest.java
index ceeac1d..de45bcd 100644
--- a/modules/core/src/test/java/org/apache/ignite/lang/utils/GridCircularBufferPerformanceTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/lang/utils/GridCircularBufferPerformanceTest.java
@@ -36,7 +36,7 @@
         int size = 256 * 1024;
 
         final GridCircularBuffer<Integer> buf = new GridCircularBuffer<>(size);
-        final LongAdder cnt = new LongAdder();
+        final LongAdder8 cnt = new LongAdder8();
         final AtomicBoolean finished = new AtomicBoolean();
 
         multithreadedAsync(new Callable<Object>() {
@@ -74,7 +74,7 @@
     public void testDequeueThroughput() throws Exception {
 
         final ConcurrentLinkedDeque8<Integer> buf = new ConcurrentLinkedDeque8<>();
-        final LongAdder cnt = new LongAdder();
+        final LongAdder8 cnt = new LongAdder8();
         final AtomicBoolean finished = new AtomicBoolean();
 
         multithreadedAsync(new Callable<Object>() {
@@ -118,7 +118,7 @@
         final int size = 256 * 1024;
 
         final ArrayBlockingQueue<Integer> buf = new ArrayBlockingQueue<>(size);
-        final LongAdder cnt = new LongAdder();
+        final LongAdder8 cnt = new LongAdder8();
         final AtomicBoolean finished = new AtomicBoolean();
 
         multithreadedAsync(new Callable<Object>() {
@@ -159,7 +159,7 @@
         final int size = 256 * 1024;
 
         final ArrayBlockingQueue<Integer> buf = new ArrayBlockingQueue<>(size);
-        final LongAdder cnt = new LongAdder();
+        final LongAdder8 cnt = new LongAdder8();
         final AtomicBoolean finished = new AtomicBoolean();
 
         multithreadedAsync(new Callable<Object>() {
