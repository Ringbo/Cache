diff --git a/h2o-algos/src/main/java/hex/glm/GLM.java b/h2o-algos/src/main/java/hex/glm/GLM.java
index 92d2bba..e1cbe68 100644
--- a/h2o-algos/src/main/java/hex/glm/GLM.java
+++ b/h2o-algos/src/main/java/hex/glm/GLM.java
@@ -69,7 +69,7 @@
   }
 
   @Override public boolean havePojo() { return true; }
-  @Override public boolean haveMojo() { return false; }
+  @Override public boolean haveMojo() { return true; }
 
   private double _lambdaCVEstimate = Double.NaN; // lambda cross-validation estimate
   private boolean _doInit = true;  // flag setting whether or not to run init
