diff --git a/deeplearning4j-nearestneighbors-parent/nearestneighbor-core/src/main/java/org/deeplearning4j/clustering/vptree/VPTree.java b/deeplearning4j-nearestneighbors-parent/nearestneighbor-core/src/main/java/org/deeplearning4j/clustering/vptree/VPTree.java
index 1d5f8b7..edea629 100644
--- a/deeplearning4j-nearestneighbors-parent/nearestneighbor-core/src/main/java/org/deeplearning4j/clustering/vptree/VPTree.java
+++ b/deeplearning4j-nearestneighbors-parent/nearestneighbor-core/src/main/java/org/deeplearning4j/clustering/vptree/VPTree.java
@@ -469,7 +469,7 @@
      */
     public void search(@NonNull INDArray target, int k, List<DataPoint> results, List<Double> distances) {
         if (items != null)
-            if (!target.isVector() || target.columns() != items.columns() || target.rows() > 1)
+            if (!target.isVectorOrScalar() || target.columns() != items.columns() || target.rows() > 1)
                 throw new ND4JIllegalStateException("Target for search should have shape of [" + 1 + ", "
                         + items.columns() + "] but got " + Arrays.toString(target.shape()) + " instead");
 
