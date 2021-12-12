diff --git a/h2o-core/src/main/java/water/fvec/RollupStats.java b/h2o-core/src/main/java/water/fvec/RollupStats.java
index 5a0dfdd..b1a7011 100644
--- a/h2o-core/src/main/java/water/fvec/RollupStats.java
+++ b/h2o-core/src/main/java/water/fvec/RollupStats.java
@@ -58,7 +58,7 @@
         if( d == Double.POSITIVE_INFINITY) _pinfs++;
         else if( d == Double.NEGATIVE_INFINITY) _ninfs++;
         else {
-          if( d == 0 ) _nzCnt++;
+          if( d != 0 ) _nzCnt++;
           min(d);  max(d);
           _mean += d;
           _rows++;
@@ -70,7 +70,7 @@
     // Sparse?  We skipped all the zeros; do them now
     if( c.isSparse() ) {
       int zeros = c._len - c.sparseLen();
-      if( zeros > 0 ) { min(0); max(0); } // At least 1 zero?
+      for( int i=0; i<Math.min(_mins.length,zeros); i++ ) { min(0); max(0); }
       _rows += zeros;
     }
 
