diff --git a/h2o-algos/src/main/java/hex/kmeans/KMeans.java b/h2o-algos/src/main/java/hex/kmeans/KMeans.java
index a4254b0..d60897f 100644
--- a/h2o-algos/src/main/java/hex/kmeans/KMeans.java
+++ b/h2o-algos/src/main/java/hex/kmeans/KMeans.java
@@ -317,7 +317,7 @@
     @Override public void map(Chunk[] cs) {
       for( int row = 0; row < cs[0]._len; row++ ) {
         for( int i = 0; i < cs.length; i++ ) {
-          double d = cs[i].at0(row);
+          double d = cs[i].atd(row);
           if(Double.isNaN(d)) continue;
           d = (d - _means[i]) * (_mults == null ? 1 : _mults[i]);
           _tss += d * d;
