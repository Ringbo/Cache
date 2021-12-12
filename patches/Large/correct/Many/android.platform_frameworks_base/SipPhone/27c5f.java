diff --git a/telephony/java/com/android/internal/telephony/sip/SipPhone.java b/telephony/java/com/android/internal/telephony/sip/SipPhone.java
index 4e3f26d..192720d 100755
--- a/telephony/java/com/android/internal/telephony/sip/SipPhone.java
+++ b/telephony/java/com/android/internal/telephony/sip/SipPhone.java
@@ -444,7 +444,7 @@
         @Override
         public void hangup() throws CallStateException {
             synchronized (SipPhone.class) {
-                if (mState.isAlive()) {
+                if (state.isAlive()) {
                     Log.d(LOG_TAG, "hang up call: " + getState() + ": " + this
                             + " on phone " + getPhone());
                     CallStateException excp = null;
