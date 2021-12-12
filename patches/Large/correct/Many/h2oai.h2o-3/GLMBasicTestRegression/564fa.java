diff --git a/h2o-algos/src/test/java/hex/glm/GLMBasicTestRegression.java b/h2o-algos/src/test/java/hex/glm/GLMBasicTestRegression.java
index ba11dc9..745af0e 100644
--- a/h2o-algos/src/test/java/hex/glm/GLMBasicTestRegression.java
+++ b/h2o-algos/src/test/java/hex/glm/GLMBasicTestRegression.java
@@ -73,11 +73,11 @@
     _prostateTrain = parse_test_file("smalldata/glm_test/prostate_cat_train.csv");
     _airlines = parse_test_file("smalldata/airlines/AirlinesTrain.csv.zip");
     Vec v = _airlines.remove("IsDepDelayed");
-    _airlines.add("IsDepDelayed",v.toNumericVec());
+    _airlines.add("IsDepDelayed",v.makeCopy(null));
     v.remove();
     _airlinesMM = parse_test_file(Key.make("AirlinesMM"), "smalldata/airlines/AirlinesTrainMM.csv.zip");
     v = _airlinesMM.remove("IsDepDelayed");
-    _airlinesMM.add("IsDepDelayed",v.toNumericVec());
+    _airlinesMM.add("IsDepDelayed",v.makeCopy(null));
     v.remove();
   }
 
