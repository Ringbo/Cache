diff --git a/src/main/java/eu/siacs/conversations/ui/ConferenceDetailsActivity.java b/src/main/java/eu/siacs/conversations/ui/ConferenceDetailsActivity.java
index c2617c7..294db3e 100644
--- a/src/main/java/eu/siacs/conversations/ui/ConferenceDetailsActivity.java
+++ b/src/main/java/eu/siacs/conversations/ui/ConferenceDetailsActivity.java
@@ -366,7 +366,7 @@
 			this.mSelectedUser = user;
 			String name;
 			final Contact contact = user.getContact();
-			if (contact != null) {
+			if (contact != null && contact.showInRoster()) {
 				name = contact.getDisplayName();
 			} else if (user.getRealJid() != null){
 				name = user.getRealJid().toBareJid().toString();
@@ -385,7 +385,7 @@
 				MenuItem banFromConference = menu.findItem(R.id.ban_from_conference);
 				MenuItem invite = menu.findItem(R.id.invite);
 				startConversation.setVisible(true);
-				if (contact != null) {
+				if (contact != null && contact.showInRoster()) {
 					showContactDetails.setVisible(!contact.isSelf());
 				}
 				if (user.getRole() == MucOptions.Role.NONE) {
