diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
index 3263f08..8b32c0b 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/multilayer/MultiLayerNetwork.java
@@ -178,7 +178,7 @@
                     if (this.getInput() == null || this.getLayers() == null)
                         initializeLayers(input());
                     getLayers()[i].fit(input());
-                    log.info("Training on layer " + (i + 1) + " with " + input().slices() + " examples");
+                    log.info("Training on layer " + (i + 1) + " with " + input().size(0) + " examples");
                 }
 
             } else {
@@ -188,7 +188,7 @@
                     for (int j = 1; j <= i; j++)
                         layerInput = activationFromPrevLayer(j - 1, layerInput,true);
 
-                    log.info("Training on layer " + (i + 1) + " with " + layerInput.slices() + " examples");
+                    log.info("Training on layer " + (i + 1) + " with " + layerInput.size(0) + " examples");
                     getLayer(i).fit(layerInput);
                 }
             }
@@ -223,7 +223,7 @@
                     layerInput = input;
             else
                 layerInput = activationFromPrevLayer(i - 1, layerInput,true);
-            log.info("Training on layer " + (i + 1) + " with " + layerInput.slices() + " examples");
+            log.info("Training on layer " + (i + 1) + " with " + layerInput.size(0) + " examples");
             getLayers()[i].fit(layerInput);
 
         }
@@ -235,7 +235,7 @@
 
     @Override
     public int batchSize() {
-        return input.slices();
+        return input.size(0);
     }
 
     @Override
@@ -720,7 +720,7 @@
         }
 
 
-        INDArray rix = rActivations.get(rActivations.size() - 1).divi((double) input.slices());
+        INDArray rix = rActivations.get(rActivations.size() - 1).divi((double) input.size(0));
         LinAlgExceptions.assertValidNum(rix);
 
         //errors
@@ -749,7 +749,7 @@
 
 
         //- y - h
-        INDArray ix = activations.get(activations.size() - 1).sub(labels).div(labels.slices());
+        INDArray ix = activations.get(activations.size() - 1).sub(labels).div(labels.size(0));
 
        	/*
 		 * Precompute activations and z's (pre activation network outputs)
@@ -768,7 +768,7 @@
         //errors
         for (int i = weights.size() - 1; i >= 0; i--) {
             deltas[i] = activations.get(i).transpose().mmul(ix);
-            preCons[i] = Transforms.pow(activations.get(i).transpose(), 2).mmul(Transforms.pow(ix, 2)).muli(labels.slices());
+            preCons[i] = Transforms.pow(activations.get(i).transpose(), 2).mmul(Transforms.pow(ix, 2)).muli(labels.size(0));
 
             if (i > 0) {
                 //W[i] + b[i] * f'(z[i - 1])
@@ -946,7 +946,7 @@
      */
     public List<Pair<INDArray, INDArray>> unPack(INDArray param) {
         //more sanity checks!
-        if (param.slices() != 1)
+        if (param.size(0) != 1)
             param = param.reshape(1, param.length());
         List<Pair<INDArray, INDArray>> ret = new ArrayList<>();
         int curr = 0;
@@ -967,7 +967,7 @@
 
             }
 
-            ret.add(new Pair<>(weightPortion.reshape(layers[i].getParam(DefaultParamInitializer.WEIGHT_KEY).slices(), layers[i].getParam(DefaultParamInitializer.WEIGHT_KEY).columns()), hBiasPortion.reshape(layers[i].getParam(DefaultParamInitializer.BIAS_KEY).slices(), layers[i].getParam(DefaultParamInitializer.BIAS_KEY).columns())));
+            ret.add(new Pair<>(weightPortion.reshape(layers[i].getParam(DefaultParamInitializer.WEIGHT_KEY).size(0), layers[i].getParam(DefaultParamInitializer.WEIGHT_KEY).columns()), hBiasPortion.reshape(layers[i].getParam(DefaultParamInitializer.BIAS_KEY).size(0), layers[i].getParam(DefaultParamInitializer.BIAS_KEY).columns())));
             curr += layerLength;
         }
 
@@ -1310,7 +1310,7 @@
     @Override
     public int[] predict(INDArray d) {
         INDArray output = output(d);
-        int[] ret = new int[d.slices()];
+        int[] ret = new int[d.size(0)];
         if (d.isRowVector()) ret[0] = Nd4j.getBlasWrapper().iamax(output);
         else {
             for (int i = 0; i < ret.length; i++)
@@ -1811,7 +1811,7 @@
      */
     public List<INDArray> feedForwardR(List<INDArray> acts, INDArray v) {
         List<INDArray> R = new ArrayList<>();
-        R.add(Nd4j.zeros(input.slices(), input.columns()));
+        R.add(Nd4j.zeros(input.size(0), input.columns()));
         List<Pair<INDArray, INDArray>> vWvB = unPack(v);
         List<INDArray> W = MultiLayerUtil.weightMatrices(this);
 
