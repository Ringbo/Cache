diff --git a/h2o-core/src/main/java/hex/ModelMetricsRegression.java b/h2o-core/src/main/java/hex/ModelMetricsRegression.java
index 2ea912c..d0dafc7 100755
--- a/h2o-core/src/main/java/hex/ModelMetricsRegression.java
+++ b/h2o-core/src/main/java/hex/ModelMetricsRegression.java
@@ -45,6 +45,6 @@
       return m._output.addModelMetrics(new ModelMetricsRegression( m, f, mse, sigma));
     }
 
-    public String toString() {return " mse = " + _sumsqe / _count;}
+    public String toString() {return " mse = " + _sumsqe / _wsum;}
   }
 }
