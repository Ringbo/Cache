diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/util/Shape.java b/nd4j-api/src/main/java/org/nd4j/linalg/util/Shape.java
index 833e5a2..7448855 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/util/Shape.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/util/Shape.java
@@ -427,7 +427,7 @@
      * but would need special cases since their strides do not matter.
      */
         for (oi = 0; oi < arr.rank(); oi++) {
-            if (arr.size(oi) != 1) {
+            if (arr.size(oi) != 1 && !isVector(arr.shape())) {
                 olddims[oldnd] = arr.size(oi);
                 oldstrides[oldnd] = arr.stride(oi);
                 oldnd++;
