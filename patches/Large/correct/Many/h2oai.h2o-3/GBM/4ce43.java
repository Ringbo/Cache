diff --git a/h2o-algos/src/main/java/hex/tree/gbm/GBM.java b/h2o-algos/src/main/java/hex/tree/gbm/GBM.java
index ddc6514..bf39355 100755
--- a/h2o-algos/src/main/java/hex/tree/gbm/GBM.java
+++ b/h2o-algos/src/main/java/hex/tree/gbm/GBM.java
@@ -259,7 +259,7 @@
         for( int row = 0; row < wk._len; row++) {
           if( ys.isNA(row) ) continue;
           double f = tr.atd(row) + offset.atd(row);
-          double y = ys.at8(row);
+          double y = ys.atd(row);
           if( _parms._distribution == Distribution.Family.multinomial ) {
             double weight = hasWeightCol() ? chk_weight(chks).atd(row) : 1;
             double sum = score1(chks, weight,0.0 /*offset not used for multiclass*/,fs,row);
