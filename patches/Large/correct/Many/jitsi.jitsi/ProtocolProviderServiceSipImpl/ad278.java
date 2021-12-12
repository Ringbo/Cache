diff --git a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
index 05b77a0..9e89c7a 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
@@ -1346,8 +1346,8 @@
 
             //if we are using tcp, make sure that we include the port of the
             //socket that we are actually using and not that of LP
-            if (ListeningPoint.TCP.equalsIgnoreCase(transport))
-                //|| ListeningPoint.TLS.equalsIgnoreCase(transport))
+            if (ListeningPoint.TCP.equalsIgnoreCase(transport)
+                || ListeningPoint.TLS.equalsIgnoreCase(transport))
             {
                 InetSocketAddress localSockAddr
                     = sipStackSharing.getLocalAddressForDestination(
