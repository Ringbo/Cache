diff --git a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheQuerySimpleBenchmark.java b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheQuerySimpleBenchmark.java
index 86cea6b..7ba1018 100644
--- a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheQuerySimpleBenchmark.java
+++ b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheQuerySimpleBenchmark.java
@@ -110,7 +110,7 @@
 
         final AtomicBoolean end = new AtomicBoolean();
 
-        final LongAdder puts = new LongAdder();
+        final LongAdder8 puts = new LongAdder8();
 
         IgniteInternalFuture<?> fut0 = multithreadedAsync(new Callable<Void>() {
             @Override public Void call() throws Exception {
@@ -128,7 +128,7 @@
             }
         }, 10);
 
-        final LongAdder qrys = new LongAdder();
+        final LongAdder8 qrys = new LongAdder8();
 
         IgniteInternalFuture<?> fut1 = multithreadedAsync(new Callable<Void>() {
             @Override public Void call() throws Exception {
