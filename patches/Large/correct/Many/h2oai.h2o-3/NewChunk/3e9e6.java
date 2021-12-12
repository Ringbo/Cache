diff --git a/h2o-core/src/main/java/water/fvec/NewChunk.java b/h2o-core/src/main/java/water/fvec/NewChunk.java
index be5c8ed..47cc719 100644
--- a/h2o-core/src/main/java/water/fvec/NewChunk.java
+++ b/h2o-core/src/main/java/water/fvec/NewChunk.java
@@ -159,7 +159,7 @@
     if(!isSparseNA() && !isSparseZero())
       add2Chunk_impl(c,i);
     else {
-      int j = Arrays.binarySearch(_id,i);
+      int j = Arrays.binarySearch(_id,0,_sparseLen,i);
       if(j >= 0)
         add2Chunk_impl(c,j);
       else if(isSparseNA())
