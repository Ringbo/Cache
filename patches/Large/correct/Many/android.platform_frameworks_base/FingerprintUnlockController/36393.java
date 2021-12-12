diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/phone/FingerprintUnlockController.java b/packages/SystemUI/src/com/android/systemui/statusbar/phone/FingerprintUnlockController.java
index 2912963..7135836 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/phone/FingerprintUnlockController.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/phone/FingerprintUnlockController.java
@@ -173,7 +173,7 @@
             if (DEBUG_FP_WAKELOCK) {
                 Log.i(TAG, "fp wakelock: Authenticated, waking up...");
             }
-            mPowerManager.wakeUp(SystemClock.uptimeMillis());
+            mPowerManager.wakeUp(SystemClock.uptimeMillis(), "android.policy:FINGERPRINT");
         }
         releaseFingerprintWakeLock();
         switch (mMode) {
