diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/DataSet.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/DataSet.java
index 026b19a..cc33aee 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/DataSet.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/dataset/DataSet.java
@@ -227,7 +227,7 @@
 
                 break;
             case 4:
-                labelsOut = merge4dCnnData(featuresToMerge);
+                labelsOut = merge4dCnnData(labelsToMerge);
                 labelsMaskOut = null;
                 break;
             default:
