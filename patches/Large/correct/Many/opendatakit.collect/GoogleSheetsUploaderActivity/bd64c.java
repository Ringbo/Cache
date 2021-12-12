diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/GoogleSheetsUploaderActivity.java b/collect_app/src/main/java/org/odk/collect/android/activities/GoogleSheetsUploaderActivity.java
index 1fa9371..7c8e323 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/GoogleSheetsUploaderActivity.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/GoogleSheetsUploaderActivity.java
@@ -285,7 +285,7 @@
             }
 
             Cursor results = new InstancesDao().getInstancesCursor(selection.toString(), selectionArgs);
-            if (results.getCount() > 0) {
+            if (results != null && results.getCount() > 0) {
                 message = InstanceUploaderUtils.getUploadResultMessage(results, result);
             } else {
                 if (instanceGoogleSheetsUploaderTask.isAuthFailed()) {
