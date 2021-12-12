diff --git a/demo_misc/webm_sw_decoder/src/main/java/com/google/android/exoplayer/demo/webm/VideoPlayer.java b/demo_misc/webm_sw_decoder/src/main/java/com/google/android/exoplayer/demo/webm/VideoPlayer.java
index c855cd6..ab65171 100644
--- a/demo_misc/webm_sw_decoder/src/main/java/com/google/android/exoplayer/demo/webm/VideoPlayer.java
+++ b/demo_misc/webm_sw_decoder/src/main/java/com/google/android/exoplayer/demo/webm/VideoPlayer.java
@@ -274,7 +274,7 @@
   }
 
   private void toggleControlsVisibility()  {
-    if (mediaController != null) {
+    if (mediaController != null && player != null) {
       if (mediaController.isShowing()) {
         mediaController.hide();
       } else {
