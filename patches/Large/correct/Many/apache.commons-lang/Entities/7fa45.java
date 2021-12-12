diff --git a/src/java/org/apache/commons/lang/Entities.java b/src/java/org/apache/commons/lang/Entities.java
index 424d1f5..900e1a8 100644
--- a/src/java/org/apache/commons/lang/Entities.java
+++ b/src/java/org/apache/commons/lang/Entities.java
@@ -679,7 +679,7 @@
             int high = size - 1;
 
             while (low <= high) {
-                int mid = (low + high) >> 1;
+                int mid = (low + high) >>> 1;
                 int midVal = values[mid];
 
                 if (midVal < key) {
