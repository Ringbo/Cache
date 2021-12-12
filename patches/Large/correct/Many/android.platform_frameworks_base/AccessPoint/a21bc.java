diff --git a/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java b/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
index 5a178a5..eb513e1 100644
--- a/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
+++ b/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
@@ -998,7 +998,8 @@
             if (mRssi != info.getRssi()) {
                 mRssi = info.getRssi();
                 updated = true;
-            } else if (mNetworkInfo.getDetailedState() != networkInfo.getDetailedState()) {
+            } else if (mNetworkInfo != null && networkInfo != null
+                    && mNetworkInfo.getDetailedState() != networkInfo.getDetailedState()) {
                 updated = true;
             }
             mInfo = info;
