diff --git a/nd4j/nd4j-tensorflow/src/main/java/org/nd4j/tensorflow/conversion/TensorflowConversion.java b/nd4j/nd4j-tensorflow/src/main/java/org/nd4j/tensorflow/conversion/TensorflowConversion.java
index c5ae881..b47cd30 100644
--- a/nd4j/nd4j-tensorflow/src/main/java/org/nd4j/tensorflow/conversion/TensorflowConversion.java
+++ b/nd4j/nd4j-tensorflow/src/main/java/org/nd4j/tensorflow/conversion/TensorflowConversion.java
@@ -296,7 +296,7 @@
      * @return
      */
     public static String defaultDeviceForThread() {
-        Integer deviceForThread = Nd4j.getAffinityManager().getDeviceForThread(Thread.currentThread());
+        Integer deviceForThread = Nd4j.getAffinityManager().getDeviceForCurrentThread();
         String deviceName = null;
         //gpu
         if(Nd4j.getBackend().getClass().getName().contains("JCublasBackend")) {
