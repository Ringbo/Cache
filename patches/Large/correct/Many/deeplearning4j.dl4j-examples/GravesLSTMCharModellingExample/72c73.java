diff --git a/src/main/java/org/deeplearning4j/examples/rnn/GravesLSTMCharModellingExample.java b/src/main/java/org/deeplearning4j/examples/rnn/GravesLSTMCharModellingExample.java
index e6a6bb5..cde1047 100644
--- a/src/main/java/org/deeplearning4j/examples/rnn/GravesLSTMCharModellingExample.java
+++ b/src/main/java/org/deeplearning4j/examples/rnn/GravesLSTMCharModellingExample.java
@@ -68,7 +68,7 @@
 		//Set up network configuration:
 		MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder()
 			.optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT).iterations(1)
-			.learningRate(2e-3)
+			.learningRate(0.1)
 			.rmsDecay(0.95)
 			.seed(12345)
 			.regularization(true)
@@ -133,7 +133,7 @@
 		//The Complete Works of William Shakespeare
 		//5.3MB file in UTF-8 Encoding, ~5.4 million characters
 		//https://www.gutenberg.org/ebooks/100
-		String url = "https://www.gutenberg.org/cache/epub/100/pg100.txt";
+		String url = "https://s3.amazonaws.com/dl4j-distribution/pg100.txt";
 		String tempDir = System.getProperty("java.io.tmpdir");
 		String fileLocation = tempDir + "/Shakespeare.txt";	//Storage location from downloaded file
 		File f = new File(fileLocation);
