diff --git a/services/core/java/com/android/server/hdmi/SystemAudioAutoInitiationAction.java b/services/core/java/com/android/server/hdmi/SystemAudioAutoInitiationAction.java
index c7ab406..845eaa9 100644
--- a/services/core/java/com/android/server/hdmi/SystemAudioAutoInitiationAction.java
+++ b/services/core/java/com/android/server/hdmi/SystemAudioAutoInitiationAction.java
@@ -106,7 +106,7 @@
     private void handleSystemAudioModeStatusTimeout() {
         if (tv().getSystemAudioMode()) {
             if (canChangeSystemAudio()) {
-                addAndStartAction(new SystemAudioActionFromTv(tv(), mAvrAddress, true));
+                addAndStartAction(new SystemAudioActionFromTv(tv(), mAvrAddress, true, null));
             }
         } else {
             tv().setSystemAudioMode(false);
