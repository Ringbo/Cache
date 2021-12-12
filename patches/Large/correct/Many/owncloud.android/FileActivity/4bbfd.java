diff --git a/src/com/owncloud/android/ui/activity/FileActivity.java b/src/com/owncloud/android/ui/activity/FileActivity.java
index ad5a700..9089a5b 100644
--- a/src/com/owncloud/android/ui/activity/FileActivity.java
+++ b/src/com/owncloud/android/ui/activity/FileActivity.java
@@ -560,14 +560,14 @@
      */
     public void showSnackMessage(String message) {
         final View rootView = findViewById(android.R.id.content);
-        if(rootView == null) {
+        if(rootView != null) {
             Snackbar.make(
                     rootView,
                     message,
                     Snackbar.LENGTH_LONG)
                     .show();
         } else {
-            // I root view is not available don't let the app brake. show the notification anyway.
+            // If root view is not available don't let the app brake. show the notification anyway.
             Toast.makeText(this, message, Snackbar.LENGTH_LONG).show();
         }
     }
