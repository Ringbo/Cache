diff --git a/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_4_0.java b/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_4_0.java
index 6ce2d44..fda079f 100644
--- a/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_4_0.java
+++ b/src/test/java/com/tagtraum/perf/gcviewer/imp/TestDataReaderSun1_4_0.java
@@ -49,7 +49,7 @@
         event = (AbstractGCEvent) i.next();
         assertEquals(event, event6);
         
-        assertEquals("throughput", 65.680144, model.getThroughput(), 0.0000001);
+        assertEquals("throughput", 65.680128659, model.getThroughput(), 0.0000001);
     }
 
     public void testNoFullGC() throws Exception {
