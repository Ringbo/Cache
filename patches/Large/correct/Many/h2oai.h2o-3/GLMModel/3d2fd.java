diff --git a/h2o-algos/src/main/java/hex/glm/GLMModel.java b/h2o-algos/src/main/java/hex/glm/GLMModel.java
index 636dbed..612471e 100755
--- a/h2o-algos/src/main/java/hex/glm/GLMModel.java
+++ b/h2o-algos/src/main/java/hex/glm/GLMModel.java
@@ -752,7 +752,7 @@
 
     @Override public String[] interactions() { return _dinfo._interactionColumns; }
     public static Frame expand(Frame fr, String[] interactions, boolean useAll, boolean standardize, boolean skipMissing) {
-      return MakeGLMModelHandler.HoTDAAWWG(fr,interactions,useAll,standardize,false,skipMissing);
+      return MakeGLMModelHandler.oneHot(fr,interactions,useAll,standardize,false,skipMissing);
     }
 
     public GLMOutput(DataInfo dinfo, String[] column_names, String[][] domains, String[] coefficient_names, boolean binomial) {
