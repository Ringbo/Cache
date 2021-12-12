diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/encdec/EncoderDecoderLSTM.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/encdec/EncoderDecoderLSTM.java
index cff4032..0f3e066 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/encdec/EncoderDecoderLSTM.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/recurrent/encdec/EncoderDecoderLSTM.java
@@ -387,7 +387,7 @@
         double[] decodeArr = new double[dict.size()];
         decodeArr[2] = 1;
         INDArray decode = Nd4j.create(decodeArr, new int[] { 1, dict.size(), 1 });
-        net.feedForward(new INDArray[] { in, decode }, false);
+        net.feedForward(new INDArray[] { in, decode }, false, false);
         org.deeplearning4j.nn.layers.recurrent.GravesLSTM decoder = (org.deeplearning4j.nn.layers.recurrent.GravesLSTM) net
                 .getLayer("decoder");
         Layer output = net.getLayer("output");
