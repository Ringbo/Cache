diff --git a/h2o-algos/src/main/java/hex/glm/ComputationState.java b/h2o-algos/src/main/java/hex/glm/ComputationState.java
index 8d04c42..a00a6f8 100644
--- a/h2o-algos/src/main/java/hex/glm/ComputationState.java
+++ b/h2o-algos/src/main/java/hex/glm/ComputationState.java
@@ -313,7 +313,7 @@
     int [] activeCols = ArrayUtils.removeIds(_activeData.activeCols(),cols);
     if(_beta != null)
       _beta = ArrayUtils.removeIds(_beta,cols);
-    if(_ginfo != null)
+    if(_ginfo != null && _ginfo._gradient != null)
       _ginfo._gradient = ArrayUtils.removeIds(_ginfo._gradient,cols);
     _activeData = _dinfo.filterExpandedColumns(activeCols);
     _activeBC = _bc.filterExpandedColumns(activeCols);
