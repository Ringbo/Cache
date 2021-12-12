diff --git a/pinot-tools/src/main/java/com/linkedin/pinot/tools/perf/PerfBenchmarkRunner.java b/pinot-tools/src/main/java/com/linkedin/pinot/tools/perf/PerfBenchmarkRunner.java
index ea72cf5..f025889 100644
--- a/pinot-tools/src/main/java/com/linkedin/pinot/tools/perf/PerfBenchmarkRunner.java
+++ b/pinot-tools/src/main/java/com/linkedin/pinot/tools/perf/PerfBenchmarkRunner.java
@@ -102,11 +102,12 @@
     return true;
   }
 
-  public static void startAllButServer()
+  public void startAllButServer()
       throws Exception {
     PerfBenchmarkDriverConf perfBenchmarkDriverConf = new PerfBenchmarkDriverConf();
     perfBenchmarkDriverConf.setStartServer(false);
-    PerfBenchmarkDriver driver = new PerfBenchmarkDriver(perfBenchmarkDriverConf);
+    PerfBenchmarkDriver driver =
+        new PerfBenchmarkDriver(perfBenchmarkDriverConf, _tempDir, _loadMode, _segmentFormatVersion, false);
     driver.run();
   }
 
