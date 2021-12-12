diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerJabberImpl.java
index 29b04bf..0bbc9f8 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerJabberImpl.java
@@ -615,9 +615,11 @@
             for(PayloadTypePacketExtension payload
                     : theirDescription.getPayloadTypes())
             {
-                format = JingleUtils.payloadTypeToMediaFormat(
+                MediaFormat remoteFormat = JingleUtils.payloadTypeToMediaFormat(
                             payload, getDynamicPayloadTypes());
-                if(format != null && localFormats.contains(format))
+                if(remoteFormat != null
+                     && (format = findMediaFormat(localFormats, remoteFormat))
+                            != null)
                     break;
             }
 
@@ -2296,8 +2298,6 @@
      * initiator of the call; <tt>false</tt>, otherwise.
      * @param remoteTransport the TRANSPORT element
      * @param mediaType The type of media (AUDIO or VIDEO).
-     * @param <tt>true</tt> if DTLS-SRTP has been selected by the local peer as
-     * the secure transport; otherwise, <tt>false</tt>
      */
     boolean addDtlsAdvertisedEncryptions(
             boolean isInitiator,
