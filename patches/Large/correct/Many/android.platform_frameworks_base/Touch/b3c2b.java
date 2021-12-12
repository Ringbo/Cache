diff --git a/core/java/android/text/method/Touch.java b/core/java/android/text/method/Touch.java
index 3dfd44d..9394a0b 100644
--- a/core/java/android/text/method/Touch.java
+++ b/core/java/android/text/method/Touch.java
@@ -64,7 +64,9 @@
         if (actualWidth < availableWidth) {
             if (a == Alignment.ALIGN_CENTER) {
                 x = left - ((availableWidth - actualWidth) / 2);
-            } else if ((ltr && (a == Alignment.ALIGN_OPPOSITE)) || (a == Alignment.ALIGN_RIGHT)) {
+            } else if ((ltr && (a == Alignment.ALIGN_OPPOSITE)) ||
+                       (!ltr && (a == Alignment.ALIGN_NORMAL)) ||
+                       (a == Alignment.ALIGN_RIGHT)) {
                 // align_opposite does NOT mean align_right, we need the paragraph
                 // direction to resolve it to left or right
                 x = left - (availableWidth - actualWidth);
