diff --git a/app/src/main/java/de/robv/android/xposed/installer/LogsFragment.java b/app/src/main/java/de/robv/android/xposed/installer/LogsFragment.java
index bd6e750..eb14c6a 100644
--- a/app/src/main/java/de/robv/android/xposed/installer/LogsFragment.java
+++ b/app/src/main/java/de/robv/android/xposed/installer/LogsFragment.java
@@ -313,7 +313,7 @@
         @Override
         protected void onPostExecute(String llog) {
             mProgressDialog.dismiss();
-            mTxtLog.append(llog);
+            mTxtLog.setText(llog);
 
             if (llog.length() == 0)
                 mTxtLog.setText(R.string.log_is_empty);
