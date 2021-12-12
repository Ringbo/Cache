diff --git a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/PersistFileSourcesStepTest.java b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/PersistFileSourcesStepTest.java
index 491c8b0..eadde39 100644
--- a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/PersistFileSourcesStepTest.java
+++ b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/PersistFileSourcesStepTest.java
@@ -90,7 +90,7 @@
     assertThat(dbTester.countRowsOfTable("file_sources")).isEqualTo(NUMBER_OF_FILES);
     LOGGER.info(String.format("File sources has been persisted in %d ms", duration));
 
-    benchmark.expectAround("Duration to persist FILE_SOURCES", duration, 140000, Benchmark.DEFAULT_ERROR_MARGIN_PERCENTS);
+    benchmark.expectAround("Duration to persist FILE_SOURCES", duration, 125000, Benchmark.DEFAULT_ERROR_MARGIN_PERCENTS);
   }
 
   private File prepareReport() throws IOException {
