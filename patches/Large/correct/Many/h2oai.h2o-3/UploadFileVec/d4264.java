diff --git a/h2o-core/src/main/java/water/fvec/UploadFileVec.java b/h2o-core/src/main/java/water/fvec/UploadFileVec.java
index 5519ec7..f4c378b 100644
--- a/h2o-core/src/main/java/water/fvec/UploadFileVec.java
+++ b/h2o-core/src/main/java/water/fvec/UploadFileVec.java
@@ -17,7 +17,7 @@
     assert _len==-1;            // Not closed
     assert (c._vec == null);    // Don't try to re-purpose a chunk.
     c._vec = this;              // Attach chunk to this vec.
-    DKV.put(chunkKey(_nchunks++),c,fs); // Write updated chunk back into K/V
+    DKV.put(chunkKey(_nchunks++),c,fs,true); // Write updated chunk back into K/V
   }
 
   // Close, and possible replace the prior chunk with a new, larger Chunk
