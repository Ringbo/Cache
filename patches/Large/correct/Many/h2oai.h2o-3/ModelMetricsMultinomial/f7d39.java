diff --git a/h2o-core/src/main/java/hex/ModelMetricsMultinomial.java b/h2o-core/src/main/java/hex/ModelMetricsMultinomial.java
index c1c0680..15287a0 100755
--- a/h2o-core/src/main/java/hex/ModelMetricsMultinomial.java
+++ b/h2o-core/src/main/java/hex/ModelMetricsMultinomial.java
@@ -128,9 +128,9 @@
         float[] hr = new float[_K];
         double mse = Double.NaN;
         double logloss = Double.NaN;
-        if (_count != 0) {
+        if (_wsum > 0) {
           if (_hits != null) {
-            for (int i = 0; i < hr.length; i++)  hr[i] = (float)_hits[i] / _count;
+            for (int i = 0; i < hr.length; i++)  hr[i] = (float)(_hits[i] / _wsum);
             for (int i = 1; i < hr.length; i++)  hr[i] += hr[i-1];
           }
           mse = _sumsqe / _wsum;
