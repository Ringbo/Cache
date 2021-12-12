diff --git a/src/main/java/eu/siacs/conversations/xmpp/XmppConnection.java b/src/main/java/eu/siacs/conversations/xmpp/XmppConnection.java
index 3642448..772bfd3 100644
--- a/src/main/java/eu/siacs/conversations/xmpp/XmppConnection.java
+++ b/src/main/java/eu/siacs/conversations/xmpp/XmppConnection.java
@@ -544,7 +544,7 @@
 				Element failed = tagReader.readElement(nextTag);
 				try {
 					final int serverCount = Integer.parseInt(failed.getAttribute("h"));
-					Log.d(Config.LOGTAG, account.getJid().toBareJid() + ": resumption failed but server acknowledged stanza #"+h);
+					Log.d(Config.LOGTAG, account.getJid().toBareJid() + ": resumption failed but server acknowledged stanza #"+serverCount);
 					acknowledgeStanzaUpTo(serverCount);
 				} catch (NumberFormatException | NullPointerException e) {
 					Log.d(Config.LOGTAG, account.getJid().toBareJid() + ": resumption failed");
