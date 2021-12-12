diff --git a/src/edu/stanford/nlp/math/ArrayMath.java b/src/edu/stanford/nlp/math/ArrayMath.java
index cf690dd..97989fa 100644
--- a/src/edu/stanford/nlp/math/ArrayMath.java
+++ b/src/edu/stanford/nlp/math/ArrayMath.java
@@ -280,7 +280,7 @@
 
   public static void pairwiseAddInPlace(double[] to, double[] from) {
     if (to.length != from.length) {
-      throw new RuntimeException();
+      throw new RuntimeException("to length:" + to.length + " from length:" + from.length);
     }
     for (int i = 0; i < to.length; i++) {
       to[i] = to[i] + from[i];
