diff --git a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/conf/MultiLayerNeuralNetConfigurationTest.java b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/conf/MultiLayerNeuralNetConfigurationTest.java
index e3d70ea..31d0a68 100644
--- a/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/conf/MultiLayerNeuralNetConfigurationTest.java
+++ b/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/conf/MultiLayerNeuralNetConfigurationTest.java
@@ -47,13 +47,14 @@
     @Test
     public void testJson() throws Exception {
         MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder()
-                .layer(new RBM.Builder().dist(new NormalDistribution(1, 1e-1)).build())
-                .list().inputPreProcessor(1, new ReshapePreProcessor())
+                .list()
+                .layer(0,new RBM.Builder().dist(new NormalDistribution(1, 1e-1)).build())
+                .inputPreProcessor(0, new ReshapePreProcessor())
                 .build();
 
         String json = conf.toJson();
         MultiLayerConfiguration from = MultiLayerConfiguration.fromJson(json);
-        assertEquals(conf.getConf(1),from.getConf(1));
+        assertEquals(conf.getConf(0),from.getConf(0));
 
         Properties props = new Properties();
         props.put("json",json);
@@ -132,12 +133,13 @@
     @Test
     public void testYaml() throws Exception {
         MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder()
-                .layer(new RBM.Builder().dist(new NormalDistribution(1, 1e-1)).build())
-                .list().inputPreProcessor(1, new ReshapePreProcessor())
+                .list()
+                .layer(0, new RBM.Builder().dist(new NormalDistribution(1, 1e-1)).build())
+                .inputPreProcessor(0, new ReshapePreProcessor())
                 .build();
         String json = conf.toYaml();
         MultiLayerConfiguration from = MultiLayerConfiguration.fromYaml(json);
-        assertEquals(conf.getConf(1),from.getConf(1));
+        assertEquals(conf.getConf(0),from.getConf(0));
 
         Properties props = new Properties();
         props.put("json",json);
