diff --git a/src/community/wcs2_0/src/main/java/org/geoserver/wcs2_0/response/WCS20DescribeCoverageTransformer.java b/src/community/wcs2_0/src/main/java/org/geoserver/wcs2_0/response/WCS20DescribeCoverageTransformer.java
index 53fc92e..b5c5824 100644
--- a/src/community/wcs2_0/src/main/java/org/geoserver/wcs2_0/response/WCS20DescribeCoverageTransformer.java
+++ b/src/community/wcs2_0/src/main/java/org/geoserver/wcs2_0/response/WCS20DescribeCoverageTransformer.java
@@ -235,7 +235,7 @@
             final CoordinateReferenceSystem crs = latLonBoundingBox.getCoordinateReferenceSystem();
 
             // setup vars
-            final String gridId = "grid00__" + NSNameResourceCodec.encode(ci);
+            final String gridId = "grid00__" + NCNameResourceCodec.encode(ci);
             final String axisLabels = "Lat Long"; // should also add elev? time?
             final int gridDimension = ci.getGrid().getGridRange().getDimension();
 
