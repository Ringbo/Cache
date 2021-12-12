diff --git a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/PersistFileSourcesStepTest.java b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/PersistFileSourcesStepTest.java
index 8cfa29b..ab033c5 100644
--- a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/PersistFileSourcesStepTest.java
+++ b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/PersistFileSourcesStepTest.java
@@ -106,7 +106,7 @@
     assertThat(dbTester.countRowsOfTable("file_sources")).isEqualTo(NUMBER_OF_FILES);
     LOGGER.info(String.format("File sources have been persisted in %d ms", duration));
 
-    benchmark.expectAround("Duration to persist FILE_SOURCES", duration, 109000, Benchmark.DEFAULT_ERROR_MARGIN_PERCENTS);
+    benchmark.expectAround("Duration to persist FILE_SOURCES", duration, 93700, Benchmark.DEFAULT_ERROR_MARGIN_PERCENTS);
   }
 
   private File prepareReport() throws IOException {
