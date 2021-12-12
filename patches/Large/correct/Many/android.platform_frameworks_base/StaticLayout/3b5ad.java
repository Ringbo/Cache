diff --git a/core/java/android/text/StaticLayout.java b/core/java/android/text/StaticLayout.java
index 2bcb352..7828851 100644
--- a/core/java/android/text/StaticLayout.java
+++ b/core/java/android/text/StaticLayout.java
@@ -811,7 +811,7 @@
                 float sum = 0;
                 int i;
 
-                for (i = len; i >= 0; i--) {
+                for (i = len; i > 0; i--) {
                     float w = widths[i - 1 + lineStart - widthStart];
 
                     if (w + sum + ellipsisWidth > avail) {
