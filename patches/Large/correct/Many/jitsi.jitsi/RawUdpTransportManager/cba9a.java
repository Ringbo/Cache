diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/RawUdpTransportManager.java b/src/net/java/sip/communicator/impl/protocol/jabber/RawUdpTransportManager.java
index 6326c00..7209e5d 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/RawUdpTransportManager.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/RawUdpTransportManager.java
@@ -325,7 +325,7 @@
                                             channel.getRTPPort()),
                                     new InetSocketAddress(
                                             channel.getHost(),
-                                            channel.getRTPPort()));
+                                            channel.getRTCPPort()));
                     }
 
                     break;
@@ -336,7 +336,7 @@
     }
 
     /**
-     * Gets the {@link net.java.sip.communicator.impl.protocol.jabber.extensions.colibri.ColibriConferenceIQ.Channel} which belongs to a content
+     * Gets the {@link ColibriConferenceIQ.Channel} which belongs to a content
      * associated with a specific <tt>MediaType</tt> and is to be either locally
      * or remotely used.
      * <p>
