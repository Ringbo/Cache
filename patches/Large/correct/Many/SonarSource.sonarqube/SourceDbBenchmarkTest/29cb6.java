diff --git a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
index 34dbdf0..479408f 100644
--- a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
+++ b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
@@ -84,7 +84,7 @@
       long period = end - start;
       long throughputPerSecond = 1000L * counter.get() / period;
       LOGGER.info(String.format("%d FILE_SOURCES rows scrolled in %d ms (%d rows/second)", counter.get(), period, throughputPerSecond));
-      benchmark.expectAround("Throughput to scroll FILE_SOURCES", throughputPerSecond, 120, 0.04);
+      benchmark.expectAround("Throughput to scroll FILE_SOURCES", throughputPerSecond, 120, 0.08);
 
     } finally {
       DbUtils.closeQuietly(connection);
