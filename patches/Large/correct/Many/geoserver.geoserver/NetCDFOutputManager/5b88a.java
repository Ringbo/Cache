diff --git a/src/extension/netcdf-out/src/main/java/org/geoserver/wcs/responses/NetCDFOutputManager.java b/src/extension/netcdf-out/src/main/java/org/geoserver/wcs/responses/NetCDFOutputManager.java
index ec34c09..39cf1ad 100644
--- a/src/extension/netcdf-out/src/main/java/org/geoserver/wcs/responses/NetCDFOutputManager.java
+++ b/src/extension/netcdf-out/src/main/java/org/geoserver/wcs/responses/NetCDFOutputManager.java
@@ -265,7 +265,7 @@
                 if (NetCDFUtilities.isATime(dataType)) {
                     tree = 
                             //new TreeSet(new DateRangeComparator());
-                            isRange ? new TreeSet(new DateRangeComparator()) : new TreeSet<Date>();
+                            isRange ? new TreeSet(new DateRangeComparator()) : new TreeSet<Object>();
                 } else {
                     tree = //new TreeSet<Object>();
                             isRange ? new TreeSet(new NumberRangeComparator()) : new TreeSet<Object>();
