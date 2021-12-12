diff --git a/h2o-core/src/main/java/water/api/ModelMetricsRegressionV3.java b/h2o-core/src/main/java/water/api/ModelMetricsRegressionV3.java
index 9cf039b..c9bcbff 100644
--- a/h2o-core/src/main/java/water/api/ModelMetricsRegressionV3.java
+++ b/h2o-core/src/main/java/water/api/ModelMetricsRegressionV3.java
@@ -9,9 +9,9 @@
 //  @API(help="The Standard Deviation of the response for this scoring run.", direction=API.Direction.OUTPUT)
 //  public double sigma;
 
-  @Override public ModelMetricsRegressionV3 fillFromImpl(ModelMetricsRegression modelMetrics) {
+  @Override public S fillFromImpl(ModelMetricsRegression modelMetrics) {
     super.fillFromImpl(modelMetrics);
     r2 = modelMetrics.r2();
-    return this;
+    return (S) this;
   }
 }
