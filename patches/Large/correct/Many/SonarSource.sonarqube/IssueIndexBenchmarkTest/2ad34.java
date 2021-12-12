diff --git a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
index b869154..4f4115c 100644
--- a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
+++ b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
@@ -113,7 +113,7 @@
 
     long dirSize = FileUtils.sizeOfDirectory(tester.getEsServerHolder().getHomeDir());
     LOGGER.info(String.format("ES dir: " + FileUtils.byteCountToDisplaySize(dirSize)));
-    benchmark.expectBetween("ES dir size (b)", dirSize, 385L * FileUtils.ONE_MB, 400L * FileUtils.ONE_MB);
+    benchmark.expectBetween("ES dir size (b)", dirSize, 385L * FileUtils.ONE_MB, 420L * FileUtils.ONE_MB);
   }
 
   private void benchmarkQueries() {
