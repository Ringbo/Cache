diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/policy/NetworkControllerImpl.java b/packages/SystemUI/src/com/android/systemui/statusbar/policy/NetworkControllerImpl.java
index 966c0b0..56402a5 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/policy/NetworkControllerImpl.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/policy/NetworkControllerImpl.java
@@ -339,7 +339,7 @@
         boolean wifiOut = wifiEnabled && mWifiSsid != null
                 && (mWifiActivity == WifiManager.DATA_ACTIVITY_INOUT
                 || mWifiActivity == WifiManager.DATA_ACTIVITY_OUT);
-        cb.onWifiSignalChanged(wifiEnabled, mQSWifiIconId, wifiIn, wifiOut,
+        cb.onWifiSignalChanged(mWifiEnabled, mQSWifiIconId, wifiIn, wifiOut,
                 mContentDescriptionWifi, wifiDesc);
 
         boolean mobileIn = mDataConnected && (mDataActivity == TelephonyManager.DATA_ACTIVITY_INOUT
