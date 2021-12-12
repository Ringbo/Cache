diff --git a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
index faa4279..05dc434 100644
--- a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
+++ b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
@@ -114,7 +114,7 @@
     long period = System.currentTimeMillis() - start;
     long throughputPerSecond = 1000 * issues.count.get() / period;
     LOGGER.info(String.format("%d issues indexed in %d ms (%d docs/second)", issues.count.get(), period, throughputPerSecond));
-    benchmark.expectAround("Throughput to index issues", throughputPerSecond, 5116, Benchmark.DEFAULT_ERROR_MARGIN_PERCENTS);
+    benchmark.expectAround("Throughput to index issues", throughputPerSecond, 6500, Benchmark.DEFAULT_ERROR_MARGIN_PERCENTS);
 
     // be sure that physical files do not evolve during estimation of size
     tester.get(EsClient.class).prepareOptimize("issues").setWaitForMerge(true).get();
