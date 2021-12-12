diff --git a/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java b/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
index 3daf313..b5d65ec 100755
--- a/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
+++ b/h2o-algos/src/main/java/hex/deeplearning/DeepLearning.java
@@ -155,7 +155,7 @@
   @Override
   protected Frame rebalance(final Frame original_fr, boolean local, final String name) {
     if (original_fr == null) return null;
-    if (_parms._force_load_balance) {
+    if (_parms._force_load_balance || _parms._reproducible) { //this is called before the parameters are sanitized, so force_load_balance might be user-disabled -> so must check reproducible flag as well
       int original_chunks = original_fr.anyVec().nChunks();
       _job.update(0,"Load balancing " + name.substring(name.length() - 5) + " data...");
       int chunks = desiredChunks(original_fr, local);
