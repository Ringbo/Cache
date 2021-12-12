diff --git a/h2o-core/src/main/java/water/fvec/Frame.java b/h2o-core/src/main/java/water/fvec/Frame.java
index 605d003..20a5209 100644
--- a/h2o-core/src/main/java/water/fvec/Frame.java
+++ b/h2o-core/src/main/java/water/fvec/Frame.java
@@ -471,7 +471,7 @@
     _keys = Arrays.copyOf(_keys, ncols+N);
     _vecs = Arrays.copyOf(_vecs, ncols+N);
     for (int i=0; i<N; ++i) {
-      _names[ncols+i] = names[i];
+      _names[ncols+i] = tmpnames[i];
       _keys[ncols+i] = vecs[i]._key;
       _vecs[ncols+i] = vecs[i];
     }
