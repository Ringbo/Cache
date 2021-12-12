diff --git a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
index 4855e40..f69e50b 100755
--- a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
+++ b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
@@ -1210,7 +1210,7 @@
 
     Scope.enter();
     try {
-      tfr = parse_test_file("./smalldata/junit/cars.head10.csv");
+      tfr = parse_test_file("./smalldata/junit/cars.csv");
       for (String s : new String[]{
               "name",
       }) {
@@ -1233,7 +1233,7 @@
       gbm = job.trainModel().get();
 
       ModelMetricsRegression mm = (ModelMetricsRegression)gbm._output._training_metrics;
-      assertEquals(0.4934239, mm.mse(), 1e-4);
+      assertEquals(0.12765426703095312, mm.mse(), 1e-4);
 
       job.remove();
     } finally {
