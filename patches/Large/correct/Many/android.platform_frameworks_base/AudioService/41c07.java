diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index fd71d79..b22aa1d 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -357,7 +357,7 @@
     private static final int SCO_STATE_INACTIVE = 0;
     // SCO audio activation request waiting for headset service to connect
     private static final int SCO_STATE_ACTIVATE_REQ = 1;
-    // SCO audio state is active or starting due to a local request to start a virtual call
+    // SCO audio state is active or starting due to a request from AudioManager API
     private static final int SCO_STATE_ACTIVE_INTERNAL = 3;
     // SCO audio deactivation request waiting for headset service to connect
     private static final int SCO_STATE_DEACTIVATE_REQ = 5;
@@ -2053,8 +2053,7 @@
                                  mScoAudioState == SCO_STATE_DEACTIVATE_REQ)) {
                             if (mScoAudioState == SCO_STATE_INACTIVE) {
                                 if (mBluetoothHeadset != null && mBluetoothHeadsetDevice != null) {
-                                    if (mBluetoothHeadset.startScoUsingVirtualVoiceCall(
-                                            mBluetoothHeadsetDevice)) {
+                                    if (mBluetoothHeadset.connectAudio()) {
                                         mScoAudioState = SCO_STATE_ACTIVE_INTERNAL;
                                     } else {
                                         broadcastScoConnectionState(
@@ -2076,8 +2075,7 @@
                                mScoAudioState == SCO_STATE_ACTIVATE_REQ)) {
                     if (mScoAudioState == SCO_STATE_ACTIVE_INTERNAL) {
                         if (mBluetoothHeadset != null && mBluetoothHeadsetDevice != null) {
-                            if (!mBluetoothHeadset.stopScoUsingVirtualVoiceCall(
-                                    mBluetoothHeadsetDevice)) {
+                            if (!mBluetoothHeadset.disconnectAudio()) {
                                 mScoAudioState = SCO_STATE_INACTIVE;
                                 broadcastScoConnectionState(
                                         AudioManager.SCO_AUDIO_STATE_DISCONNECTED);
@@ -2250,12 +2248,10 @@
                             switch (mScoAudioState) {
                             case SCO_STATE_ACTIVATE_REQ:
                                 mScoAudioState = SCO_STATE_ACTIVE_INTERNAL;
-                                status = mBluetoothHeadset.startScoUsingVirtualVoiceCall(
-                                        mBluetoothHeadsetDevice);
+                                status = mBluetoothHeadset.connectAudio();
                                 break;
                             case SCO_STATE_DEACTIVATE_REQ:
-                                status = mBluetoothHeadset.stopScoUsingVirtualVoiceCall(
-                                        mBluetoothHeadsetDevice);
+                                status = mBluetoothHeadset.disconnectAudio();
                                 break;
                             case SCO_STATE_DEACTIVATE_EXT_REQ:
                                 status = mBluetoothHeadset.stopVoiceRecognition(
