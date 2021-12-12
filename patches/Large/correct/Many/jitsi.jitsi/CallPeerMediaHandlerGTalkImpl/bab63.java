diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerGTalkImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerGTalkImpl.java
index 1007f97..72af9c5 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerGTalkImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerGTalkImpl.java
@@ -517,12 +517,12 @@
                     //SDES
                     // It is important to set SDES before ZRTP in order to make
                     // GTALK application able to work with SDES.
-                    setSDesEncryptionToDescription(
+                    setSDesEncryptionOnDescription(
                             mediaType,
                             description,
                             null);
                     //ZRTP
-                    setZrtpEncryptionToDescription(
+                    setZrtpEncryptionOnDescription(
                             mediaType,
                             description,
                             null);
