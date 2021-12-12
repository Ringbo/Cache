diff --git a/src/com/jwetherell/algorithms/mathematics/Knapsack.java b/src/com/jwetherell/algorithms/mathematics/Knapsack.java
index 69f848c..09079ce 100644
--- a/src/com/jwetherell/algorithms/mathematics/Knapsack.java
+++ b/src/com/jwetherell/algorithms/mathematics/Knapsack.java
@@ -40,7 +40,7 @@
         final List<Integer> list = new ArrayList<Integer>();
         int i = height - 1;
         int j = width - 1;
-        while (i != 0 || j != 0) {
+        while (i != 0 && j != 0) {
             int current = output[i][j];
             int above = output[i - 1][j];
             if (current == above) {
