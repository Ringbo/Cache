diff --git a/services/core/java/com/android/server/fingerprint/FingerprintService.java b/services/core/java/com/android/server/fingerprint/FingerprintService.java
index 67c9ee8..0023258 100644
--- a/services/core/java/com/android/server/fingerprint/FingerprintService.java
+++ b/services/core/java/com/android/server/fingerprint/FingerprintService.java
@@ -259,7 +259,7 @@
     }
 
     private boolean inLockoutMode() {
-        return mFailedAttempts > MAX_FAILED_ATTEMPTS;
+        return mFailedAttempts >= MAX_FAILED_ATTEMPTS;
     }
 
     private void resetFailedAttempts() {
@@ -275,7 +275,7 @@
 
     private boolean handleFailedAttempt(ClientMonitor clientMonitor) {
         mFailedAttempts++;
-        if (mFailedAttempts > MAX_FAILED_ATTEMPTS) {
+        if (inLockoutMode()) {
             // Failing multiple times will continue to push out the lockout time.
             mHandler.removeCallbacks(mLockoutReset);
             mHandler.postDelayed(mLockoutReset, FAIL_LOCKOUT_TIMEOUT_MS);
