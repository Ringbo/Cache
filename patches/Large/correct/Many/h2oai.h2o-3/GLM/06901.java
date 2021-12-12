diff --git a/h2o-algos/src/main/java/hex/glm/GLM.java b/h2o-algos/src/main/java/hex/glm/GLM.java
index cede33e..f1f973b 100644
--- a/h2o-algos/src/main/java/hex/glm/GLM.java
+++ b/h2o-algos/src/main/java/hex/glm/GLM.java
@@ -1722,7 +1722,7 @@
           if(_c == 0)_oldObj = _taskInfo._objVal;
           _taskInfo._beta = _taskInfo._beta_multinomial[_c];
           GLMSingleLambdaTsk.this.addToPendingCount(1);
-          solve(true);
+          solve(false);
         }
       }).asyncExec(_dinfo._adaptedFrame);
     }
