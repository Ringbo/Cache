diff --git a/h2o-algos/src/main/java/hex/tree/isofor/IsolationForest.java b/h2o-algos/src/main/java/hex/tree/isofor/IsolationForest.java
index 7159bb4..d6fea64 100755
--- a/h2o-algos/src/main/java/hex/tree/isofor/IsolationForest.java
+++ b/h2o-algos/src/main/java/hex/tree/isofor/IsolationForest.java
@@ -157,7 +157,7 @@
       randomResp(_parms._seed, _model._output._ntrees);
 
       final long rseed = _rand.nextLong();
-      final DTree tree = new DTree(_train, _ncols, (char)_nclass, _mtry, _mtry_per_tree, rseed, _parms);
+      final DTree tree = new DTree(_train, _ncols, _mtry, _mtry_per_tree, rseed, _parms);
       final DTree[] ktrees = {tree};
 
       new Sample(tree, _parms._sample_rate, null)
