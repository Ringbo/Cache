diff --git a/smack-tcp/src/main/java/org/jivesoftware/smack/tcp/XMPPTCPConnection.java b/smack-tcp/src/main/java/org/jivesoftware/smack/tcp/XMPPTCPConnection.java
index 3e71b3c..10e4cca 100644
--- a/smack-tcp/src/main/java/org/jivesoftware/smack/tcp/XMPPTCPConnection.java
+++ b/smack-tcp/src/main/java/org/jivesoftware/smack/tcp/XMPPTCPConnection.java
@@ -1688,7 +1688,7 @@
                             }
                         }
                         String id = ackedStanza.getPacketID();
-                        if (StringUtils.isNotEmpty(id)) {
+                        if (StringUtils.isNullOrEmpty(id)) {
                             return;
                         }
                         PacketListener listener = stanzaIdAcknowledgedListeners.remove(id);
