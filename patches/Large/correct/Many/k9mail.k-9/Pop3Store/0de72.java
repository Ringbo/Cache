diff --git a/src/com/fsck/k9/mail/store/Pop3Store.java b/src/com/fsck/k9/mail/store/Pop3Store.java
index 80711a4..ab21330 100644
--- a/src/com/fsck/k9/mail/store/Pop3Store.java
+++ b/src/com/fsck/k9/mail/store/Pop3Store.java
@@ -354,7 +354,7 @@
                     mCapabilities = getCapabilities();
 
                     if (mCapabilities.stls) {
-                        writeLine(STLS_COMMAND);
+                        executeSimpleCommand(STLS_COMMAND);
 
                         SSLContext sslContext = SSLContext.getInstance("TLS");
                         boolean secure = mConnectionSecurity == CONNECTION_SECURITY_TLS_REQUIRED;
