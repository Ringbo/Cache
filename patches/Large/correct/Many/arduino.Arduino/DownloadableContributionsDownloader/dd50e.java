diff --git a/arduino-core/src/cc/arduino/contributions/packages/DownloadableContributionsDownloader.java b/arduino-core/src/cc/arduino/contributions/packages/DownloadableContributionsDownloader.java
index 1a96325..a3ac4d9 100644
--- a/arduino-core/src/cc/arduino/contributions/packages/DownloadableContributionsDownloader.java
+++ b/arduino-core/src/cc/arduino/contributions/packages/DownloadableContributionsDownloader.java
@@ -67,7 +67,7 @@
     onProgress(progress);
     String checksum = contribution.getChecksum();
     String algo = checksum.split(":")[0];
-    if (!FileHash.hash(outputFile, algo).equals(checksum)) {
+    if (!FileHash.hash(outputFile, algo).equalsIgnoreCase(checksum)) {
       throw new Exception(_("CRC doesn't match. File is corrupted."));
     }
 
