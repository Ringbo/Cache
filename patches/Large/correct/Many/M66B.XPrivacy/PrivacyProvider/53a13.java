diff --git a/src/biz/bokhorst/xprivacy/PrivacyProvider.java b/src/biz/bokhorst/xprivacy/PrivacyProvider.java
index 459c3ce..af9f609 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyProvider.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyProvider.java
@@ -423,7 +423,7 @@
 		SharedPreferences.Editor editor = prefs.edit();
 		for (String pref : prefs.getAll().keySet()) {
 			String[] component = pref.split("\\.");
-			if (component.length >= 2 && component[1].equals(sUid)) {
+			if (component.length >= 3 && component[2].equals(sUid)) {
 				Util.log(null, Log.INFO, "Removed setting=" + pref + " uid=" + uid);
 				editor.remove(pref);
 				rows++;
