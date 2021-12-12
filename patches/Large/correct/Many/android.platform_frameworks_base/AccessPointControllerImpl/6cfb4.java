diff --git a/packages/SystemUI/src/com/android/systemui/statusbar/policy/AccessPointControllerImpl.java b/packages/SystemUI/src/com/android/systemui/statusbar/policy/AccessPointControllerImpl.java
index 479c982..dc6af6a 100644
--- a/packages/SystemUI/src/com/android/systemui/statusbar/policy/AccessPointControllerImpl.java
+++ b/packages/SystemUI/src/com/android/systemui/statusbar/policy/AccessPointControllerImpl.java
@@ -125,7 +125,7 @@
                 Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                 intent.putExtra(EXTRA_START_CONNECT_SSID, ap.ssid);
                 intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
-                mContext.startActivity(intent);
+                mContext.startActivityAsUser(intent, new UserHandle(mCurrentUser));
                 return true;
             } else {
                 WifiConfiguration config = new WifiConfiguration();
