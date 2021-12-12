diff --git a/core/java/android/app/ActivityTransitionCoordinator.java b/core/java/android/app/ActivityTransitionCoordinator.java
index d611058..75982f5 100644
--- a/core/java/android/app/ActivityTransitionCoordinator.java
+++ b/core/java/android/app/ActivityTransitionCoordinator.java
@@ -711,7 +711,7 @@
     }
 
     protected void moveSharedElementsToOverlay() {
-        if (!mWindow.getSharedElementsUseOverlay()) {
+        if (mWindow == null || !mWindow.getSharedElementsUseOverlay()) {
             return;
         }
         int numSharedElements = mSharedElements.size();
