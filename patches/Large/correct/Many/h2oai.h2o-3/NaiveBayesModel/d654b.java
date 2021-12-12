diff --git a/h2o-algos/src/main/java/hex/naivebayes/NaiveBayesModel.java b/h2o-algos/src/main/java/hex/naivebayes/NaiveBayesModel.java
index 131b338..c69eccf 100644
--- a/h2o-algos/src/main/java/hex/naivebayes/NaiveBayesModel.java
+++ b/h2o-algos/src/main/java/hex/naivebayes/NaiveBayesModel.java
@@ -46,7 +46,7 @@
   @Override public ModelMetrics.MetricBuilder makeMetricBuilder(String[] domain) {
     switch(_output.getModelCategory()) {
       case Binomial:    return new ModelMetricsBinomial.MetricBuilderBinomial(domain, ModelUtils.DEFAULT_THRESHOLDS);
-      case Multinomial: return new ModelMetricsMultinomial.MetricBuilderMultinomial(domain);
+    case Multinomial: return new ModelMetricsMultinomial.MetricBuilderMultinomial(domain.length,domain);
       default: throw H2O.unimpl();
     }
   }
