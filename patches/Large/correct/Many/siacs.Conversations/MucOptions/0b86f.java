diff --git a/src/eu/siacs/conversations/entities/MucOptions.java b/src/eu/siacs/conversations/entities/MucOptions.java
index e9ab690..676fb4f 100644
--- a/src/eu/siacs/conversations/entities/MucOptions.java
+++ b/src/eu/siacs/conversations/entities/MucOptions.java
@@ -134,7 +134,7 @@
 	}
 
 	public void processPacket(PresencePacket packet, PgpEngine pgp) {
-		String[] fromParts = packet.getFrom().split("/");
+		String[] fromParts = packet.getFrom().split("/",2);
 		if (fromParts.length >= 2) {
 			String name = fromParts[1];
 			String type = packet.getAttribute("type");
@@ -180,7 +180,7 @@
 					}
 				}
 			} else if (type.equals("unavailable")) {
-				deleteUser(packet.getAttribute("from").split("/")[1]);
+				deleteUser(packet.getAttribute("from").split("/",2)[1]);
 			} else if (type.equals("error")) {
 				Element error = packet.findChild("error");
 				if (error.hasChild("conflict")) {
@@ -209,7 +209,7 @@
 	}
 
 	public String getProposedNick() {
-		String[] mucParts = conversation.getContactJid().split("/");
+		String[] mucParts = conversation.getContactJid().split("/",2);
 		if (conversation.getBookmark() != null
 				&& conversation.getBookmark().getNick() != null) {
 			return conversation.getBookmark().getNick();
@@ -309,7 +309,7 @@
 	}
 
 	public String getJoinJid() {
-		return this.conversation.getContactJid().split("/")[0] + "/"
+		return this.conversation.getContactJid().split("/",2)[0] + "/"
 				+ this.joinnick;
 	}
 
