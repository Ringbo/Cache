diff --git a/src/com/owncloud/android/ui/activity/Uploader.java b/src/com/owncloud/android/ui/activity/Uploader.java
index 8ff505b..7f8ac9d 100644
--- a/src/com/owncloud/android/ui/activity/Uploader.java
+++ b/src/com/owncloud/android/ui/activity/Uploader.java
@@ -201,7 +201,7 @@
         final AlertDialog.Builder builder = new Builder(this);
         switch (id) {
         case DIALOG_WAITING:
-            ProgressDialog pDialog = new ProgressDialog(this);
+            ProgressDialog pDialog = new ProgressDialog(this, R.style.ProgressDialogTheme);
             pDialog.setIndeterminate(false);
             pDialog.setCancelable(false);
             pDialog.setMessage(getResources().getString(R.string.uploader_info_uploading));
