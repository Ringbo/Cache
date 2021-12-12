diff --git a/src/java/org/jivesoftware/messenger/muc/spi/MUCUserImpl.java b/src/java/org/jivesoftware/messenger/muc/spi/MUCUserImpl.java
index 7a8ece7..d04e02c 100644
--- a/src/java/org/jivesoftware/messenger/muc/spi/MUCUserImpl.java
+++ b/src/java/org/jivesoftware/messenger/muc/spi/MUCUserImpl.java
@@ -447,7 +447,7 @@
                                     Element frag = presence.getChildElement("x",
                                             "http://jabber.org/protocol/muc#user");
                                     frag.element("item").addAttribute("nick", resource);
-                                    frag.element("status").addAttribute("code", "303");
+                                    frag.addElement("status").addAttribute("code", "303");
                                     role.getChatRoom().send(presence);
 
                                     // Send availability presence for the new nickname
