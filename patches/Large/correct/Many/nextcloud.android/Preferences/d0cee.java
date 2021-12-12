diff --git a/src/com/owncloud/android/ui/activity/Preferences.java b/src/com/owncloud/android/ui/activity/Preferences.java
index 148c1c9..7a29073 100644
--- a/src/com/owncloud/android/ui/activity/Preferences.java
+++ b/src/com/owncloud/android/ui/activity/Preferences.java
@@ -316,7 +316,7 @@
         
         mPrefInstantVideoUploadPathWiFi =  findPreference("instant_video_upload_on_wifi");
         mPrefInstantVideoUpload = findPreference("instant_video_uploading");
-        toggleInstantVideoOptions(((CheckBoxPreference) mPrefInstantUpload).isChecked());
+        toggleInstantVideoOptions(((CheckBoxPreference) mPrefInstantVideoUpload).isChecked());
         
         mPrefInstantVideoUpload.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {
             
