diff --git a/src/eu/siacs/conversations/parser/PresenceParser.java b/src/eu/siacs/conversations/parser/PresenceParser.java
index 05ffa67..e240a85 100644
--- a/src/eu/siacs/conversations/parser/PresenceParser.java
+++ b/src/eu/siacs/conversations/parser/PresenceParser.java
@@ -22,7 +22,7 @@
 		PgpEngine mPgpEngine = mXmppConnectionService.getPgpEngine();
 		if (packet.hasChild("x", "http://jabber.org/protocol/muc#user")) {
 			Conversation muc = mXmppConnectionService.find(account, packet
-					.getAttribute("from").split("/")[0]);
+					.getAttribute("from").split("/",2)[0]);
 			if (muc != null) {
 				boolean before = muc.getMucOptions().online();
 				muc.getMucOptions().processPacket(packet, mPgpEngine);
@@ -32,7 +32,7 @@
 			}
 		} else if (packet.hasChild("x", "http://jabber.org/protocol/muc")) {
 			Conversation muc = mXmppConnectionService.find(account, packet
-					.getAttribute("from").split("/")[0]);
+					.getAttribute("from").split("/",2)[0]);
 			if (muc != null) {
 				boolean before = muc.getMucOptions().online();
 				muc.getMucOptions().processPacket(packet, mPgpEngine);
