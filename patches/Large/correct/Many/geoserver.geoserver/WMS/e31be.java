diff --git a/src/wms/src/main/java/org/geoserver/wms/WMS.java b/src/wms/src/main/java/org/geoserver/wms/WMS.java
index 18f83c1..8d308bc 100644
--- a/src/wms/src/main/java/org/geoserver/wms/WMS.java
+++ b/src/wms/src/main/java/org/geoserver/wms/WMS.java
@@ -822,7 +822,7 @@
                     fixedElevations, "ELEVATION", "Elevation");
         }
 
-        if (layerFilter != null) {
+        if (layerFilter != null && readParameters != null) {
         	// test for default [empty is replaced with INCLUDE filter] ]filter
     		for (int i=0; i<readParameters.length; i++){
     			
