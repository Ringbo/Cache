diff --git a/h2o-algos/src/main/java/hex/deepwater/DeepWaterImageIterator.java b/h2o-algos/src/main/java/hex/deepwater/DeepWaterImageIterator.java
index bc91526..b52a5c7 100644
--- a/h2o-algos/src/main/java/hex/deepwater/DeepWaterImageIterator.java
+++ b/h2o-algos/src/main/java/hex/deepwater/DeepWaterImageIterator.java
@@ -88,7 +88,7 @@
       _destLabel[_index] = _label;
       try {
         final int start=_index*_conv.len();
-        Key imgKey = Key.makeSystem(_file + DeepWaterModel.CACHE_MARKER);
+        Key imgKey = Key.make(_file + DeepWaterModel.CACHE_MARKER);
         boolean status = false;
         if (_cache && DKV.get(imgKey)!=null) {
           IcedImage icedIm = DKV.getGet(imgKey);
