diff --git a/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandlerSipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandlerSipImpl.java
index 59fe3e0..c6c5a12 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandlerSipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/CallPeerMediaHandlerSipImpl.java
@@ -1691,7 +1691,7 @@
                             SrtpCryptoAttribute.create(a.getValue()));
                 }
             }
-            catch (SdpParseException e)
+            catch (Exception e)
             {
                 logger.error("received an unparsable sdp attribute", e);
             }
