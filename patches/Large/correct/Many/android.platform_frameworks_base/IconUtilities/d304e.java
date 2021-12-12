diff --git a/policy/src/com/android/internal/policy/impl/IconUtilities.java b/policy/src/com/android/internal/policy/impl/IconUtilities.java
index e997355..a47c904 100644
--- a/policy/src/com/android/internal/policy/impl/IconUtilities.java
+++ b/policy/src/com/android/internal/policy/impl/IconUtilities.java
@@ -130,7 +130,7 @@
         int sourceWidth = icon.getIntrinsicWidth();
         int sourceHeight = icon.getIntrinsicHeight();
 
-        if (sourceWidth > 0 && sourceWidth > 0) {
+        if (sourceWidth > 0 && sourceHeight > 0) {
             // There are intrinsic sizes.
             if (width < sourceWidth || height < sourceHeight) {
                 // It's too big, scale it down.
