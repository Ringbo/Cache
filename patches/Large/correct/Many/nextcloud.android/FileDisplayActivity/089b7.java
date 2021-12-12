diff --git a/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java b/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
index e71bf66..600a1d4 100644
--- a/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
+++ b/src/main/java/com/owncloud/android/ui/activity/FileDisplayActivity.java
@@ -289,7 +289,7 @@
     private void upgradeNotificationForInstantUpload() {
         // check for Android 6+ if legacy instant upload is activated --> disable + show info
         if (PreferenceManager.instantPictureUploadEnabled(this) ||
-                PreferenceManager.instantPictureUploadEnabled(this)) {
+                PreferenceManager.instantVideoUploadEnabled(this)) {
 
             // remove legacy shared preferences
             SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(this).edit();
