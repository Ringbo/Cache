diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/policy/AccessPointControllerImpl.java b/packages/SystemUI/src/com/android/systemui/statusbar/policy/AccessPointControllerImpl.java
index 0eb7197..d1e4963 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/policy/AccessPointControllerImpl.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/policy/AccessPointControllerImpl.java
@@ -116,7 +116,7 @@
             // Unknown network, need to add it.
             if (ap.getSecurity() != AccessPoint.SECURITY_NONE) {
                 Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
-                intent.putExtra(EXTRA_START_CONNECT_SSID, ap.getSsid());
+                intent.putExtra(EXTRA_START_CONNECT_SSID, ap.getSsidStr());
                 intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                 fireSettingsIntentCallback(intent);
                 return true;
