diff --git a/h2o-algos/src/main/java/hex/tree/SharedTree.java b/h2o-algos/src/main/java/hex/tree/SharedTree.java
index a4da8db..f15655f 100755
--- a/h2o-algos/src/main/java/hex/tree/SharedTree.java
+++ b/h2o-algos/src/main/java/hex/tree/SharedTree.java
@@ -312,7 +312,7 @@
 
     // Helpers to store quantiles in DKV - keep a cache on each node (instead of sending around over and over)
     protected Key getGlobalQuantilesKey(int i) {
-      if (_parms._histogram_type!= SharedTreeModel.SharedTreeParameters.HistogramType.QuantilesGlobal
+      if (_model==null || _parms._histogram_type!= SharedTreeModel.SharedTreeParameters.HistogramType.QuantilesGlobal
               && _parms._histogram_type!= SharedTreeModel.SharedTreeParameters.HistogramType.RoundRobin) return null;
       return Key.makeSystem(_model._key+"_quantiles_col_"+i);
     }
