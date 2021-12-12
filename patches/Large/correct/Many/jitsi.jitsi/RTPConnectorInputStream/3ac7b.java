diff --git a/src/net/java/sip/communicator/impl/neomedia/RTPConnectorInputStream.java b/src/net/java/sip/communicator/impl/neomedia/RTPConnectorInputStream.java
index a2a13e3..7a5d6cb 100755
--- a/src/net/java/sip/communicator/impl/neomedia/RTPConnectorInputStream.java
+++ b/src/net/java/sip/communicator/impl/neomedia/RTPConnectorInputStream.java
@@ -271,7 +271,8 @@
 
             if(RTPConnectorOutputStream.logPacket(numberOfPackets)
                 && NeomediaActivator.getPacketLogging().isLoggingEnabled(
-                    PacketLoggingService.ProtocolName.RTP))
+                    PacketLoggingService.ProtocolName.RTP) &&
+                socket.getLocalAddress() != null)
             {
                 NeomediaActivator.getPacketLogging()
                     .logPacket(
