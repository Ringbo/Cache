diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/misc/lossfunctions/CustomLossExample.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/misc/lossfunctions/CustomLossExample.java
index c8bf8d1..d37a25b 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/misc/lossfunctions/CustomLossExample.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/misc/lossfunctions/CustomLossExample.java
@@ -76,7 +76,7 @@
             .pretrain(false).backprop(true).build()
         );
         net.init();
-        net.setListeners(new ScoreIterationListener(1));
+        net.setListeners(new ScoreIterationListener(100));
 
 
         //Train the network on the full data set, and evaluate in periodically
