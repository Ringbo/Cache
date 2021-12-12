diff --git a/WordPress/src/main/java/org/wordpress/android/ui/prefs/SiteSettingsInterface.java b/WordPress/src/main/java/org/wordpress/android/ui/prefs/SiteSettingsInterface.java
index f631c8c..91dfec3 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/prefs/SiteSettingsInterface.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/prefs/SiteSettingsInterface.java
@@ -1051,7 +1051,7 @@
                     mContext.getString(R.string.file_size_in_megabytes),
                     mContext.getString(R.string.file_size_in_gigabytes),
                     mContext.getString(R.string.file_size_in_terabytes) };
-            String spaceAllowed = FormatUtils.formatFileSize(mSite.getSpaceAvailable(), units);
+            String spaceAllowed = FormatUtils.formatFileSize(mSite.getSpaceAllowed(), units);
             String quotaAvailableSentence = String.format(mContext.getString(R.string.site_settings_quota_space_value),
                     percentage, spaceAllowed);
             setQuotaDiskSpace(quotaAvailableSentence);
