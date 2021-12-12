diff --git a/android/src/fq/router/utils/Downloader.java b/android/src/fq/router/utils/Downloader.java
index 08f5aff..4751744 100644
--- a/android/src/fq/router/utils/Downloader.java
+++ b/android/src/fq/router/utils/Downloader.java
@@ -147,7 +147,7 @@
                 totalLength = getTotalLength(url, addresses);
                 LogUtils.i("total length of " + url + ": " + totalLength);
                 long from = 0;
-                long step = totalLength / 100;
+                long step = totalLength / 10;
                 while (from < totalLength) {
                     long to = Math.min(from + step, totalLength - 1);
                     addChunk(from, to, false);
