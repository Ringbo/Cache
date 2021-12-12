diff --git a/h2o-core/src/main/java/water/fvec/C2SChunk.java b/h2o-core/src/main/java/water/fvec/C2SChunk.java
index b351364..54a2215 100644
--- a/h2o-core/src/main/java/water/fvec/C2SChunk.java
+++ b/h2o-core/src/main/java/water/fvec/C2SChunk.java
@@ -7,15 +7,15 @@
  * The scale/bias function, where data is in SIGNED bytes before scaling.
  */
 public class C2SChunk extends Chunk {
-  static protected final int _OFF=8+4;
+  static protected final int _OFF=8+8;
   private double _scale;
   public double scale() { return _scale; }
-  private int _bias;
+  private long _bias;
   public boolean hasFloat(){ return _scale != (long)_scale; }
-  C2SChunk( byte[] bs, int bias, double scale ) { _mem=bs; _start = -1; set_len((_mem.length-_OFF)>>1);
+  C2SChunk( byte[] bs, long bias, double scale ) { _mem=bs; _start = -1; set_len((_mem.length-_OFF)>>1);
     _bias = bias; _scale = scale;
     UnsafeUtils.set8d(_mem, 0, scale);
-    UnsafeUtils.set4 (_mem,8,bias );
+    UnsafeUtils.set8 (_mem,8,bias );
   }
   @Override protected final long at8_impl( int i ) {
     long res = UnsafeUtils.get2(_mem,(i<<1)+_OFF);
@@ -54,7 +54,7 @@
     for( int i=0; i<len; i++ ) {
       int res = UnsafeUtils.get2(_mem,(i<<1)+_OFF);
       if( res == C2Chunk._NA ) nc.addNA();
-      else nc.addNum((long)(res+_bias),(int)dx);
+      else nc.addNum((res+_bias),(int)dx);
     }
     return nc;
   }
@@ -75,7 +75,7 @@
     _start = -1;  _cidx = -1;
     set_len((_mem.length-_OFF)>>1);
     _scale= UnsafeUtils.get8d(_mem,0);
-    _bias = UnsafeUtils.get4 (_mem,8);
+    _bias = UnsafeUtils.get8 (_mem,8);
     return this;
   }
 }
