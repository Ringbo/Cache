diff --git a/core/java/android/webkit/HTML5VideoViewProxy.java b/core/java/android/webkit/HTML5VideoViewProxy.java
index 094566f..acd7eab 100644
--- a/core/java/android/webkit/HTML5VideoViewProxy.java
+++ b/core/java/android/webkit/HTML5VideoViewProxy.java
@@ -109,7 +109,7 @@
                     boolean foundInTree = nativeSendSurfaceTexture(surfTexture,
                             layer, currentVideoLayerId, textureName,
                             playerState);
-                    if (playerState == HTML5VideoView.STATE_PREPARED
+                    if (playerState >= HTML5VideoView.STATE_PREPARED
                             && !foundInTree) {
                         mHTML5VideoView.pauseAndDispatch(mCurrentProxy);
                         mHTML5VideoView.deleteSurfaceTexture();
