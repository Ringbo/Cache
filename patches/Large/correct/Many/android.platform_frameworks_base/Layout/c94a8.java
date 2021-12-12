diff --git a/core/java/android/text/Layout.java b/core/java/android/text/Layout.java
index a6e8c70..9dfd383 100644
--- a/core/java/android/text/Layout.java
+++ b/core/java/android/text/Layout.java
@@ -1115,7 +1115,7 @@
 
         float dist = Math.abs(getPrimaryHorizontal(max) - horiz);
 
-        if (dist < bestdist) {
+        if (dist <= bestdist) {
             bestdist = dist;
             best = max;
         }
