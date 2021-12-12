diff --git a/h2o-algos/src/main/java/hex/deepwater/DeepWater.java b/h2o-algos/src/main/java/hex/deepwater/DeepWater.java
index 27932d6..f031230 100755
--- a/h2o-algos/src/main/java/hex/deepwater/DeepWater.java
+++ b/h2o-algos/src/main/java/hex/deepwater/DeepWater.java
@@ -235,7 +235,7 @@
                   new DeepWaterTask2(_job._key, train, model.model_info(), rowFraction(train, mp, model), model.iterations).doAllNodes(             ).model_info()): //replicated data + multi-node mode
                   new DeepWaterTask (model.model_info(), rowFraction(train, mp, model), _job).doAll     (    train    ).model_info()); //distributed data (always in multi-node mode)
           long before = System.currentTimeMillis();
-          if (_parms._export_native_model_prefix!=null) {
+          if (_parms._export_native_model_prefix!=null && _parms._export_native_model_prefix!="") {
             Log.info("Saving model state.");
             model.exportNativeModel(_parms._export_native_model_prefix, model.iterations);
           }
