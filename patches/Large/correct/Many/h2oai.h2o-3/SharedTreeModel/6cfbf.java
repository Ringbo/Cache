diff --git a/h2o-algos/src/main/java/hex/tree/SharedTreeModel.java b/h2o-algos/src/main/java/hex/tree/SharedTreeModel.java
index fa28d61..5a94c3b 100755
--- a/h2o-algos/src/main/java/hex/tree/SharedTreeModel.java
+++ b/h2o-algos/src/main/java/hex/tree/SharedTreeModel.java
@@ -118,7 +118,7 @@
       _ntrees++;
       // 1-based for errors; _scored_train[0] is for zero trees, not 1 tree
       _scored_train = ArrayUtils.copyAndFillOf(_scored_train, _ntrees+1, new ScoreKeeper());
-      _scored_valid = _validation_metrics != null ? ArrayUtils.copyAndFillOf(_scored_valid, _ntrees+1, new ScoreKeeper()) : null;
+      _scored_valid = _scored_valid != null ? ArrayUtils.copyAndFillOf(_scored_valid, _ntrees+1, new ScoreKeeper()) : null;
       _training_time_ms = ArrayUtils.copyAndFillOf(_training_time_ms, _ntrees+1, System.currentTimeMillis());
       fs.blockForPending();
     }
