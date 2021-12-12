diff --git a/bundles/action/org.openhab.action.xmpp/src/main/java/org/openhab/action/xmpp/internal/XMPPConsole.java b/bundles/action/org.openhab.action.xmpp/src/main/java/org/openhab/action/xmpp/internal/XMPPConsole.java
index 8d0b680..c914c79 100644
--- a/bundles/action/org.openhab.action.xmpp/src/main/java/org/openhab/action/xmpp/internal/XMPPConsole.java
+++ b/bundles/action/org.openhab.action.xmpp/src/main/java/org/openhab/action/xmpp/internal/XMPPConsole.java
@@ -61,7 +61,7 @@
 
 	public void processMessage(Chat chat, Message msg) {
 		logger.debug("Received XMPP message: {} of type {}", msg.getBody(), msg.getType());
-		if (msg.getType() == Message.Type.error) {
+		if (msg.getType() == Message.Type.error || msg.getBody() == null) {
 			return;
 		}
 		String cmd = msg.getBody();
