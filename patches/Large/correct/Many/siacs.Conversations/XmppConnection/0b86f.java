diff --git a/src/eu/siacs/conversations/xmpp/XmppConnection.java b/src/eu/siacs/conversations/xmpp/XmppConnection.java
index e7b25e2..e02c772 100644
--- a/src/eu/siacs/conversations/xmpp/XmppConnection.java
+++ b/src/eu/siacs/conversations/xmpp/XmppConnection.java
@@ -657,7 +657,7 @@
 				if (bind != null) {
 					Element jid = bind.findChild("jid");
 					if (jid != null) {
-						account.setResource(jid.getContent().split("/")[1]);
+						account.setResource(jid.getContent().split("/",2)[1]);
 						if (streamFeatures.hasChild("sm", "urn:xmpp:sm:3")) {
 							smVersion = 3;
 							EnablePacket enable = new EnablePacket(smVersion);
