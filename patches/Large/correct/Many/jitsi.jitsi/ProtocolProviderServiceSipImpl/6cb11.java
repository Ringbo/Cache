diff --git a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
index 478afdc..20a8dad 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
@@ -1696,8 +1696,8 @@
         if (proxyTransport != null && proxyTransport.length() > 0)
         {
             if (!proxyTransport.equals(ListeningPoint.UDP)
-                || !proxyTransport.equals(ListeningPoint.TCP)
-                || !proxyTransport.equals(ListeningPoint.TLS))
+                && !proxyTransport.equals(ListeningPoint.TCP)
+                && !proxyTransport.equals(ListeningPoint.TLS))
             {
                 throw new IllegalArgumentException(proxyTransport
                     + " is not a valid transport protocol. Transport must be "
