diff --git a/h2o-core/src/main/java/water/api/ModelMetricsBinomialV3.java b/h2o-core/src/main/java/water/api/ModelMetricsBinomialV3.java
index cadab46..5934d18 100644
--- a/h2o-core/src/main/java/water/api/ModelMetricsBinomialV3.java
+++ b/h2o-core/src/main/java/water/api/ModelMetricsBinomialV3.java
@@ -35,7 +35,7 @@
   public TwoDimTableBase max_criteria_and_metric_scores;
 
   @Override
-  public ModelMetricsBinomialV3 fillFromImpl(ModelMetricsBinomial modelMetrics) {
+  public S fillFromImpl(ModelMetricsBinomial modelMetrics) {
     super.fillFromImpl(modelMetrics);
 //    sigma = modelMetrics._sigma;
     r2 = modelMetrics.r2();
@@ -93,6 +93,6 @@
 
       max_criteria_and_metric_scores = new TwoDimTableV3().fillFromImpl(maxMetrics);
     }
-    return this;
+    return (S) this;
   }
 }
