diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningParameters.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningParameters.java
index 7d16efb..12c0a74 100644
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningParameters.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningParameters.java
@@ -571,9 +571,9 @@
       }
     }
     if (!_autoencoder && _sparsity_beta != 0)
-      dl.info("_sparsity_beta", "Sparsity beta can only be used for autoencoder.");
+      dl.error("_sparsity_beta", "Sparsity beta can only be used for autoencoder.");
     if (classification && dl.hasOffsetCol())
-      dl.info("_offset_column", "Offset is only supported for regression.");
+      dl.error("_offset_column", "Offset is only supported for regression.");
 
     // reason for the error message below is that validation might not have the same horizontalized features as the training data (or different order)
     if (_autoencoder && _activation == Activation.Maxout)
