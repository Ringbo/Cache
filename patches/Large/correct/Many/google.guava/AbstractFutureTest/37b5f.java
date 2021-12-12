diff --git a/guava-tests/test/com/google/common/util/concurrent/AbstractFutureTest.java b/guava-tests/test/com/google/common/util/concurrent/AbstractFutureTest.java
index f5c5ff0..41b9c84 100644
--- a/guava-tests/test/com/google/common/util/concurrent/AbstractFutureTest.java
+++ b/guava-tests/test/com/google/common/util/concurrent/AbstractFutureTest.java
@@ -605,7 +605,7 @@
     executor.shutdown();
   }
 
-  private int awaitUnchecked(final CyclicBarrier barrier) {
+  private static int awaitUnchecked(final CyclicBarrier barrier) {
     try {
       return barrier.await();
     } catch (Exception e) {
