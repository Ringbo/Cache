diff --git a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
index 391db47..9d1e3f7 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
@@ -1549,8 +1549,8 @@
         if(registrarTransport != null && registrarTransport.length() > 0)
         {
             if( ! registrarTransport.equals(ListeningPoint.UDP)
-                || !registrarTransport.equals(ListeningPoint.TCP)
-                || !registrarTransport.equals(ListeningPoint.TLS))
+                && !registrarTransport.equals(ListeningPoint.TCP)
+                && !registrarTransport.equals(ListeningPoint.TLS))
             {
                 throw new IllegalArgumentException(registrarTransport
                     + " is not a valid transport protocol. Transport must be "
