diff --git a/services/core/java/com/android/server/media/MediaSessionRecord.java b/services/core/java/com/android/server/media/MediaSessionRecord.java
index 0da2cfa..b936130d 100644
--- a/services/core/java/com/android/server/media/MediaSessionRecord.java
+++ b/services/core/java/com/android/server/media/MediaSessionRecord.java
@@ -231,7 +231,7 @@
      * @param direction The direction to adjust volume in.
      */
     public void adjustVolume(int direction, int flags, String packageName, int uid) {
-        if (isPlaybackActive(false)) {
+        if (isPlaybackActive(false) || hasFlag(MediaSession.FLAG_EXCLUSIVE_GLOBAL_PRIORITY)) {
             flags &= ~AudioManager.FLAG_PLAY_SOUND;
         }
         if (direction > 1) {
