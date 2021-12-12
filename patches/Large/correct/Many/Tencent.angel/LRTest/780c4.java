diff --git a/angel-ps/mllib/src/test/java/com/tencent/angel/ml/logisticregression/LRTest.java b/angel-ps/mllib/src/test/java/com/tencent/angel/ml/logisticregression/LRTest.java
index 21a33cd..ecb3834 100644
--- a/angel-ps/mllib/src/test/java/com/tencent/angel/ml/logisticregression/LRTest.java
+++ b/angel-ps/mllib/src/test/java/com/tencent/angel/ml/logisticregression/LRTest.java
@@ -51,7 +51,7 @@
   @Before public void setConf() throws Exception {
     try {
       // Feature number of train data
-      int featureNum = 1230;
+      int featureNum = 123;
       // Total iteration number
       int epochNum = 100;
       // Validation sample Ratio
