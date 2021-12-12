diff --git a/h2o-core/src/main/java/water/fvec/CXDChunk.java b/h2o-core/src/main/java/water/fvec/CXDChunk.java
index 9e4f8df..d69312a 100644
--- a/h2o-core/src/main/java/water/fvec/CXDChunk.java
+++ b/h2o-core/src/main/java/water/fvec/CXDChunk.java
@@ -15,7 +15,7 @@
   }
 
   @Override public int asSparseDoubles(double [] vals, int[] ids) {
-    if(vals.length != _sparseLen) throw new IllegalArgumentException();
+    if(vals.length < _sparseLen) throw new IllegalArgumentException();
     int off = _OFF;
     final int inc = 8 + _ridsz;
     if(_ridsz == 2){
@@ -29,7 +29,7 @@
         vals[i] = UnsafeUtils.get8d(_mem,off+4);
       }
     } else throw H2O.unimpl();
-    return len();
+    return _sparseLen;
   }
 
   @Override protected long at8_impl(int idx) {
