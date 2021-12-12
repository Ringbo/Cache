diff --git a/src/java/org/jivesoftware/messenger/muc/spi/IQAdminHandler.java b/src/java/org/jivesoftware/messenger/muc/spi/IQAdminHandler.java
index c4f64ca..2c84f13 100644
--- a/src/java/org/jivesoftware/messenger/muc/spi/IQAdminHandler.java
+++ b/src/java/org/jivesoftware/messenger/muc/spi/IQAdminHandler.java
@@ -168,7 +168,7 @@
                     for (MUCRole role : room.getModerators()) {
                         metaData = result.addElement("item", "http://jabber.org/protocol/muc#admin");
                         metaData.addAttribute("role", "moderator");
-                        metaData.addAttribute("jid", role.getChatUser().getAddress().toBareJID());
+                        metaData.addAttribute("jid", role.getChatUser().getAddress().toString());
                         metaData.addAttribute("nick", role.getNickname());
                         metaData.addAttribute("affiliation", role.getAffiliationAsString());
                     }
@@ -181,7 +181,7 @@
                     for (MUCRole role : room.getParticipants()) {
                         metaData = result.addElement("item", "http://jabber.org/protocol/muc#admin");
                         metaData.addAttribute("role", "participant");
-                        metaData.addAttribute("jid", role.getChatUser().getAddress().toBareJID());
+                        metaData.addAttribute("jid", role.getChatUser().getAddress().toString());
                         metaData.addAttribute("nick", role.getNickname());
                         metaData.addAttribute("affiliation", role.getAffiliationAsString());
                     }
