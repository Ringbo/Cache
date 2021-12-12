diff --git a/services/core/java/com/android/server/audio/AudioService.java b/services/core/java/com/android/server/audio/AudioService.java
index e5c3106..5a7f6e3 100644
--- a/services/core/java/com/android/server/audio/AudioService.java
+++ b/services/core/java/com/android/server/audio/AudioService.java
@@ -352,7 +352,7 @@
         AudioSystem.STREAM_MUSIC,           // STREAM_TTS
         AudioSystem.STREAM_MUSIC            // STREAM_ACCESSIBILITY
     };
-    private int[] mStreamVolumeAlias;
+    protected static int[] mStreamVolumeAlias;
 
     /**
      * Map AudioSystem.STREAM_* constants to app ops.  This should be used
@@ -1817,7 +1817,7 @@
     }
 
     // UI update and Broadcast Intent
-    private void sendVolumeUpdate(int streamType, int oldIndex, int index, int flags) {
+    protected void sendVolumeUpdate(int streamType, int oldIndex, int index, int flags) {
         streamType = mStreamVolumeAlias[streamType];
 
         if (streamType == AudioSystem.STREAM_MUSIC) {
