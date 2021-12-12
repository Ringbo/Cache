diff --git a/h2o-algos/src/main/java/hex/tree/gbm/GBM.java b/h2o-algos/src/main/java/hex/tree/gbm/GBM.java
index 826ec54..9d96050 100755
--- a/h2o-algos/src/main/java/hex/tree/gbm/GBM.java
+++ b/h2o-algos/src/main/java/hex/tree/gbm/GBM.java
@@ -460,7 +460,7 @@
       }
 
       // Sample - mark the lines by putting 'OUT_OF_BAG' into nid(<klass>) vector
-      if (_parms._sample_rate < 1) {
+      if (_parms._sample_rate < 1 || _parms._sample_rate_per_class != null) {
         Sample ss[] = new Sample[_nclass];
         for (int k = 0; k < _nclass; k++)
           if (ktrees[k] != null)
