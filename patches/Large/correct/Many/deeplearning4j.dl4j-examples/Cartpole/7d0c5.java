diff --git a/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/Cartpole.java b/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/Cartpole.java
index eac8512..4cc36fa 100644
--- a/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/Cartpole.java
+++ b/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/Cartpole.java
@@ -43,13 +43,13 @@
         DQNFactoryStdDense.Configuration.builder()
             .l2(0.001).learningRate(0.0005).numHiddenNodes(16).numLayer(3).build();
 
-    public static void main( String[] args )
+    public static void main( String[] args ) throws Exception
     {
         cartPole();
         loadCartpole();
     }
 
-    public static void cartPole() {
+    public static void cartPole() throws Exception {
 
         //record the training data in rl4j-data in a new folder (save)
         DataManager manager = new DataManager(true);
@@ -80,7 +80,7 @@
     }
 
 
-    public static void loadCartpole(){
+    public static void loadCartpole() throws Exception {
 
         //showcase serialization by using the trained agent on a new similar mdp (but render it this time)
 
