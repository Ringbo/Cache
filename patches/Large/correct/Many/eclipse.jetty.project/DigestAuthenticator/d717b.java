diff --git a/jetty-security/src/main/java/org/eclipse/jetty/security/authentication/DigestAuthenticator.java b/jetty-security/src/main/java/org/eclipse/jetty/security/authentication/DigestAuthenticator.java
index 51833fa..d762ebe 100644
--- a/jetty-security/src/main/java/org/eclipse/jetty/security/authentication/DigestAuthenticator.java
+++ b/jetty-security/src/main/java/org/eclipse/jetty/security/authentication/DigestAuthenticator.java
@@ -254,7 +254,7 @@
         Nonce nonce=_nonceQueue.peek();
         while (nonce!=null && nonce._ts<expired)
         {
-            _nonceQueue.remove();
+            _nonceQueue.remove(nonce);
             _nonceCount.remove(nonce._nonce);
             nonce=_nonceQueue.peek();
         }
