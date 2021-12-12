diff --git a/src/main/java/org/deeplearning4j/examples/deepbelief/DBNIrisExample.java b/src/main/java/org/deeplearning4j/examples/deepbelief/DBNIrisExample.java
index a5918fb..03a7efd 100755
--- a/src/main/java/org/deeplearning4j/examples/deepbelief/DBNIrisExample.java
+++ b/src/main/java/org/deeplearning4j/examples/deepbelief/DBNIrisExample.java
@@ -137,7 +137,7 @@
         dis.close();
         MultiLayerNetwork savedNetwork = new MultiLayerNetwork(confFromJson);
         savedNetwork.init();
-        savedNetwork.setParameters(newParams);
+        savedNetwork.setParams(newParams);
         System.out.println("Original network params " + model.params());
         System.out.println(savedNetwork.params());
 
