diff --git a/library/src/main/java/com/transitionseverywhere/Visibility.java b/library/src/main/java/com/transitionseverywhere/Visibility.java
index b60939b..be70cb6 100644
--- a/library/src/main/java/com/transitionseverywhere/Visibility.java
+++ b/library/src/main/java/com/transitionseverywhere/Visibility.java
@@ -465,7 +465,7 @@
 
                     @Override
                     public void onTransitionResume(Transition transition) {
-                        if (finalOverlayView.getParent() != null) {
+                        if (finalOverlayView.getParent() == null) {
                             ViewGroupOverlayUtils.addOverlay(sceneRoot, finalOverlayView, screenLoc[0], screenLoc[1]);
                         }
                         else {
