diff --git a/src/main/java/org/elasticsearch/search/aggregations/metrics/geobounds/InternalGeoBounds.java b/src/main/java/org/elasticsearch/search/aggregations/metrics/geobounds/InternalGeoBounds.java
index 2452571..df66731 100644
--- a/src/main/java/org/elasticsearch/search/aggregations/metrics/geobounds/InternalGeoBounds.java
+++ b/src/main/java/org/elasticsearch/search/aggregations/metrics/geobounds/InternalGeoBounds.java
@@ -172,9 +172,9 @@
         if (Double.isInfinite(top)) {
             return null;
         } else if (Double.isInfinite(posLeft)) {
-            return new BoundingBox(new GeoPoint(top, negLeft), new GeoPoint(bottom, posRight));
+            return new BoundingBox(new GeoPoint(top, negLeft), new GeoPoint(bottom, negRight));
         } else if (Double.isInfinite(negLeft)) {
-            return new BoundingBox(new GeoPoint(top, posLeft), new GeoPoint(bottom, negRight));
+            return new BoundingBox(new GeoPoint(top, posLeft), new GeoPoint(bottom, posRight));
         } else if (wrapLongitude) {
             double unwrappedWidth = posRight - negLeft;
             double wrappedWidth = (180 - posLeft) - (-180 - negRight);
