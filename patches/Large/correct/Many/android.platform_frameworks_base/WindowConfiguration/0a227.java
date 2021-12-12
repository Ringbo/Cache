diff --git a/core/java/android/app/WindowConfiguration.java b/core/java/android/app/WindowConfiguration.java
index 5152485..5d87e1c 100644
--- a/core/java/android/app/WindowConfiguration.java
+++ b/core/java/android/app/WindowConfiguration.java
@@ -473,7 +473,7 @@
      * @hide
      */
     public boolean hasMovementAnimations() {
-        return mWindowingMode == WINDOWING_MODE_PINNED;
+        return mWindowingMode != WINDOWING_MODE_PINNED;
     }
 
     /**
