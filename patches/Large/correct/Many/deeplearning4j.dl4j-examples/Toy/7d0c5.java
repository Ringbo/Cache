diff --git a/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/Toy.java b/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/Toy.java
index 4abf1c2..c594803 100644
--- a/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/Toy.java
+++ b/rl4j-examples/src/main/java/org/deeplearning4j/examples/rl4j/Toy.java
@@ -64,14 +64,14 @@
              DQNFactoryStdDense.Configuration.builder()
         .l2(0.01).learningRate(1e-2).numLayer(3).numHiddenNodes(16).build();
 
-    public static void main(String[] args )
+    public static void main(String[] args ) throws Exception
     {
         simpleToy();
         //toyAsyncNstep();
 
     }
 
-    public static void simpleToy() {
+    public static void simpleToy() throws Exception {
 
         //record the training data in rl4j-data in a new folder
         DataManager manager = new DataManager();
@@ -93,7 +93,7 @@
 
     }
 
-    public static void hardToy() {
+    public static void hardToy() throws Exception {
 
         //record the training data in rl4j-data in a new folder
         DataManager manager = new DataManager();
@@ -114,7 +114,7 @@
     }
 
 
-    public static void toyAsyncNstep() {
+    public static void toyAsyncNstep() throws Exception {
 
         //record the training data in rl4j-data in a new folder
         DataManager manager = new DataManager();
