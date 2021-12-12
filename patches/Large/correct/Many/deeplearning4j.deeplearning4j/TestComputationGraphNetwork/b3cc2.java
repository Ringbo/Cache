diff --git a/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/graph/TestComputationGraphNetwork.java b/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/graph/TestComputationGraphNetwork.java
index 97ffabe..1564efe 100644
--- a/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/graph/TestComputationGraphNetwork.java
+++ b/deeplearning4j/deeplearning4j-core/src/test/java/org/deeplearning4j/nn/graph/TestComputationGraphNetwork.java
@@ -1695,7 +1695,7 @@
                 .layer("3", new DenseLayer.Builder().nOut(10).build(), "1")     //First in topo sort for using this input - not allowed
                 .layer("4", new DenseLayer.Builder().nOut(10).build(), "1")     //Second in topo sort - not allowed
                 .layer("5", new DenseLayer.Builder().nOut(10).build(), "1")     //Last in topo sort - allowed
-                .layer("6", new DenseLayer.Builder().nOut(10).build(), "3", "4", "5")   //Input from merge vertex - allowed
+                .layer("6", new DenseLayer.Builder().nOut(10).build(), "2", "3", "4", "5")   //Input from merge vertex - allowed
                 .setOutputs("6")
                 .setInputTypes(InputType.feedForward(10), InputType.feedForward(10))
                 .build();
@@ -1715,6 +1715,7 @@
 
         for(String s : exp.keySet()){
             boolean allowed = ((org.deeplearning4j.nn.layers.feedforward.dense.DenseLayer)cg.getLayer(s)).isInputModificationAllowed();
+//            System.out.println(s + "\t" + allowed);
             assertEquals(s, exp.get(s), allowed);
         }
     }
