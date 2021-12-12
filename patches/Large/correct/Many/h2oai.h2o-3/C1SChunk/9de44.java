diff --git a/h2o-core/src/main/java/water/fvec/C1SChunk.java b/h2o-core/src/main/java/water/fvec/C1SChunk.java
index 2c1c94f..670419e 100644
--- a/h2o-core/src/main/java/water/fvec/C1SChunk.java
+++ b/h2o-core/src/main/java/water/fvec/C1SChunk.java
@@ -71,7 +71,7 @@
   public double [] getDoubles(double [] vals, int from, int to){
     for(int i = from; i < to; ++i) {
       long res = 0xFF & _mem[_OFF+i];
-      vals[i-from] = res != C1Chunk._NA?(res - _bias)*_scale:Double.NaN;
+      vals[i-from] = res != C1Chunk._NA?(res + _bias)*_scale:Double.NaN;
     }
     return vals;
   }
@@ -85,7 +85,7 @@
     int j = 0;
     for(int i:ids) {
       long res = 0xFF&_mem[_OFF+i];
-      vals[j++] = res != C1Chunk._NA?(res - _bias)*_scale:Double.NaN;
+      vals[j++] = res != C1Chunk._NA?(res + _bias)*_scale:Double.NaN;
     }
     return vals;
   }
