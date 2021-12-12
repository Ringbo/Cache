diff --git a/core/src/test/java/com/graphhopper/reader/OSMReaderTest.java b/core/src/test/java/com/graphhopper/reader/OSMReaderTest.java
index fe3a709..c3015c9 100644
--- a/core/src/test/java/com/graphhopper/reader/OSMReaderTest.java
+++ b/core/src/test/java/com/graphhopper/reader/OSMReaderTest.java
@@ -308,7 +308,7 @@
         int n60 = AbstractGraphTester.getIdOf(graph, 56.0);
         EdgeIterator iter = graph.getEdges(n60);
         iter.next();
-        assertEquals(40, carEncoder.getSpeed(iter.getFlags()));
+        assertEquals(35, carEncoder.getSpeed(iter.getFlags()));
     }
 
     @Test
