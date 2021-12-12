diff --git a/packages/SettingsLib/src/com/android/settingslib/bluetooth/HearingAidProfile.java b/packages/SettingsLib/src/com/android/settingslib/bluetooth/HearingAidProfile.java
index a0dfb5d..4c21e61 100644
--- a/packages/SettingsLib/src/com/android/settingslib/bluetooth/HearingAidProfile.java
+++ b/packages/SettingsLib/src/com/android/settingslib/bluetooth/HearingAidProfile.java
@@ -110,7 +110,7 @@
     }
 
     public boolean isConnectable() {
-        return true;
+        return false;
     }
 
     public boolean isAutoConnectable() {
