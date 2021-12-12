diff --git a/test/com/google/javascript/jscomp/PeepholeFoldConstantsTest.java b/test/com/google/javascript/jscomp/PeepholeFoldConstantsTest.java
index 5e792b9..f32ba84 100644
--- a/test/com/google/javascript/jscomp/PeepholeFoldConstantsTest.java
+++ b/test/com/google/javascript/jscomp/PeepholeFoldConstantsTest.java
@@ -1279,7 +1279,7 @@
     foldSame("var x = 3 * (r ? Infinity : -Infinity);");
   }
 
-  private String join(String operandA, String op, String operandB) {
+  private static String join(String operandA, String op, String operandB) {
     return operandA + " " + op + " " + operandB;
   }
 
