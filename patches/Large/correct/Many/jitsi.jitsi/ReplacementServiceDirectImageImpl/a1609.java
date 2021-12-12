diff --git a/src/net/java/sip/communicator/impl/replacement/directimage/ReplacementServiceDirectImageImpl.java b/src/net/java/sip/communicator/impl/replacement/directimage/ReplacementServiceDirectImageImpl.java
index d984a5f..5139d8c 100644
--- a/src/net/java/sip/communicator/impl/replacement/directimage/ReplacementServiceDirectImageImpl.java
+++ b/src/net/java/sip/communicator/impl/replacement/directimage/ReplacementServiceDirectImageImpl.java
@@ -139,9 +139,9 @@
      * @return the file size in bytes of the image link provided; -1 if the size
      * isn't available or exceeds the max allowed image size.
      */
-    public long getImageSize(String sourceString)
+    public int getImageSize(String sourceString)
     {
-        long length = -1;
+        int length = -1;
         try
         {
             
@@ -151,7 +151,7 @@
             {
                 HttpURLConnection connection =
                     (HttpURLConnection)url.openConnection();
-                length = connection.getContentLengthLong();
+                length = connection.getContentLength();
                 connection.disconnect();
             }
             else if (protocol.equals("ftp"))
