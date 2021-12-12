diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/WordPressMediaUtils.java b/WordPress/src/main/java/org/wordpress/android/ui/media/WordPressMediaUtils.java
index 634c2e8..2d26963 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/WordPressMediaUtils.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/WordPressMediaUtils.java
@@ -152,7 +152,7 @@
 
         // make sure the directory we plan to store the recording in exists
         File directory = new File(mediaCapturePath).getParentFile();
-        if (directory == null | (!directory.exists() && !directory.mkdirs())) {
+        if (directory == null || (!directory.exists() && !directory.mkdirs())) {
             try {
                 throw new IOException("Path to file could not be created: " + mediaCapturePath);
             } catch (IOException e) {
