diff --git a/core/src/test/java/com/graphhopper/reader/OSMReaderTest.java b/core/src/test/java/com/graphhopper/reader/OSMReaderTest.java
index 65f02e9..900bc0c 100644
--- a/core/src/test/java/com/graphhopper/reader/OSMReaderTest.java
+++ b/core/src/test/java/com/graphhopper/reader/OSMReaderTest.java
@@ -296,7 +296,7 @@
         int n80 = AbstractGraphStorageTester.getIdOf(graph, 54.1);
         EdgeIterator iter = carOutExplorer.setBaseNode(n80);
         iter.next();
-        assertEquals(10, carEncoder.getSpeed(iter.getFlags()));
+        assertEquals(5, carEncoder.getSpeed(iter.getFlags()));
 
         // more precise speed calculation! ~150km (from 54.0,10.1 to 55.0,10.1) in duration=70 minutes -> wow ;)
         // => 130km/h => / 1.4 => 92km/h        
