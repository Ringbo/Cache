diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/multilayer/MultiLayerTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/multilayer/MultiLayerTest.java
index 8dfc14f..0b6023f 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/multilayer/MultiLayerTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/multilayer/MultiLayerTest.java
@@ -905,6 +905,6 @@
 
         ByteArrayInputStream bais = new ByteArrayInputStream(asBytes);
         MultiLayerNetwork net = ModelSerializer.restoreMultiLayerNetwork(bais, true);
-        assertEquals(7, net.getDefaultConfiguration().getIterationCount());
+        assertEquals(7, net.getLayerWiseConfigurations().getIterationCount());
     }
 }
\ No newline at end of file
