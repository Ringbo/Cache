diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
index 4cbe414..c6dd1dc 100755
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearningModel.java
@@ -2007,7 +2007,7 @@
     Vec[] vecs = adaptFrm.anyVec().makeZeros(features);
 
     Scope.enter();
-    adaptTestForTrain(_output._names, null /*don't skip response*/, _output._domains, frame, _parms.missingColumnsType(), true);
+    adaptTestForTrain(_output._names, null /*don't skip response*/, _output._domains, adaptFrm, _parms.missingColumnsType(), true);
     for (int j=0; j<features; ++j) {
       adaptFrm.add("DF.L"+(layer+1)+".C" + (j+1), vecs[j]);
     }
