diff --git a/h2o-algos/src/main/java/hex/glrm/GLRMModel.java b/h2o-algos/src/main/java/hex/glrm/GLRMModel.java
index 00be365..18f7980 100644
--- a/h2o-algos/src/main/java/hex/glrm/GLRMModel.java
+++ b/h2o-algos/src/main/java/hex/glrm/GLRMModel.java
@@ -510,7 +510,7 @@
 
     f = new Frame((null == destination_key ? Key.make() : Key.make(destination_key)), f.names(), f.vecs());
     DKV.put(f);
-    gs._mb.makeModelMetrics(GLRMModel.this, adaptedFr);   // save error metrics based on imputed data
+    gs._mb.makeModelMetrics(GLRMModel.this, orig);   // save error metrics based on imputed data
     return f;
   }
 
