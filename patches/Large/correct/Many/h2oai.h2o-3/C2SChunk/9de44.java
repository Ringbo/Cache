diff --git a/h2o-core/src/main/java/water/fvec/C2SChunk.java b/h2o-core/src/main/java/water/fvec/C2SChunk.java
index 7a667b6..b12fb24 100644
--- a/h2o-core/src/main/java/water/fvec/C2SChunk.java
+++ b/h2o-core/src/main/java/water/fvec/C2SChunk.java
@@ -77,7 +77,7 @@
   public double [] getDoubles(double [] vals, int from, int to){
     for(int i = from; i < to; ++i) {
       long res = UnsafeUtils.get2(_mem,(i<<1)+_OFF);
-      vals[i-from] = res != C2Chunk._NA?(res - _bias)*_scale:Double.NaN;
+      vals[i-from] = res != C2Chunk._NA?(res + _bias)*_scale:Double.NaN;
     }
     return vals;
   }
@@ -91,7 +91,7 @@
     int j = 0;
     for(int i:ids) {
       long res = UnsafeUtils.get2(_mem,(i<<1)+_OFF);
-      vals[j++] = res != C2Chunk._NA?(res - _bias)*_scale:Double.NaN;
+      vals[j++] = res != C2Chunk._NA?(res + _bias)*_scale:Double.NaN;
     }
     return vals;
   }
