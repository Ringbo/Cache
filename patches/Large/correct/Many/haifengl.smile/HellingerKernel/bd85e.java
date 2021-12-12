diff --git a/SmileMath/src/main/java/smile/math/kernel/HellingerKernel.java b/SmileMath/src/main/java/smile/math/kernel/HellingerKernel.java
index ab33372..4de04f8 100644
--- a/SmileMath/src/main/java/smile/math/kernel/HellingerKernel.java
+++ b/SmileMath/src/main/java/smile/math/kernel/HellingerKernel.java
@@ -42,7 +42,7 @@
         
         double sum = 0;
         for (int i = 0; i < x.length; i++) {
-            sum += Math.sqr(x[i] * y[i]);
+            sum += Math.sqrt(x[i] * y[i]);
         }
 
         return sum;
