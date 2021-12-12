diff --git a/core/src/main/java/org/elasticsearch/common/geo/GeoUtils.java b/core/src/main/java/org/elasticsearch/common/geo/GeoUtils.java
index a586414..aed72f5 100644
--- a/core/src/main/java/org/elasticsearch/common/geo/GeoUtils.java
+++ b/core/src/main/java/org/elasticsearch/common/geo/GeoUtils.java
@@ -82,7 +82,7 @@
 
     /** Returns true if longitude is actually a valid longitude value. */
     public static boolean isValidLongitude(double longitude) {
-        if (Double.isNaN(longitude) || Double.isNaN(longitude) || longitude < GeoUtils.MIN_LON || longitude > GeoUtils.MAX_LON) {
+        if (Double.isNaN(longitude) || Double.isInfinite(longitude) || longitude < GeoUtils.MIN_LON || longitude > GeoUtils.MAX_LON) {
             return false;
         }
         return true;
