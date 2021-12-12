diff --git a/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java b/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
index 83adf2b..00fd080 100644
--- a/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
+++ b/core/src/main/java/com/graphhopper/storage/GraphHopperStorage.java
@@ -584,7 +584,7 @@
     @Override
     public EdgeIteratorState getEdgeProps( int edgeId, int adjNode )
     {
-        if (edgeId <= EdgeIterator.NO_EDGE || edgeId > edgeCount)
+        if (edgeId <= EdgeIterator.NO_EDGE || edgeId >= edgeCount)
             throw new IllegalStateException("edgeId " + edgeId + " out of bounds [0," + nf(edgeCount) + "]");
 
         if (adjNode < 0 && adjNode != Integer.MIN_VALUE)
