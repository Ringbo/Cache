diff --git a/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/A3CCartpole.java b/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/A3CCartpole.java
index 7c65fb2..b0e7639 100644
--- a/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/A3CCartpole.java
+++ b/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/A3CCartpole.java
@@ -33,12 +33,12 @@
     private static final ActorCriticFactorySeparateStdDense.Configuration CARTPOLE_NET_A3C =  ActorCriticFactorySeparateStdDense.Configuration
     .builder().learningRate(1e-2).l2(0).numHiddenNodes(16).numLayer(3).build();
 
-    public static void main( String[] args )
+    public static void main( String[] args ) throws Exception
     {
         A3CcartPole();
     }
 
-    public static void A3CcartPole() {
+    public static void A3CcartPole() throws Exception  {
 
         //record the training data in rl4j-data in a new folder
         DataManager manager = new DataManager(true);
