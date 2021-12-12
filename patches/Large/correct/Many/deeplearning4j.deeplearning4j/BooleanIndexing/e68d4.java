diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/indexing/BooleanIndexing.java b/nd4j-api/src/main/java/org/nd4j/linalg/indexing/BooleanIndexing.java
index 6801541..a77c8b5 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/indexing/BooleanIndexing.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/indexing/BooleanIndexing.java
@@ -54,7 +54,7 @@
      * @return
      */
     public static boolean or(IComplexNDArray n, Condition cond) {
-        boolean ret = true;
+        boolean ret = false;
         IComplexNDArray linear = n.linearView();
         for (int i = 0; i < linear.length(); i++) {
             ret = ret || cond.apply(linear.getComplex(i));
@@ -90,7 +90,7 @@
      * @return
      */
     public static boolean or(INDArray n, Condition cond) {
-        boolean ret = true;
+        boolean ret = false;
         INDArray linear = n.linearView();
         for (int i = 0; i < linear.length(); i++) {
             ret = ret || cond.apply(linear.getFloat(i));
