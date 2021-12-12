diff --git a/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java b/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
index a82f8e9..ebe8ec1 100644
--- a/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
+++ b/core/src/main/java/com/graphhopper/routing/ch/PrepareContractionHierarchies.java
@@ -423,7 +423,7 @@
     }
 
     private String getTimesAsString() {
-        return String.format(
+        return String.format(Locale.ROOT,
                 "t(dijk): %6.2f, t(period): %6.2f, t(lazy): %6.2f, t(neighbor): %6.2f",
                 dijkstraTime, periodTime, lazyTime, neighborTime);
     }
@@ -484,7 +484,8 @@
     }
 
     private void logStats(long counter, int updateCounter) {
-        logger.info(String.format("%10s, updates: %2d, nodes: %10s, shortcuts: %10s, dijkstras: %10s, %s, meanDegree: %2d, %s, %s",
+        logger.info(String.format(Locale.ROOT,
+                "%10s, updates: %2d, nodes: %10s, shortcuts: %10s, dijkstras: %10s, %s, meanDegree: %2d, %s, %s",
                 nf(counter), updateCounter, nf(sortedNodes.getSize()),
                 nf(nodeContractor.getAddedShortcutsCount()), nf(nodeContractor.getDijkstraCount()),
                 getTimesAsString(), (long) meanDegree, nodeContractor.getPrepareAlgoMemoryUsage(),
