diff --git a/services/core/java/com/android/server/media/MediaSessionService.java b/services/core/java/com/android/server/media/MediaSessionService.java
index 9b37f12..2ac5faf 100644
--- a/services/core/java/com/android/server/media/MediaSessionService.java
+++ b/services/core/java/com/android/server/media/MediaSessionService.java
@@ -150,10 +150,10 @@
     }
 
     /**
-     * Tells the system UI that volume has changed on a remote session.
+     * Tells the system UI that volume has changed on an active remote session.
      */
     public void notifyRemoteVolumeChanged(int flags, MediaSessionRecord session) {
-        if (mRvc == null) {
+        if (mRvc == null || !session.isActive()) {
             return;
         }
         try {
