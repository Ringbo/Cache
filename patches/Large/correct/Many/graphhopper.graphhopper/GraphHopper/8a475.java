diff --git a/core/src/main/java/com/graphhopper/GraphHopper.java b/core/src/main/java/com/graphhopper/GraphHopper.java
index 5c460ec..e83fb13 100644
--- a/core/src/main/java/com/graphhopper/GraphHopper.java
+++ b/core/src/main/java/com/graphhopper/GraphHopper.java
@@ -922,7 +922,7 @@
         }
 
         if (weighting == null)
-            throw new IllegalArgumentException("weighting " + weighting + " not supported");
+            throw new IllegalArgumentException("weighting " + weightingStr + " not supported");
 
         if (hintsMap.has(Routing.BLOCK_AREA)) {
             String blockAreaStr = hintsMap.get(Parameters.Routing.BLOCK_AREA, "");
