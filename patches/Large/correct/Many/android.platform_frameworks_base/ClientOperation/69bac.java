diff --git a/obex/javax/obex/ClientOperation.java b/obex/javax/obex/ClientOperation.java
index 883c8c6..b65598c 100644
--- a/obex/javax/obex/ClientOperation.java
+++ b/obex/javax/obex/ClientOperation.java
@@ -207,7 +207,6 @@
      *         object
      */
     public synchronized int getResponseCode() throws IOException {
-        //avoid dup validateConnection
         if ((mReplyHeader.responseCode == -1)
                 || (mReplyHeader.responseCode == ResponseCodes.OBEX_HTTP_CONTINUE)) {
             validateConnection();
@@ -423,8 +422,9 @@
     private void validateConnection() throws IOException {
         ensureOpen();
 
-        // to sure only one privateInput object exist.
-        if (mPrivateInput == null) {
+        // Make sure that a response has been recieved from remote
+        // before continuing
+        if (mPrivateInput == null || mReplyHeader.responseCode == -1) {
             startProcessing();
         }
     }
