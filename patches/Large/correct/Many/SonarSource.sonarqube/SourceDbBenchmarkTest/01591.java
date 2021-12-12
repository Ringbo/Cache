diff --git a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
index d37f29b..86663dd 100644
--- a/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
+++ b/server/sonar-server-benchmarks/src/test/java/org/sonar/server/benchmark/SourceDbBenchmarkTest.java
@@ -60,7 +60,7 @@
     scrollRows();
   }
 
-  private void scrollRows() throws Exception {
+  private void scrollRows() {
     LOGGER.info("Scroll table FILE_SOURCES");
     AtomicLong counter = new AtomicLong();
     ProgressTask progress = new ProgressTask(LOGGER, "source file", counter);
