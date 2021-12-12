diff --git a/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_5_0.java b/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_5_0.java
index ab952fc..7a56e6c 100644
--- a/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_5_0.java
+++ b/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_5_0.java
@@ -26,7 +26,7 @@
         GCModel model = reader.read();
         
         assertEquals("size", 515, model.size());
-        assertEquals("throughput", 88.275334, model.getThroughput(), 0.00000001);
+        assertEquals("throughput", 88.28044896, model.getThroughput(), 0.00000001);
         assertEquals("sum of pauses", model.getPause().getSum(), model.getFullGCPause().getSum() + model.getGCPause().getSum(), 0.0000001);
         assertEquals("total pause", 9.1337492, model.getPause().getSum(), 0.0000001);
         assertEquals("full gc pause", 5.1633541, model.getFullGCPause().getSum(), 0.00000001);
@@ -47,7 +47,7 @@
         GCModel model = reader.read();
 
         assertEquals("size", 810, model.size());
-        assertEquals("throughput", 94.155883322, model.getThroughput(), 0.00000001);
+        assertEquals("throughput", 94.17869828, model.getThroughput(), 0.00000001);
         assertEquals("total gc pause", 2.3410947, model.getPause().getSum(), 0.000000001);
         assertEquals("gc pause", 2.3410947, model.getGCPause().getSum(), 0.000000001);
         assertEquals("full gc paus", 0.0, model.getFullGCPause().getSum(), 0.01);
@@ -69,7 +69,7 @@
         GCModel model = reader.read();
         
         assertEquals("size", 3417, model.size());
-        assertEquals("throughput", 78.588803087, model.getThroughput(), 0.00000001);
+        assertEquals("throughput", 78.5579711577, model.getThroughput(), 0.00000001);
         assertEquals("gc pause", 181.8116798, model.getPause().getSum(), 0.000000001);
     }
 
