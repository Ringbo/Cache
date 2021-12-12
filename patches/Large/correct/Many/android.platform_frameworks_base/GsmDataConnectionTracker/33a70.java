diff --git a/telephony/java/com/android/internal/telephony/gsm/GsmDataConnectionTracker.java b/telephony/java/com/android/internal/telephony/gsm/GsmDataConnectionTracker.java
index e00ee83..c33d4b6 100644
--- a/telephony/java/com/android/internal/telephony/gsm/GsmDataConnectionTracker.java
+++ b/telephony/java/com/android/internal/telephony/gsm/GsmDataConnectionTracker.java
@@ -1398,7 +1398,7 @@
 
     protected void onVoiceCallEnded() {
         if (state == State.CONNECTED) {
-            if (mGsmPhone.mSST.isConcurrentVoiceAndData()) {
+            if (!mGsmPhone.mSST.isConcurrentVoiceAndData()) {
                 startNetStatPoll();
                 phone.notifyDataConnection(Phone.REASON_VOICE_CALL_ENDED);
             } else {
