diff --git a/services/core/java/com/android/server/media/MediaSessionService.java b/services/core/java/com/android/server/media/MediaSessionService.java
index 3bf95ef..98177fe 100644
--- a/services/core/java/com/android/server/media/MediaSessionService.java
+++ b/services/core/java/com/android/server/media/MediaSessionService.java
@@ -155,10 +155,10 @@
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
