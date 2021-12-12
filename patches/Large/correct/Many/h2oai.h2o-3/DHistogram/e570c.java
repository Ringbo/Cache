diff --git a/h2o-algos/src/main/java/hex/tree/DHistogram.java b/h2o-algos/src/main/java/hex/tree/DHistogram.java
index f14af90..2d0a244 100644
--- a/h2o-algos/src/main/java/hex/tree/DHistogram.java
+++ b/h2o-algos/src/main/java/hex/tree/DHistogram.java
@@ -204,7 +204,7 @@
     double m = Double.NaN;
     for( int b=0; b<_bins.length; b++ ) {
       if( _bins[b] == 0 ) continue;
-      if( var(b) > 1e-14 ) return false;
+      if( var(b) > 1e-6 ) return false;
       double mean = mean(b);
       if( mean != m )
         if( Double.isNaN(m) ) m=mean;
