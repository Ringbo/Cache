diff --git a/src/main/java/org/elasticsearch/common/geo/builders/BasePolygonBuilder.java b/src/main/java/org/elasticsearch/common/geo/builders/BasePolygonBuilder.java
index 778dc40..628252b 100644
--- a/src/main/java/org/elasticsearch/common/geo/builders/BasePolygonBuilder.java
+++ b/src/main/java/org/elasticsearch/common/geo/builders/BasePolygonBuilder.java
@@ -359,7 +359,7 @@
             current.intersect = current.coordinate;
             final int intersections = intersections(current.coordinate.x, edges);
             final int pos = Arrays.binarySearch(edges, 0, intersections, current, INTERSECTION_ORDER);
-            if (pos < 0) {
+            if (pos >= 0) {
                 throw new ElasticsearchParseException("Invaild shape: Hole is not within polygon");
             }
             final int index = -(pos+2);
