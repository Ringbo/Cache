diff --git a/h2o-extensions/xgboost/src/main/java/hex/tree/xgboost/XGBoostModel.java b/h2o-extensions/xgboost/src/main/java/hex/tree/xgboost/XGBoostModel.java
index 47f1733..041b74c 100755
--- a/h2o-extensions/xgboost/src/main/java/hex/tree/xgboost/XGBoostModel.java
+++ b/h2o-extensions/xgboost/src/main/java/hex/tree/xgboost/XGBoostModel.java
@@ -64,7 +64,7 @@
     public double _min_child_weight;
 
     public double _learn_rate = 0.3;
-    public double _eta;
+    public double _eta = 0.3;
 
     public double _learn_rate_annealing = 1;
 
@@ -155,7 +155,7 @@
     } else {
       params.put("nround", p._ntrees);
     }
-    if (p._eta != 0) {
+    if (p._eta != 0.3) {
       Log.info("Using user-provided parameter eta instead of learn_rate.");
       params.put("eta", p._eta);
       p._learn_rate = p._eta;
