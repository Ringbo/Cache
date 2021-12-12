diff --git a/main/src/main/java/com/google/android/apps/muzei/sync/DownloadArtworkTask.java b/main/src/main/java/com/google/android/apps/muzei/sync/DownloadArtworkTask.java
index 31db5df..06d727d 100644
--- a/main/src/main/java/com/google/android/apps/muzei/sync/DownloadArtworkTask.java
+++ b/main/src/main/java/com/google/android/apps/muzei/sync/DownloadArtworkTask.java
@@ -122,7 +122,7 @@
         }
 
         InputStream in = null;
-        if ("content".equals(scheme)) {
+        if ("content".equals(scheme) || "android.resource".equals(scheme)) {
             try {
                 in = context.getContentResolver().openInputStream(uri);
             } catch (SecurityException e) {
