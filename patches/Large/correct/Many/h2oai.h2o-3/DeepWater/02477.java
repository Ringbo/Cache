diff --git a/h2o-algos/src/main/java/hex/deepwater/DeepWater.java b/h2o-algos/src/main/java/hex/deepwater/DeepWater.java
index 54e4494..e5fb74b 100755
--- a/h2o-algos/src/main/java/hex/deepwater/DeepWater.java
+++ b/h2o-algos/src/main/java/hex/deepwater/DeepWater.java
@@ -315,14 +315,14 @@
 
         // decide whether to cache
         long bytes;
-        if (_parms._problem_type == DeepWaterParameters.ProblemType.image) {
+        if (mp._problem_type == DeepWaterParameters.ProblemType.image) {
           bytes = train.numRows() * model.model_info()._width * model.model_info()._height * model.model_info()._channels * 4;
         } else {
           bytes = train.byteSize();
         }
         cache = mp._cache_data;
         if (cache) {
-          if (bytes < H2O.CLOUD.free_mem() / 4) {
+          if (bytes < H2O.CLOUD.free_mem() / 2) {
             Log.info("Automatically enabling data caching, expecting to require " + PrettyPrint.bytes(bytes) + ".");
           } else {
             Log.info("Automatically disabling data caching, since it would require too much space: " + PrettyPrint.bytes(bytes) + ".");
