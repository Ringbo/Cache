diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/api/preprocessor/NormalizerMinMaxScaler.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/api/preprocessor/NormalizerMinMaxScaler.java
index c77f5af..64a4078 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/api/preprocessor/NormalizerMinMaxScaler.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/api/preprocessor/NormalizerMinMaxScaler.java
@@ -98,7 +98,7 @@
         // scale by dataset range
         theFeatures.diviRowVector(maxMinusMin);
         // scale by given or default feature range
-        theFeatures.divi(maxRange - minRange + Nd4j.EPS_THRESHOLD);
+        theFeatures.muli(maxRange - minRange + Nd4j.EPS_THRESHOLD);
         // offset by given min feature value
         theFeatures.addi(minRange);
     }
@@ -120,7 +120,7 @@
         if (min == null || max == null) throw new RuntimeException("API_USE_ERROR: Preprocessors have to be explicitly fit before use. Usage: .fit(dataset) or .fit(datasetiterator)");
 
         toPreProcess.getFeatures().subi(minRange);
-        toPreProcess.getFeatures().muli(maxRange - minRange + Nd4j.EPS_THRESHOLD);
+        toPreProcess.getFeatures().divi(maxRange - minRange + Nd4j.EPS_THRESHOLD);
         toPreProcess.getFeatures().muliRowVector(maxMinusMin);
         toPreProcess.getFeatures().addiRowVector(min);
     }
