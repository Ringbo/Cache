diff --git a/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_6_0G1.java b/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_6_0G1.java
index e2d2073..ae24a45 100644
--- a/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_6_0G1.java
+++ b/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_6_0G1.java
@@ -25,9 +25,9 @@
         GCModel model = reader.read();
         
         assertEquals("gc pause sum", 62.616796, model.getPause().getSum(), 0.000000001);
-        assertEquals("throughput", 47.9126598178, model.getThroughput(), 0.000000001);
+        assertEquals("throughput", 47.75795226, model.getThroughput(), 0.000000001);
         assertEquals("longest pause", 0.1581177, model.getPause().getMax(), 0.000001);
-        assertEquals("total runtime", 120.215, model.getRunningTime(), 0.000001);
+        assertEquals("total runtime", 119.859, model.getRunningTime(), 0.000001);
         assertEquals("number of errors", 2, handler.getCount());
         
         assertEquals("max interval", 0.211, model.getPauseInterval().getMax(), 0.000001);
