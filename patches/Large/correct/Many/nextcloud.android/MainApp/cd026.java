diff --git a/src/main/java/com/owncloud/android/MainApp.java b/src/main/java/com/owncloud/android/MainApp.java
index 2f9f6e9..4449208 100644
--- a/src/main/java/com/owncloud/android/MainApp.java
+++ b/src/main/java/com/owncloud/android/MainApp.java
@@ -488,7 +488,8 @@
 
     private static void updateToAutoUpload() {
             Context context = getAppContext();
-            if (PreferenceManager.instantPictureUploadEnabled(context)) {
+            if (PreferenceManager.instantPictureUploadEnabled(context) ||
+                    PreferenceManager.instantVideoUploadEnabled(context)){
 
                 // remove legacy shared preferences
                 SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
