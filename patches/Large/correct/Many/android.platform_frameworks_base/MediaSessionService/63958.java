diff --git a/services/core/java/com/android/server/media/MediaSessionService.java b/services/core/java/com/android/server/media/MediaSessionService.java
index 5738a05..5a16e4d 100644
--- a/services/core/java/com/android/server/media/MediaSessionService.java
+++ b/services/core/java/com/android/server/media/MediaSessionService.java
@@ -971,7 +971,8 @@
                 }
             } else {
                 session.adjustVolumeBy(delta, flags);
-                if (mRvc != null) {
+                if (session.getPlaybackType() == MediaSession.PLAYBACK_TYPE_REMOTE
+                        && mRvc != null) {
                     try {
                         mRvc.remoteVolumeChanged(session.getControllerBinder(), flags);
                     } catch (Exception e) {
