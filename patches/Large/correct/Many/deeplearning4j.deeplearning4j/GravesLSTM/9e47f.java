diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/recurrent/GravesLSTM.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/recurrent/GravesLSTM.java
index 17d6ad3..4c0dbfd 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/recurrent/GravesLSTM.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/nn/layers/recurrent/GravesLSTM.java
@@ -172,7 +172,7 @@
 			INDArray nablaCellState = nablaOut.mul(ao).muli(sigmahPrimeOfS)
 					.addi(nextForgetGateAs.mul(nablaCellStateNext))
 					.addi(deltafNext.mmul(Nd4j.diag(wFF)))
-					.addi(deltaoNext.mmul(Nd4j.diag(wOO)))
+					.addi(deltao.mmul(Nd4j.diag(wOO)))
 					.addi(deltagNext.mmul(Nd4j.diag(wGG)));
 			nablaCellStateNext = nablaCellState;	//Store for use in next iteration
 
@@ -354,18 +354,16 @@
 
 			INDArray forgetGateActivations = miniBatchData.mmul(wf)
 					.addi(prevOutputActivations.mmul(wF))
-					.addi(prevMemCellState.mmul(Nd4j.diag(wFF)))
+					.addi(prevMemCellState.mulRowVector(wFF.transpose()))
 					.addiRowVector(bf);
 			INDArrayIndex[] fIndexes = new INDArrayIndex[]{NDArrayIndex.all(),interval(hiddenLayerSize,2*hiddenLayerSize)};
 			ifogZ.tensorAlongDimension(t,1,0).put(fIndexes, forgetGateActivations);
 			Nd4j.getExecutioner().execAndReturn(Nd4j.getOpFactory().createTransform("sigmoid", forgetGateActivations));
 			ifogA.tensorAlongDimension(t,1,0).put(fIndexes, forgetGateActivations);
-			//Reason for diag above: convert column vector -> diagonal matrix. Cell activations are only connected to the FOG gates in the same unit.
-			//They are not connected to any other unit -> wFF_ij = 0 for i \neq j
 
 			INDArray inputModGateActivations = miniBatchData.mmul(wg)
 					.addi(prevOutputActivations.mmul(wG))
-					.addi(prevMemCellState.mmul(Nd4j.diag(wGG)))
+					.addi(prevMemCellState.mulRowVector(wGG.transpose()))
 					.addiRowVector(bg);
 			INDArrayIndex[] gIndexes = new INDArrayIndex[]{NDArrayIndex.all(),interval(3*hiddenLayerSize,4*hiddenLayerSize)};
 			ifogZ.tensorAlongDimension(t,1,0).put(gIndexes, inputModGateActivations);
@@ -378,7 +376,7 @@
 
 			INDArray outputGateActivations = miniBatchData.mmul(wo)
 					.addi(prevOutputActivations.mmul(wO))
-					.addi(currentMemoryCellState.mmul(Nd4j.diag(wOO)))
+					.addi(currentMemoryCellState.mulRowVector(wOO.transpose()))
 					.addiRowVector(bo);
 			INDArrayIndex[] oIndexes = new INDArrayIndex[]{NDArrayIndex.all(),interval(2*hiddenLayerSize,3*hiddenLayerSize)};
 			ifogZ.tensorAlongDimension(t,1,0).put(oIndexes, outputGateActivations);
