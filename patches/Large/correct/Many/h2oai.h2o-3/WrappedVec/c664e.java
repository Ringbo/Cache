diff --git a/h2o-core/src/main/water/fvec/WrappedVec.java b/h2o-core/src/main/water/fvec/WrappedVec.java
index 42788e0..db6bdfa 100644
--- a/h2o-core/src/main/water/fvec/WrappedVec.java
+++ b/h2o-core/src/main/water/fvec/WrappedVec.java
@@ -16,7 +16,7 @@
   }
 
   @Override protected Vec masterVec() {
-    return _masterVec==null ? _masterVec : (_masterVec = DKV.get(_masterVecKey).get());
+    return _masterVec!=null ? _masterVec : (_masterVec = DKV.get(_masterVecKey).get());
   }
   // Map from chunk-index to Chunk.  These wrappers are making custom Chunks
   abstract public Chunk chunkForChunkIdx(int cidx);
