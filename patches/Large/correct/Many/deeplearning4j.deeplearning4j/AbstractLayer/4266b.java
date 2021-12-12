diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/AbstractLayer.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/AbstractLayer.java
index fd7bf60..fcd1c3e 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/AbstractLayer.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/AbstractLayer.java
@@ -107,13 +107,13 @@
 
     @Override
     public void migrateInput(){
-        if(input != null){
+        if(input != null && input.isAttached()){
             input = input.migrate(true);
         }
-        if(preOutput != null){
+        if(preOutput != null && preOutput.isAttached()){
             preOutput = preOutput.migrate(true);
         }
-        if(maskArray != null){
+        if(maskArray != null && maskArray.isAttached()){
             maskArray = maskArray.migrate(true);
         }
     }
