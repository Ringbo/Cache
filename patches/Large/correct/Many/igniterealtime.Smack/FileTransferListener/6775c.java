diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/filetransfer/FileTransferListener.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/filetransfer/FileTransferListener.java
index cb1852a..49893c1 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/filetransfer/FileTransferListener.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/filetransfer/FileTransferListener.java
@@ -24,10 +24,10 @@
  */
 public interface FileTransferListener {
     /**
-     * A request to send a file has been recieved from another user.
+     * A request to send a file has been received from another user.
      * 
      * @param request
      *            The request from the other user.
      */
-    public void fileTransferRequest(final FileTransferRequest request);
+    void fileTransferRequest(final FileTransferRequest request);
 }
