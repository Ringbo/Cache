diff --git a/h2o-algos/src/main/java/hex/api/MakeGLMModelHandler.java b/h2o-algos/src/main/java/hex/api/MakeGLMModelHandler.java
index 5172a07..29f9634 100644
--- a/h2o-algos/src/main/java/hex/api/MakeGLMModelHandler.java
+++ b/h2o-algos/src/main/java/hex/api/MakeGLMModelHandler.java
@@ -28,7 +28,7 @@
     // beta has new coefficients in proper order
     System.out.println("coefs:");
     System.out.println(coefs);
-    GLMModel m = new GLMModel(args.dest,model._parms,new GLMOutput(model._output._names,model._output._domains, names, beta,.5f,model._output._binomial), model.dinfo(), Double.NaN, Double.NaN, -1, null);
+    GLMModel m = new GLMModel(args.dest,model._parms,new GLMOutput(model._output._names,model._output._domains, names, beta,.5f,model._output._binomial), model.dinfo(), Double.NaN, Double.NaN, -1);
     DKV.put(m._key, m);
     GLMModelV2 res = new GLMModelV2();
     res.fillFromImpl(m);
