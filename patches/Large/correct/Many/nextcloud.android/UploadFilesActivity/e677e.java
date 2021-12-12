diff --git a/src/main/java/com/owncloud/android/ui/activity/UploadFilesActivity.java b/src/main/java/com/owncloud/android/ui/activity/UploadFilesActivity.java
index b3a17be..afb3261 100644
--- a/src/main/java/com/owncloud/android/ui/activity/UploadFilesActivity.java
+++ b/src/main/java/com/owncloud/android/ui/activity/UploadFilesActivity.java
@@ -165,7 +165,7 @@
 
         List<String> behaviours = new ArrayList<>();
         behaviours.add(getString(R.string.uploader_upload_files_behaviour_move_to_nextcloud_folder,
-                ThemeUtils.getDefaultDisplayNameForRootFolder()));
+                ThemeUtils.getDefaultDisplayNameForRootFolder(this)));
         behaviours.add(getString(R.string.uploader_upload_files_behaviour_only_upload));
         behaviours.add(getString(R.string.uploader_upload_files_behaviour_upload_and_delete_from_source));
 
