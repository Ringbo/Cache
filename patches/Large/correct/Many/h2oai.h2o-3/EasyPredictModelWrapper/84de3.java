diff --git a/h2o-genmodel/src/main/java/hex/genmodel/easy/EasyPredictModelWrapper.java b/h2o-genmodel/src/main/java/hex/genmodel/easy/EasyPredictModelWrapper.java
index 9871b32..f892012 100644
--- a/h2o-genmodel/src/main/java/hex/genmodel/easy/EasyPredictModelWrapper.java
+++ b/h2o-genmodel/src/main/java/hex/genmodel/easy/EasyPredictModelWrapper.java
@@ -233,7 +233,7 @@
 
   private double[] preamble(ModelCategory c, RowData data) throws PredictException {
     validateModelCategory(c);
-    double[] preds = new double[m.getPredsSize()];
+    double[] preds = new double[m.nclasses()];
     preds = predict(data, preds);
     return preds;
   }
