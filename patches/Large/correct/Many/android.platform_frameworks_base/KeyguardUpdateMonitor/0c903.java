diff --git a/packages/Keyguard/src/com/android/keyguard/KeyguardUpdateMonitor.java b/packages/Keyguard/src/com/android/keyguard/KeyguardUpdateMonitor.java
index d889d0c..e6a89f1 100644
--- a/packages/Keyguard/src/com/android/keyguard/KeyguardUpdateMonitor.java
+++ b/packages/Keyguard/src/com/android/keyguard/KeyguardUpdateMonitor.java
@@ -205,7 +205,7 @@
                     handleScreenTurnedOn();
                     break;
                 case MSG_FINGERPRINT_AUTHENTICATED:
-                    handleFingerprintAuthenticated(msg.arg1, msg.arg2);
+                    handleFingerprintAuthenticated();
                     break;
                 case MSG_FINGERPRINT_HELP:
                     handleFingerprintHelp(msg.arg1 /* msgId */, (String) msg.obj /* errString */);
@@ -348,7 +348,7 @@
         handleFingerprintHelp(-1, mContext.getString(R.string.fingerprint_not_recognized));
     }
 
-    private void handleFingerprintAuthenticated(int fingerId, int groupId) {
+    private void handleFingerprintAuthenticated() {
         try {
             final int userId;
             try {
@@ -524,9 +524,7 @@
 
         @Override
         public void onAuthenticationSucceeded(AuthenticationResult result) {
-            mHandler.obtainMessage(MSG_FINGERPRINT_AUTHENTICATED,
-                    result.getFingerprint().getFingerId(),
-                    result.getFingerprint().getGroupId()).sendToTarget();
+            mHandler.obtainMessage(MSG_FINGERPRINT_AUTHENTICATED).sendToTarget();
         }
 
         @Override
