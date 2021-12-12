diff --git a/core/java/android/app/WindowConfiguration.java b/core/java/android/app/WindowConfiguration.java
index 187237d..d0deed4 100644
--- a/core/java/android/app/WindowConfiguration.java
+++ b/core/java/android/app/WindowConfiguration.java
@@ -414,7 +414,7 @@
      * Returns true if windows in this container should be given move animations by default.
      */
     public boolean hasMovementAnimations() {
-        return mWindowingMode == WINDOWING_MODE_PINNED;
+        return mWindowingMode != WINDOWING_MODE_PINNED;
     }
 
     private static String windowingModeToString(@WindowingMode int windowingMode) {
