diff --git a/core/java/android/widget/Switch.java b/core/java/android/widget/Switch.java
index 6f3a711..434516d 100644
--- a/core/java/android/widget/Switch.java
+++ b/core/java/android/widget/Switch.java
@@ -1387,7 +1387,7 @@
             mTrackDrawable.jumpToCurrentState();
         }
 
-        if (mPositionAnimator != null && mPositionAnimator.isRunning()) {
+        if (mPositionAnimator != null && mPositionAnimator.isStarted()) {
             mPositionAnimator.end();
             mPositionAnimator = null;
         }
