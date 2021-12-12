diff --git a/h2o-core/src/main/java/water/fvec/C4SChunk.java b/h2o-core/src/main/java/water/fvec/C4SChunk.java
index d2b970c..995f5d6 100644
--- a/h2o-core/src/main/java/water/fvec/C4SChunk.java
+++ b/h2o-core/src/main/java/water/fvec/C4SChunk.java
@@ -72,7 +72,7 @@
   public double [] getDoubles(double [] vals, int from, int to){
     for(int i = from; i < to; ++i) {
       long res = UnsafeUtils.get4(_mem,(i<<2)+_OFF);
-      vals[i-from] = res != C4Chunk._NA?(res - _bias)*_scale:Double.NaN;
+      vals[i-from] = res != C4Chunk._NA?(res + _bias)*_scale:Double.NaN;
     }
     return vals;
   }
@@ -86,7 +86,7 @@
     int j = 0;
     for(int i:ids) {
       long res = UnsafeUtils.get4(_mem,(i<<2)+_OFF);
-      vals[j++] = res != C4Chunk._NA?(res - _bias)*_scale:Double.NaN;
+      vals[j++] = res != C4Chunk._NA?(res + _bias)*_scale:Double.NaN;
     }
     return vals;
   }
