diff --git a/h2o-algos/src/main/java/hex/deepwater/DeepWaterModelInfo.java b/h2o-algos/src/main/java/hex/deepwater/DeepWaterModelInfo.java
index 96f47c3..f2723d5 100644
--- a/h2o-algos/src/main/java/hex/deepwater/DeepWaterModelInfo.java
+++ b/h2o-algos/src/main/java/hex/deepwater/DeepWaterModelInfo.java
@@ -120,7 +120,7 @@
       final String networkParms = parameters._network_parameters_file;
       if (networkParms != null && !networkParms.isEmpty()) {
         Log.info("Loading the model parameters file: " + networkParms);
-        _imageTrain.loadModel(networkParms);
+        _imageTrain.loadParam(networkParms);
       }
     } catch(Throwable t) {
       Log.err("Unable to initialize the native Deep Learning backend: " + t.getMessage());
