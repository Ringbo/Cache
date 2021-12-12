diff --git a/h2o-algos/src/main/java/hex/pca/PCA.java b/h2o-algos/src/main/java/hex/pca/PCA.java
index 2e8e1fd..7fd3204 100644
--- a/h2o-algos/src/main/java/hex/pca/PCA.java
+++ b/h2o-algos/src/main/java/hex/pca/PCA.java
@@ -88,7 +88,7 @@
     // Currently, does not work on categorical data
     Vec[] vecs = _train.vecs();
     for (int i = 0; i < vecs.length; i++) {
-      if (!vecs[i].isNumeric()) throw H2O.unimpl();
+      if (!vecs[i].isNumeric()) throw H2O.unimpl("PCA currently only works on numeric data");
     }
   }
 
