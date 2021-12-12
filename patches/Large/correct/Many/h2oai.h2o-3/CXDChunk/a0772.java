diff --git a/h2o-core/src/main/java/water/fvec/CXDChunk.java b/h2o-core/src/main/java/water/fvec/CXDChunk.java
index ec0e50b..9e4f8df 100644
--- a/h2o-core/src/main/java/water/fvec/CXDChunk.java
+++ b/h2o-core/src/main/java/water/fvec/CXDChunk.java
@@ -15,7 +15,7 @@
   }
 
   @Override public int asSparseDoubles(double [] vals, int[] ids) {
-    if(vals.length != _len) throw new IllegalArgumentException();
+    if(vals.length != _sparseLen) throw new IllegalArgumentException();
     int off = _OFF;
     final int inc = 8 + _ridsz;
     if(_ridsz == 2){
