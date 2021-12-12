diff --git a/client/src/main/java/org/asynchttpclient/request/body/multipart/FileLikePart.java b/client/src/main/java/org/asynchttpclient/request/body/multipart/FileLikePart.java
index 069e818..ea731a0 100644
--- a/client/src/main/java/org/asynchttpclient/request/body/multipart/FileLikePart.java
+++ b/client/src/main/java/org/asynchttpclient/request/body/multipart/FileLikePart.java
@@ -48,7 +48,7 @@
                 transfertEncoding == null ? DEFAULT_TRANSFER_ENCODING : transfertEncoding);
     }
 
-    public void setFileName(String fileName) {
+    public final void setFileName(String fileName) {
         this.fileName = fileName;
     }
 
