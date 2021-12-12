diff --git a/telephony/java/com/android/internal/telephony/sip/SipPhone.java b/telephony/java/com/android/internal/telephony/sip/SipPhone.java
index 9670214..3f4fdda 100755
--- a/telephony/java/com/android/internal/telephony/sip/SipPhone.java
+++ b/telephony/java/com/android/internal/telephony/sip/SipPhone.java
@@ -441,7 +441,7 @@
         @Override
         public void hangup() throws CallStateException {
             synchronized (SipPhone.class) {
-                if (mState.isAlive()) {
+                if (state.isAlive()) {
                     Log.d(LOG_TAG, "hang up call: " + getState() + ": " + this
                             + " on phone " + getPhone());
                     CallStateException excp = null;
