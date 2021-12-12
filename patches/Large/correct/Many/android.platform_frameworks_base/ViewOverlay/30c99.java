diff --git a/core/java/android/view/ViewOverlay.java b/core/java/android/view/ViewOverlay.java
index 78e2597..fe5b990 100644
--- a/core/java/android/view/ViewOverlay.java
+++ b/core/java/android/view/ViewOverlay.java
@@ -157,7 +157,8 @@
         public void add(View child) {
             if (child.getParent() instanceof ViewGroup) {
                 ViewGroup parent = (ViewGroup) child.getParent();
-                if (parent != mHostView) {
+                if (parent != mHostView && parent.getParent() != null &&
+                        parent.mAttachInfo != null) {
                     // Moving to different container; figure out how to position child such that
                     // it is in the same location on the screen
                     int[] parentLocation = new int[2];
