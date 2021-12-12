diff --git a/h2o-core/src/main/java/water/fvec/C1SChunk.java b/h2o-core/src/main/java/water/fvec/C1SChunk.java
index 0a8cb6d..d79f70d 100644
--- a/h2o-core/src/main/java/water/fvec/C1SChunk.java
+++ b/h2o-core/src/main/java/water/fvec/C1SChunk.java
@@ -7,15 +7,15 @@
  * The scale/bias function, where data is in SIGNED bytes before scaling.
  */
 public class C1SChunk extends Chunk {
-  static protected final int _OFF=8+4;
+  static protected final int _OFF=8+8;
   private double _scale;
   public double scale() { return _scale; }
-  private int _bias;
+  private long _bias;
   @Override public boolean hasFloat(){ return _scale != (long)_scale; }
-  C1SChunk( byte[] bs, int bias, double scale ) { _mem=bs; _start = -1; set_len(_mem.length-_OFF);
+  C1SChunk( byte[] bs, long bias, double scale ) { _mem=bs; _start = -1; set_len(_mem.length-_OFF);
     _bias = bias; _scale = scale;
     UnsafeUtils.set8d(_mem, 0, scale);
-    UnsafeUtils.set4 (_mem,8,bias );
+    UnsafeUtils.set8 (_mem,8,bias );
   }
   @Override protected final long at8_impl( int i ) {
     long res = 0xFF&_mem[i+_OFF];
@@ -47,7 +47,7 @@
     for( int i=0; i<len; i++ ) {
       int res = 0xFF&_mem[i+_OFF];
       if( res == C1Chunk._NA ) nc.addNA();
-      else nc.addNum((long)(res+_bias),(int)dx);
+      else nc.addNum((res+_bias),(int)dx);
     }
     return nc;
   }
@@ -60,7 +60,7 @@
     _start = -1;  _cidx = -1;
     set_len(_mem.length-_OFF);
     _scale= UnsafeUtils.get8d(_mem,0);
-    _bias = UnsafeUtils.get4 (_mem,8);
+    _bias = UnsafeUtils.get8 (_mem,8);
     return this;
   }
 }
