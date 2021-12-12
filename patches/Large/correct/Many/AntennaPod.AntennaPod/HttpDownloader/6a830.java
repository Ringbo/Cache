diff --git a/core/src/main/java/de/danoeh/antennapod/core/service/download/HttpDownloader.java b/core/src/main/java/de/danoeh/antennapod/core/service/download/HttpDownloader.java
index 61c9227..40b7de1 100644
--- a/core/src/main/java/de/danoeh/antennapod/core/service/download/HttpDownloader.java
+++ b/core/src/main/java/de/danoeh/antennapod/core/service/download/HttpDownloader.java
@@ -214,7 +214,7 @@
                                     request.getSize()
                     );
                     return;
-                } else if(request.getSoFar() == 0){
+                } else if(request.getSize() > 0 && request.getSoFar() == 0){
                     onFail(DownloadError.ERROR_IO_ERROR, "Download completed, but nothing was read");
                     return;
                 }
