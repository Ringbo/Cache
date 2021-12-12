diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
index 6fd895e..6fb78d2 100755
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
@@ -1772,7 +1772,7 @@
         dl.hide("_momentum_stable", "momentum_stable is not used with adaptive_rate.");
         if (_rate!=0.005) dl.warn("_rate", "rate cannot be specified if adaptive_rate is enabled.");
         if (_rate_annealing!=1e-6) dl.warn("_rate_annealing", "rate_annealing cannot be specified if adaptive_rate is enabled.");
-        if (_rate_decay!=1e-6) dl.warn("_rate_decay", "rate_decay cannot be specified if adaptive_rate is enabled.");
+        if (_rate_decay!=1) dl.warn("_rate_decay", "rate_decay cannot be specified if adaptive_rate is enabled.");
         if (_momentum_start!=0) dl.warn("_momentum_start", "momentum_start cannot be specified if adaptive_rate is enabled.");
         if (_momentum_ramp!=1e6) dl.warn("_momentum_ramb", "momentum_ramp cannot be specified if adaptive_rate is enabled.");
         if (_momentum_stable!=0) dl.warn("_momentum_stable", "momentum_stable cannot be specified if adaptive_rate is enabled.");
