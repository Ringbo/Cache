diff --git a/policy/src/com/android/internal/policy/impl/keyguard/KeyguardFaceUnlockView.java b/policy/src/com/android/internal/policy/impl/keyguard/KeyguardFaceUnlockView.java
index 78fdda3..04ab871 100644
--- a/policy/src/com/android/internal/policy/impl/keyguard/KeyguardFaceUnlockView.java
+++ b/policy/src/com/android/internal/policy/impl/keyguard/KeyguardFaceUnlockView.java
@@ -75,7 +75,7 @@
     public void onDetachedFromWindow() {
         if (DEBUG) Log.d(TAG, "onDetachedFromWindow()");
         if (mBiometricUnlock != null) {
-            mBiometricUnlock.stopAndShowBackup();
+            mBiometricUnlock.stop();
         }
     }
 
