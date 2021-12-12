diff --git a/src/org/thoughtcrime/securesms/service/WebRtcCallService.java b/src/org/thoughtcrime/securesms/service/WebRtcCallService.java
index ab722b5..119ee0a 100644
--- a/src/org/thoughtcrime/securesms/service/WebRtcCallService.java
+++ b/src/org/thoughtcrime/securesms/service/WebRtcCallService.java
@@ -748,7 +748,11 @@
       else                   this.lockManager.updatePhoneState(LockManager.PhoneState.IN_CALL);
     }
 
-    if (localVideoEnabled && !audioManager.isSpeakerphoneOn() && !audioManager.isBluetoothScoOn()) {
+    if (localVideoEnabled &&
+        !audioManager.isSpeakerphoneOn() &&
+        !audioManager.isBluetoothScoOn() &&
+        !audioManager.isWiredHeadsetOn())
+    {
       audioManager.setSpeakerphoneOn(true);
     }
 
