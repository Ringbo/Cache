diff --git a/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java b/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
index 6fe581e..0ba3f7c 100644
--- a/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
+++ b/packages/SettingsLib/src/com/android/settingslib/wifi/AccessPoint.java
@@ -848,7 +848,7 @@
         return false;
     }
 
-    boolean update(WifiConfiguration config, WifiInfo info, NetworkInfo networkInfo) {
+    public boolean update(WifiConfiguration config, WifiInfo info, NetworkInfo networkInfo) {
         boolean reorder = false;
         if (info != null && isInfoForThisAccessPoint(config, info)) {
             reorder = (mInfo == null);
