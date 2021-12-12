diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/transactions/TxDeadlockDetectionTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/transactions/TxDeadlockDetectionTest.java
index 87539b2..3d0beac 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/transactions/TxDeadlockDetectionTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/transactions/TxDeadlockDetectionTest.java
@@ -96,7 +96,7 @@
     @Override protected void beforeTestsStarted() throws Exception {
         super.beforeTestsStarted();
 
-        startGrids(NODES_CNT);
+        startGridsMultiThreaded(NODES_CNT);
     }
 
     /** {@inheritDoc} */
@@ -151,7 +151,7 @@
 
                         IgniteCache<Integer, Integer> cache = ignite.cache(CACHE);
 
-                        try (Transaction tx = ignite.transactions().txStart(PESSIMISTIC, REPEATABLE_READ, 500, 0)) {
+                        try (Transaction tx = ignite.transactions().txStart(PESSIMISTIC, REPEATABLE_READ, 700, 0)) {
                             ThreadLocalRandom8 rnd = ThreadLocalRandom8.current();
 
                             for (int i = 0; i < 50; i++) {
@@ -198,7 +198,7 @@
 
         final CyclicBarrier barrier = new CyclicBarrier(2);
 
-        final int timeout = 500;
+        final long timeout = 500;
 
         IgniteInternalFuture<Long> fut = GridTestUtils.runMultiThreadedAsync(new Runnable() {
             @Override public void run() {
@@ -257,7 +257,7 @@
 
             final CyclicBarrier barrier = new CyclicBarrier(threads);
 
-            final int timeout = 500;
+            final long timeout = 500;
 
             IgniteInternalFuture<Long> fut = GridTestUtils.runMultiThreadedAsync(new Runnable() {
                 @Override public void run() {
@@ -336,7 +336,7 @@
         try {
             final int txCnt = 2;
 
-            final CyclicBarrier barrier = new CyclicBarrier(2);
+            final CyclicBarrier barrier = new CyclicBarrier(txCnt);
 
             final AtomicInteger threadCnt = new AtomicInteger();
 
@@ -381,7 +381,7 @@
                         deadlock.compareAndSet(false, hasCause(e, TransactionDeadlockException.class));
                     }
                 }
-            }, 2, "tx-thread");
+            }, txCnt, "tx-thread");
 
             fut.get();
 
