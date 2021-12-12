diff --git a/modules/core/src/test/java/org/apache/ignite/internal/util/offheap/unsafe/GridUnsafeMemorySelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/util/offheap/unsafe/GridUnsafeMemorySelfTest.java
index 4af1fc0..f55b174 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/util/offheap/unsafe/GridUnsafeMemorySelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/util/offheap/unsafe/GridUnsafeMemorySelfTest.java
@@ -301,7 +301,7 @@
 
         final AtomicBoolean finished = new AtomicBoolean();
 
-        final LongAdder cntr = new LongAdder();
+        final LongAdder8 cntr = new LongAdder8();
 
         final GridUnsafeGuard guard = new GridUnsafeGuard();
 
@@ -315,7 +315,7 @@
 
             X.println("__ starting threads: " + threads + " time: " + time + " sec");
 
-            final LongAdder locAdder = new LongAdder();
+            final LongAdder8 locAdder = new LongAdder8();
 
             IgniteInternalFuture<?> fut = multithreadedAsync(new Callable<Object>() {
                 @Override public Object call() throws Exception {
@@ -409,12 +409,12 @@
         private AtomicBoolean deallocated = new AtomicBoolean();
 
         /** */
-        private LongAdder cntr;
+        private LongAdder8 cntr;
 
         /**
          * @param cntr Counter.
          */
-        CmpMem(LongAdder cntr) {
+        CmpMem(LongAdder8 cntr) {
             this.cntr = cntr;
 
             cntr.increment();
