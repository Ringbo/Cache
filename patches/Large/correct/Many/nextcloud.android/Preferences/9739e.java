diff --git a/src/main/java/com/owncloud/android/ui/activity/Preferences.java b/src/main/java/com/owncloud/android/ui/activity/Preferences.java
index ae18d51..3e02713 100644
--- a/src/main/java/com/owncloud/android/ui/activity/Preferences.java
+++ b/src/main/java/com/owncloud/android/ui/activity/Preferences.java
@@ -512,7 +512,7 @@
             pAboutApp.setSummary(String.format(getString(R.string.about_version), appVersion));
         }
 
-        loadExternalSettingLinks(preferenceCategory);
+        loadExternalSettingLinks(preferenceCategoryMore);
 
         loadStoragePath();
     }
