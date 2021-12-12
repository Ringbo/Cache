diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/address/MultipleRecipientManager.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/address/MultipleRecipientManager.java
index 2a2edf4..a5d1beb 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/address/MultipleRecipientManager.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/address/MultipleRecipientManager.java
@@ -164,7 +164,7 @@
             // Remove the sender from the TO/CC list (try with bare JID too)
             String from = connection.getUser();
             if (!to.remove(from) && !cc.remove(from)) {
-                String bareJID = XmppStringUtils.parseBareAddress(from);
+                String bareJID = XmppStringUtils.parseBareJid(from);
                 to.remove(bareJID);
                 cc.remove(bareJID);
             }
