diff --git a/source/org/jivesoftware/smackx/muc/MultiUserChat.java b/source/org/jivesoftware/smackx/muc/MultiUserChat.java
index b71ed0b..2bfbcbc 100644
--- a/source/org/jivesoftware/smackx/muc/MultiUserChat.java
+++ b/source/org/jivesoftware/smackx/muc/MultiUserChat.java
@@ -2554,7 +2554,8 @@
                     MUCUser mucUser = 
                         (MUCUser) packet.getExtension("x", "http://jabber.org/protocol/muc#user");
                     // Check if the MUCUser extension includes an invitation
-                    if (mucUser.getInvite() != null) {
+                    if (mucUser.getInvite() != null &&
+                            ((Message) packet).getType() != Message.Type.ERROR) {
                         // Fire event for invitation listeners
                         fireInvitationListeners(packet.getFrom(), mucUser.getInvite().getFrom(),
                                 mucUser.getInvite().getReason(), mucUser.getPassword(), (Message) packet);
