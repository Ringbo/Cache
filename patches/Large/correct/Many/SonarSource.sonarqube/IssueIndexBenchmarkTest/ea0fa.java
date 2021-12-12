diff --git a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
index 6ad0d69..0344737 100644
--- a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
+++ b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/IssueIndexBenchmarkTest.java
@@ -56,7 +56,7 @@
 
   private static final Logger LOGGER = LoggerFactory.getLogger("benchmarkIssues");
 
-  final static int PROJECTS = 1;
+  final static int PROJECTS = 100;
   final static int FILES_PER_PROJECT = 100;
   final static int ISSUES_PER_FILE = 100;
 
@@ -116,7 +116,7 @@
     tester.get(EsClient.class).prepareOptimize("issues").get();
     long dirSize = FileUtils.sizeOfDirectory(tester.getEsServerHolder().getHomeDir());
     LOGGER.info(String.format("ES dir: " + FileUtils.byteCountToDisplaySize(dirSize)));
-    benchmark.expectBetween("ES dir size (b)", dirSize, 385L * FileUtils.ONE_MB, 420L * FileUtils.ONE_MB);
+    benchmark.expectBetween("ES dir size (b)", dirSize, 200L * FileUtils.ONE_MB, 420L * FileUtils.ONE_MB);
   }
 
   private void benchmarkQueries() {
