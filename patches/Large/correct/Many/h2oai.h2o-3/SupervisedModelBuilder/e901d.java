diff --git a/h2o-core/src/main/java/hex/SupervisedModelBuilder.java b/h2o-core/src/main/java/hex/SupervisedModelBuilder.java
index 15753f8..f75e6f4 100755
--- a/h2o-core/src/main/java/hex/SupervisedModelBuilder.java
+++ b/h2o-core/src/main/java/hex/SupervisedModelBuilder.java
@@ -125,7 +125,7 @@
         _train.add(_parms._offset_column, off);
       }
       if(_valid != null) {
-        off = _train.remove(_parms._offset_column);
+        off = _valid.remove(_parms._offset_column);
         if(off == null) {
           error("_offset", "Offset column '" + _parms._offset_column + "' not found in the validation frame");
           error("_validation_frame", "Offset column '" + _parms._offset_column + "' not found in the validation frame");
