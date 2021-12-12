diff --git a/core/src/main/java/org/apache/mahout/utils/SquaredEuclideanDistanceMeasure.java b/core/src/main/java/org/apache/mahout/utils/SquaredEuclideanDistanceMeasure.java
index 254b142..2c6a8b3 100644
--- a/core/src/main/java/org/apache/mahout/utils/SquaredEuclideanDistanceMeasure.java
+++ b/core/src/main/java/org/apache/mahout/utils/SquaredEuclideanDistanceMeasure.java
@@ -77,7 +77,7 @@
 
   @Override
   public double distance(double centroidLengthSquare, Vector centroid, Vector v) {
-    if (centroid.size() != centroid.size()) {
+    if (centroid.size() != v.size()) {
       throw new CardinalityException();
     }
 
