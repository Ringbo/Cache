diff --git a/src/main/java/com/owncloud/android/MainApp.java b/src/main/java/com/owncloud/android/MainApp.java
index 70da701..4449208 100644
--- a/src/main/java/com/owncloud/android/MainApp.java
+++ b/src/main/java/com/owncloud/android/MainApp.java
@@ -489,7 +489,7 @@
     private static void updateToAutoUpload() {
             Context context = getAppContext();
             if (PreferenceManager.instantPictureUploadEnabled(context) ||
-                            PreferenceManager.instantPictureUploadEnabled(context)) {
+                    PreferenceManager.instantVideoUploadEnabled(context)){
 
                 // remove legacy shared preferences
                 SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
