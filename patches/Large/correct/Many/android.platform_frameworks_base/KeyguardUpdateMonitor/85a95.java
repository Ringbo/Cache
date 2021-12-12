diff --git a/policy/src/com/android/internal/policy/impl/KeyguardUpdateMonitor.java b/policy/src/com/android/internal/policy/impl/KeyguardUpdateMonitor.java
index 10cf3aa..f67f0e0 100644
--- a/policy/src/com/android/internal/policy/impl/KeyguardUpdateMonitor.java
+++ b/policy/src/com/android/internal/policy/impl/KeyguardUpdateMonitor.java
@@ -218,7 +218,7 @@
 
         // take a guess to start
         mSimState = IccCard.State.READY;
-        mBatteryStatus = BATTERY_STATUS_FULL;
+        mBatteryStatus = BATTERY_STATUS_UNKNOWN;
         mBatteryLevel = 100;
 
         mTelephonyPlmn = getDefaultPlmn();
