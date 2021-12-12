diff --git a/sonar-home/src/main/java/org/sonar/home/cache/FileCache.java b/sonar-home/src/main/java/org/sonar/home/cache/FileCache.java
index 67fb154..a723cf1 100644
--- a/sonar-home/src/main/java/org/sonar/home/cache/FileCache.java
+++ b/sonar-home/src/main/java/org/sonar/home/cache/FileCache.java
@@ -91,7 +91,7 @@
     return targetFile;
   }
 
-  private void download(Downloader downloader, String filename, File tempFile) {
+  private static void download(Downloader downloader, String filename, File tempFile) {
     try {
       downloader.download(filename, tempFile);
     } catch (IOException e) {
