diff --git a/h2o-algos/src/main/java/hex/glm/GLMMetricBuilder.java b/h2o-algos/src/main/java/hex/glm/GLMMetricBuilder.java
index 0122893..a009d19 100644
--- a/h2o-algos/src/main/java/hex/glm/GLMMetricBuilder.java
+++ b/h2o-algos/src/main/java/hex/glm/GLMMetricBuilder.java
@@ -35,7 +35,7 @@
 
   final boolean _computeMetrics;
   public GLMMetricBuilder(String[] domain, double [] ymu, GLMWeightsFun glmf, int rank, boolean computeMetrics, boolean intercept){
-    super(domain == null?1:domain.length, domain);
+    super(domain == null?0:domain.length, domain);
     _rank = rank;
     _glmf = glmf;
     _computeMetrics = computeMetrics;
