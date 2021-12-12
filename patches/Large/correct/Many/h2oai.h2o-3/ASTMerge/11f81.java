diff --git a/h2o-core/src/main/java/water/rapids/ASTMerge.java b/h2o-core/src/main/java/water/rapids/ASTMerge.java
index 0579e93..77ffd43 100644
--- a/h2o-core/src/main/java/water/rapids/ASTMerge.java
+++ b/h2o-core/src/main/java/water/rapids/ASTMerge.java
@@ -78,7 +78,7 @@
       long lsize = 0, rsize = 0;
       for( int i=ncols; i<l.numCols(); i++ ) lsize += l.vecs()[i].byteSize();
       for( int i=ncols; i<r.numCols(); i++ ) rsize += r.vecs()[i].byteSize();
-      walkLeft = lsize > rsize;
+      walkLeft = lsize < rsize;
     } else {
       walkLeft = allLeft;
     }
