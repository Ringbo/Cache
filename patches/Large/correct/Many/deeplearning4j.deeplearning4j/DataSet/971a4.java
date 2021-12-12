diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/DataSet.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/DataSet.java
index 2fe4213..c303fea 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/DataSet.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/DataSet.java
@@ -440,7 +440,7 @@
             dimensions.add(ArrayUtil.range(1, getFeaturesMaskArray().rank()));
         }
 
-        if (featuresMask != null) {
+        if (labelsMask != null) {
             arrays.add(getLabelsMaskArray());
             dimensions.add(ArrayUtil.range(1, getLabelsMaskArray().rank()));
         }
