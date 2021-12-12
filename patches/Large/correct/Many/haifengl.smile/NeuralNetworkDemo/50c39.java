diff --git a/demo/src/main/java/smile/demo/classification/NeuralNetworkDemo.java b/demo/src/main/java/smile/demo/classification/NeuralNetworkDemo.java
index fe87d7c..b0f2c0b 100644
--- a/demo/src/main/java/smile/demo/classification/NeuralNetworkDemo.java
+++ b/demo/src/main/java/smile/demo/classification/NeuralNetworkDemo.java
@@ -64,7 +64,7 @@
 
         try {
             epochs = Integer.parseInt(epochsField.getText().trim());
-            if (units <= 0) {
+            if (epochs <= 0) {
                 JOptionPane.showMessageDialog(this, "Invalid number of epochs: " + epochs, "Error", JOptionPane.ERROR_MESSAGE);
                 return null;
             }
