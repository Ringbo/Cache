diff --git a/src/main/java/eu/siacs/conversations/xmpp/stanzas/MessagePacket.java b/src/main/java/eu/siacs/conversations/xmpp/stanzas/MessagePacket.java
index 4e7b532..61465ae 100644
--- a/src/main/java/eu/siacs/conversations/xmpp/stanzas/MessagePacket.java
+++ b/src/main/java/eu/siacs/conversations/xmpp/stanzas/MessagePacket.java
@@ -26,7 +26,7 @@
 		this.children.remove(findChild("body"));
 		Element body = new Element("body");
 		body.setContent(text);
-		this.children.add(body);
+		this.children.add(0, body);
 	}
 
 	public void setType(int type) {
