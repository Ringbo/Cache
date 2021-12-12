diff --git a/source/org/jivesoftware/smackx/muc/MultiUserChat.java b/source/org/jivesoftware/smackx/muc/MultiUserChat.java
index 37183a2..b71ed0b 100644
--- a/source/org/jivesoftware/smackx/muc/MultiUserChat.java
+++ b/source/org/jivesoftware/smackx/muc/MultiUserChat.java
@@ -2120,7 +2120,8 @@
                 // Get the MUC User extension
                 MUCUser mucUser = getMUCUserExtension(packet);
                 // Check if the MUCUser informs that the invitee has declined the invitation
-                if (mucUser.getDecline() != null) {
+                if (mucUser.getDecline() != null &&
+                        ((Message) packet).getType() != Message.Type.ERROR) {
                     // Fire event for invitation rejection listeners
                     fireInvitationRejectionListeners(
                         mucUser.getDecline().getFrom(),
