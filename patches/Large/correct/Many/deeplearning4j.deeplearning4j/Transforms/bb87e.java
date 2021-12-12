diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/ops/transforms/Transforms.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/ops/transforms/Transforms.java
index b44efae..0095fd3 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/ops/transforms/Transforms.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/ops/transforms/Transforms.java
@@ -211,7 +211,7 @@
     }
 
     public static INDArray atan(INDArray arr) {
-        return acos(arr,Nd4j.copyOnOps);
+        return atan(arr,Nd4j.copyOnOps);
     }
 
 
