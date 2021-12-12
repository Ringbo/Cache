diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/autodiff/samediff/SameDiff.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/autodiff/samediff/SameDiff.java
index 9ec5ee6..3239e7b 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/autodiff/samediff/SameDiff.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/autodiff/samediff/SameDiff.java
@@ -3129,7 +3129,7 @@
      * @return
      */
     public SDVariable expm1(String name, SDVariable iX) {
-        SDVariable result = functionFactory.exp(iX);
+        SDVariable result = functionFactory.expm1(iX);
         return updateVariableNameAndReference(result, name);
     }
 
