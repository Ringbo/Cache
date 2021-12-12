diff --git a/src/main/java/lambdasinaction/chap6/ParallelStreamsHarness.java b/src/main/java/lambdasinaction/chap6/ParallelStreamsHarness.java
index 858e74d..6a6c4fb 100644
--- a/src/main/java/lambdasinaction/chap6/ParallelStreamsHarness.java
+++ b/src/main/java/lambdasinaction/chap6/ParallelStreamsHarness.java
@@ -8,7 +8,7 @@
     public static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
 
     public static void main(String[] args) {
-        System.out.println("Iterative Sum done in: " + measurePerf(ParallelStreams::sequentialSum, 10_000_000L) + " msecs");
+        System.out.println("Iterative Sum done in: " + measurePerf(ParallelStreams::iterativeSum, 10_000_000L) + " msecs");
         System.out.println("Sequential Sum done in: " + measurePerf(ParallelStreams::sequentialSum, 10_000_000L) + " msecs");
         System.out.println("Parallel forkJoinSum done in: " + measurePerf(ParallelStreams::parallelSum, 10_000_000L) + " msecs" );
         System.out.println("Range forkJoinSum done in: " + measurePerf(ParallelStreams::rangedSum, 10_000_000L) + " msecs");
