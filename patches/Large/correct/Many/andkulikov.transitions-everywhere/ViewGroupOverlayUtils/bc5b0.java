diff --git a/library/src/main/java/android/transitions/everywhere/utils/ViewGroupOverlayUtils.java b/library/src/main/java/android/transitions/everywhere/utils/ViewGroupOverlayUtils.java
index 270d625..3d5bc93 100644
--- a/library/src/main/java/android/transitions/everywhere/utils/ViewGroupOverlayUtils.java
+++ b/library/src/main/java/android/transitions/everywhere/utils/ViewGroupOverlayUtils.java
@@ -88,7 +88,7 @@
 
         @Override
         public void moveViewInOverlay(ViewGroup sceneRoot, View overlayView, int screenX, int screenY) {
-            if (screenX != 0 && screenY != 0) {
+            if (screenX != 0 || screenY != 0) {
                 int[] loc = new int[2];
                 sceneRoot.getLocationOnScreen(loc);
                 overlayView.offsetLeftAndRight((screenX - loc[0]) - overlayView.getLeft());
