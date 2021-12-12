diff --git a/src/eu/siacs/conversations/ui/ConferenceDetailsActivity.java b/src/eu/siacs/conversations/ui/ConferenceDetailsActivity.java
index 2cfa163..76c12a4 100644
--- a/src/eu/siacs/conversations/ui/ConferenceDetailsActivity.java
+++ b/src/eu/siacs/conversations/ui/ConferenceDetailsActivity.java
@@ -201,7 +201,7 @@
 	private void populateView() {
 		mYourPhoto.setImageBitmap(conversation.getAccount().getImage(this, 48));
 		setTitle(conversation.getName());
-		mFullJid.setText(conversation.getContactJid().split("/")[0]);
+		mFullJid.setText(conversation.getContactJid().split("/",2)[0]);
 		mYourNick.setText(conversation.getMucOptions().getActualNick());
 		mRoleAffiliaton = (TextView) findViewById(R.id.muc_role);
 		if (conversation.getMucOptions().online()) {
