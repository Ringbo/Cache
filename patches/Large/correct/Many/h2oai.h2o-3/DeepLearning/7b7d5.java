diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
index fa8d7e1..7f88bb1 100644
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
@@ -860,7 +860,8 @@
   private DataInfo prepareDataInfo() {
 //    final boolean del_enum_resp = (classification && !response.isEnum());
     final Frame train = FrameTask.DataInfo.prepareFrame(source, response, ignored_cols, classification, ignore_const_cols, true /*drop >20% NA cols*/);
-    final DataInfo dinfo = new FrameTask.DataInfo(train, 1, false, true, !classification);
+    // DataInfo(Frame fr, int nResponses, boolean useAllFactorLevels, TransformType predictor_transform, TransformType response_transform) {
+    final DataInfo dinfo = new FrameTask.DataInfo(train, 1, false, true, !classification, DataInfo.TransformType.STANDARDIZE,DataInfo.TransformType.NONE);
     final Vec resp = dinfo._adaptedFrame.lastVec(); //convention from DataInfo: response is the last Vec
     assert(!classification ^ resp.isEnum()) : "Must have enum response for classification!"; //either regression or enum response
 //    if (del_enum_resp) ltrash(resp);
