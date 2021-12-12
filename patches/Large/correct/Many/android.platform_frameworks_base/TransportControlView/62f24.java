diff --git a/core/java/com/android/internal/widget/TransportControlView.java b/core/java/com/android/internal/widget/TransportControlView.java
index 979eb81..2f52585 100644
--- a/core/java/com/android/internal/widget/TransportControlView.java
+++ b/core/java/com/android/internal/widget/TransportControlView.java
@@ -314,7 +314,7 @@
         final int flags = mTransportControlFlags;
         setVisibilityBasedOnFlag(mBtnPrev, flags, RemoteControlClient.FLAG_KEY_MEDIA_PREVIOUS);
         setVisibilityBasedOnFlag(mBtnNext, flags, RemoteControlClient.FLAG_KEY_MEDIA_NEXT);
-        setVisibilityBasedOnFlag(mBtnPrev, flags,
+        setVisibilityBasedOnFlag(mBtnPlay, flags,
                 RemoteControlClient.FLAG_KEY_MEDIA_PLAY
                 | RemoteControlClient.FLAG_KEY_MEDIA_PAUSE
                 | RemoteControlClient.FLAG_KEY_MEDIA_PLAY_PAUSE
