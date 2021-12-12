diff --git a/handler/src/main/java/io/netty/handler/ssl/ReferenceCountedOpenSslEngine.java b/handler/src/main/java/io/netty/handler/ssl/ReferenceCountedOpenSslEngine.java
index 221900c..709214c 100644
--- a/handler/src/main/java/io/netty/handler/ssl/ReferenceCountedOpenSslEngine.java
+++ b/handler/src/main/java/io/netty/handler/ssl/ReferenceCountedOpenSslEngine.java
@@ -1115,7 +1115,10 @@
     }
 
     private void rejectRemoteInitiatedRenegotiation() throws SSLHandshakeException {
-        if (rejectRemoteInitiatedRenegotiation && SSL.getHandshakeCount(ssl) > 1) {
+        // As rejectRemoteInitiatedRenegotiation() is called in a finally block we also need to check if we shutdown
+        // the engine before as otherwise SSL.getHandshakeCount(ssl) will throw an NPE if the passed in ssl is 0.
+        // See https://github.com/netty/netty/issues/7353
+        if (rejectRemoteInitiatedRenegotiation && !isDestroyed() && SSL.getHandshakeCount(ssl) > 1) {
             // TODO: In future versions me may also want to send a fatal_alert to the client and so notify it
             // that the renegotiation failed.
             shutdown();
