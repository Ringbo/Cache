diff --git a/h2o-core/src/main/java/hex/ModelBuilder.java b/h2o-core/src/main/java/hex/ModelBuilder.java
index 6c2274b..453e5c1 100644
--- a/h2o-core/src/main/java/hex/ModelBuilder.java
+++ b/h2o-core/src/main/java/hex/ModelBuilder.java
@@ -396,7 +396,7 @@
       try {
         String[] msgs = Model.adaptTestForTrain(_train._names, _parms._weights_column, _parms._offset_column, null, _train.domains(), _valid, _parms.missingColumnsType(), expensive, true);
         _vresponse = _valid.vec(_parms._response_column);
-        if (_vresponse == null)
+        if (_vresponse == null && _parms._response_column != null)
           error("_validation_frame", "Validation frame must have a response column '" + _parms._response_column + "'.");
         if (expensive) {
           for (String s : msgs) {
