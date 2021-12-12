diff --git a/handler/src/main/java/io/netty/handler/ssl/ReferenceCountedOpenSslEngine.java b/handler/src/main/java/io/netty/handler/ssl/ReferenceCountedOpenSslEngine.java
index f902e00..d964509 100644
--- a/handler/src/main/java/io/netty/handler/ssl/ReferenceCountedOpenSslEngine.java
+++ b/handler/src/main/java/io/netty/handler/ssl/ReferenceCountedOpenSslEngine.java
@@ -798,7 +798,7 @@
                             return newResult(BUFFER_OVERFLOW, status, bytesConsumed, bytesProduced);
                         } else {
                             // Everything else is considered as error
-                            throw shutdownWithError("SSL_write");
+                            throw shutdownWithError("SSL_write", sslError);
                         }
                     }
                 }
@@ -855,14 +855,14 @@
     /**
      * Log the error, shutdown the engine and throw an exception.
      */
-    private SSLException shutdownWithError(String operations) {
+    private SSLException shutdownWithError(String operations, int sslError) {
         String err = SSL.getLastError();
-        return shutdownWithError(operations, err);
+        return shutdownWithError(operations, sslError, err);
     }
 
-    private SSLException shutdownWithError(String operation, String err) {
+    private SSLException shutdownWithError(String operation, int sslError, String err) {
         if (logger.isDebugEnabled()) {
-            logger.debug("{} failed: OpenSSL error: {}", operation, err);
+            logger.debug("{} failed with {}: OpenSSL error: {}", operation, sslError, err);
         }
 
         // There was an internal error -- shutdown
@@ -1074,7 +1074,7 @@
                                     return newResultMayFinishHandshake(isInboundDone() ? CLOSED : OK, status,
                                                                        bytesConsumed, bytesProduced);
                                 } else {
-                                    return sslReadErrorResult(SSL.getLastErrorNumber(), bytesConsumed,
+                                    return sslReadErrorResult(sslError, SSL.getLastErrorNumber(), bytesConsumed,
                                                               bytesProduced);
                                 }
                             }
@@ -1103,7 +1103,8 @@
         }
     }
 
-    private SSLEngineResult sslReadErrorResult(int err, int bytesConsumed, int bytesProduced) throws SSLException {
+    private SSLEngineResult sslReadErrorResult(int error, int stackError, int bytesConsumed, int bytesProduced)
+            throws SSLException {
         // Check if we have a pending handshakeException and if so see if we need to consume all pending data from the
         // BIO first or can just shutdown and throw it now.
         // This is needed so we ensure close_notify etc is correctly send to the remote peer.
@@ -1112,14 +1113,14 @@
             if (handshakeException == null && handshakeState != HandshakeState.FINISHED) {
                 // we seems to have data left that needs to be transfered and so the user needs
                 // call wrap(...). Store the error so we can pick it up later.
-                handshakeException = new SSLHandshakeException(SSL.getErrorString(err));
+                handshakeException = new SSLHandshakeException(SSL.getErrorString(stackError));
             }
             // We need to clear all errors so we not pick up anything that was left on the stack on the next
             // operation. Note that shutdownWithError(...) will cleanup the stack as well so its only needed here.
             SSL.clearError();
             return new SSLEngineResult(OK, NEED_WRAP, bytesConsumed, bytesProduced);
         }
-        throw shutdownWithError("SSL_read", SSL.getErrorString(err));
+        throw shutdownWithError("SSL_read", error, SSL.getErrorString(stackError));
     }
 
     private void closeAll() throws SSLException {
@@ -1588,7 +1589,7 @@
                 return pendingStatus(SSL.bioLengthNonApplication(networkBIO));
             } else {
                 // Everything else is considered as error
-                throw shutdownWithError("SSL_do_handshake");
+                throw shutdownWithError("SSL_do_handshake", sslError);
             }
         }
         // if SSL_do_handshake returns > 0 or sslError == SSL.SSL_ERROR_NAME it means the handshake was finished.
