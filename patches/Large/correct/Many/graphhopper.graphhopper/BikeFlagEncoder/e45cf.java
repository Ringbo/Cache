diff --git a/core/src/main/java/com/graphhopper/routing/util/BikeFlagEncoder.java b/core/src/main/java/com/graphhopper/routing/util/BikeFlagEncoder.java
index 279b86c..cd209d6 100644
--- a/core/src/main/java/com/graphhopper/routing/util/BikeFlagEncoder.java
+++ b/core/src/main/java/com/graphhopper/routing/util/BikeFlagEncoder.java
@@ -278,7 +278,7 @@
             // Populate bits at wayTypemask with wayType            
             wayType ourwayType = wayType.OTHERSMALLWAY;
             if (way.hasTag("highway", pushing_sections))
-               ourwayType=wayType.WHEELER;
+               ourwayType=wayType.PUSHING_SECTION;
             if ( (way.hasTag("bicycle", intended) && way.hasTag("highway", pushing_sections)) ||
                  (way.getTag("highway") == "cycleway") )
                 ourwayType=wayType.CYCLEWAY;
@@ -516,7 +516,7 @@
     private enum wayType
     {
         ROAD(0),
-        WHEELER(1),
+        PUSHING_SECTION(1),
         CYCLEWAY(2),
         OTHERSMALLWAY(3);
        
