diff --git a/core/java/android/app/ActivityTransitionCoordinator.java b/core/java/android/app/ActivityTransitionCoordinator.java
index ef7ef48..82b6e35 100644
--- a/core/java/android/app/ActivityTransitionCoordinator.java
+++ b/core/java/android/app/ActivityTransitionCoordinator.java
@@ -798,7 +798,7 @@
     }
 
     protected void moveSharedElementsToOverlay() {
-        if (!mWindow.getSharedElementsUseOverlay()) {
+        if (mWindow == null || !mWindow.getSharedElementsUseOverlay()) {
             return;
         }
         setSharedElementMatrices();
