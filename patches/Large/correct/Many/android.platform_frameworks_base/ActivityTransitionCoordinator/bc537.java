diff --git a/core/java/android/app/ActivityTransitionCoordinator.java b/core/java/android/app/ActivityTransitionCoordinator.java
index ca9fabc..b3046b5 100644
--- a/core/java/android/app/ActivityTransitionCoordinator.java
+++ b/core/java/android/app/ActivityTransitionCoordinator.java
@@ -549,7 +549,7 @@
         Bundle bundle = new Bundle();
         RectF tempBounds = new RectF();
         Matrix tempMatrix = new Matrix();
-        for (int i = 0; i < mSharedElementNames.size(); i++) {
+        for (int i = 0; i < mSharedElements.size(); i++) {
             View sharedElement = mSharedElements.get(i);
             String name = mSharedElementNames.get(i);
             captureSharedElementState(sharedElement, name, bundle, tempMatrix, tempBounds);
