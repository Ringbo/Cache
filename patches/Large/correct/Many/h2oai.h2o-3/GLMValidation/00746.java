diff --git a/h2o-algos/src/main/java/hex/glm/GLMValidation.java b/h2o-algos/src/main/java/hex/glm/GLMValidation.java
index 96e0420..cb54613 100644
--- a/h2o-algos/src/main/java/hex/glm/GLMValidation.java
+++ b/h2o-algos/src/main/java/hex/glm/GLMValidation.java
@@ -44,9 +44,9 @@
   @Override public double[] perRow(double ds[], float[] yact, Model m) {
     _metricBuilder.perRow(ds,yact,m);
     if(_glm._family == Family.binomial)
-      add2(ds[2],yact[0]);
+      add2(yact[0],ds[2]);
     else
-      add2(ds[0],yact[0]);
+      add2(yact[0],ds[0]);
     return ds;
   }
 
