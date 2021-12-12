diff --git a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/BaseOutputLayer.java b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/BaseOutputLayer.java
index 599279d..ded8815 100644
--- a/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/BaseOutputLayer.java
+++ b/deeplearning4j-nn/src/main/java/org/deeplearning4j/nn/layers/BaseOutputLayer.java
@@ -409,10 +409,10 @@
     @Override
     public void migrateInput(){
         super.migrateInput();
-        if(labels != null){
+        if(labels != null && labels.isAttached()){
             labels = labels.migrate(true);
         }
-        if(inputMaskArray != null){
+        if(inputMaskArray != null && inputMaskArray.isAttached()){
             inputMaskArray = inputMaskArray.migrate(true);
         }
     }
