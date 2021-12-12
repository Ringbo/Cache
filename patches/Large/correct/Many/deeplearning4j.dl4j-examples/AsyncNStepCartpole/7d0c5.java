diff --git a/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/AsyncNStepCartpole.java b/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/AsyncNStepCartpole.java
index 88ef225..99dd2da 100644
--- a/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/AsyncNStepCartpole.java
+++ b/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/AsyncNStepCartpole.java
@@ -39,13 +39,13 @@
         .l2(0.001).learningRate(0.0005).numHiddenNodes(16).numLayer(3).build();
 
 
-    public static void main( String[] args )
+    public static void main( String[] args ) throws Exception
     {
         cartPole();
     }
 
 
-    public static void cartPole() {
+    public static void cartPole() throws Exception {
 
         //record the training data in rl4j-data in a new folder
         DataManager manager = new DataManager(true);
