diff --git a/src/org/odk/collect/android/tasks/DownloadFormsTask.java b/src/org/odk/collect/android/tasks/DownloadFormsTask.java
index 4e2f205..31da22c 100644
--- a/src/org/odk/collect/android/tasks/DownloadFormsTask.java
+++ b/src/org/odk/collect/android/tasks/DownloadFormsTask.java
@@ -268,9 +268,9 @@
             if (statusCode != 200) {
                 String errMsg =
                     Collect.getInstance()
-                            .getString(R.string.file_fetch_failed,
+                            .getString(R.string.file_fetch_failed,downloadUrl,
                                 response.getStatusLine().getReasonPhrase(), statusCode);
-                Log.e(t, errMsg + " " + downloadUrl);
+                Log.e(t, errMsg);
                 throw new Exception(errMsg);
             }
 
