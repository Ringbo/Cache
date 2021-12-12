diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/feedforward/classification/PlotUtil.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/feedforward/classification/PlotUtil.java
index 05a4a7b..33bbd69 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/feedforward/classification/PlotUtil.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/feedforward/classification/PlotUtil.java
@@ -88,7 +88,7 @@
         for( int i=0; i<nRows; i++ ){
             xValues[i] = backgroundIn.getDouble(i,0);
             yValues[i] = backgroundIn.getDouble(i,1);
-            zValues[i] = backgroundOut.getDouble(i);
+            zValues[i] = backgroundOut.getDouble(i, 0);
 
         }
 
