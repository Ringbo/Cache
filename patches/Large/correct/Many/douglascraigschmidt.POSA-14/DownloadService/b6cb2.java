diff --git a/ex/DownloadApplication/src/edu/vuum/mocca/DownloadService.java b/ex/DownloadApplication/src/edu/vuum/mocca/DownloadService.java
index d5e27ed..ff6a8e0 100644
--- a/ex/DownloadApplication/src/edu/vuum/mocca/DownloadService.java
+++ b/ex/DownloadApplication/src/edu/vuum/mocca/DownloadService.java
@@ -146,7 +146,7 @@
                                             intent.getData().toString());
 
             // Call factory method to create Message.
-            Message message = makeMessage(pathname);
+            Message message = makeReplyMessage(pathname);
         
             // Extract the Messenger.
             Messenger messenger = (Messenger)
