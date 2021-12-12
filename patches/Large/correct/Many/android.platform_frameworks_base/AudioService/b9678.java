diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index 01b21db..f59848f 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -831,7 +831,7 @@
         if (state != AudioSystem.getMasterMute()) {
             AudioSystem.setMasterMute(state);
             // Post a persist master volume msg
-            sendMsg(mAudioHandler, MSG_PERSIST_MASTER_VOLUME_MUTE, 0, SENDMSG_REPLACE, state ? 1
+            sendMsg(mAudioHandler, MSG_PERSIST_MASTER_VOLUME_MUTE, SENDMSG_REPLACE, state ? 1
                     : 0, 0, null, PERSIST_DELAY);
             sendMasterMuteUpdate(state, AudioManager.FLAG_SHOW_UI);
         }
