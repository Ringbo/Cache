diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/updater/UpdaterBlock.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/updater/UpdaterBlock.java
index a7add57..b45eb02 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/updater/UpdaterBlock.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/updater/UpdaterBlock.java
@@ -149,7 +149,7 @@
                 paramView = p.getParamView();
                 gradView = p.getGradView();
             }
-            postApply(p.getLayer(), p.getParamName(), paramView, gradView);
+            postApply(p.getLayer(), p.getParamName(), gradView, paramView);
         }
     }
 
