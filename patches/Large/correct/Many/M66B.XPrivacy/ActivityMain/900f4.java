diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index dc76da4..8a72b36 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -550,13 +550,14 @@
 
 	private void optionTemplate() {
 		// Get restriction categories
-		final List<String> listRestriction = PrivacyManager.getRestrictions(false);
+		final List<String> listRestriction = PrivacyManager.getRestrictions(true);
 		CharSequence[] options = new CharSequence[listRestriction.size()];
 		boolean[] selection = new boolean[listRestriction.size()];
 		for (int i = 0; i < listRestriction.size(); i++) {
 			options[i] = PrivacyManager.getLocalizedName(this, listRestriction.get(i));
 			selection[i] = PrivacyManager.getSettingBool(null, this, 0,
-					String.format("Template.%s", listRestriction.get(i)), true, false);
+					String.format("Template.%s", listRestriction.get(i)),
+					!PrivacyManager.isDangerousRestriction(listRestriction.get(i)), false);
 		}
 
 		// Build dialog
