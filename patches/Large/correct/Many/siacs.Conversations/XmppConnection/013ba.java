diff --git a/src/eu/siacs/conversations/xmpp/XmppConnection.java b/src/eu/siacs/conversations/xmpp/XmppConnection.java
index e02c772..796920e 100644
--- a/src/eu/siacs/conversations/xmpp/XmppConnection.java
+++ b/src/eu/siacs/conversations/xmpp/XmppConnection.java
@@ -656,7 +656,7 @@
 				Element bind = packet.findChild("bind");
 				if (bind != null) {
 					Element jid = bind.findChild("jid");
-					if (jid != null) {
+					if (jid != null && jid.getContent() != null) {
 						account.setResource(jid.getContent().split("/",2)[1]);
 						if (streamFeatures.hasChild("sm", "urn:xmpp:sm:3")) {
 							smVersion = 3;
