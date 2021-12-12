diff --git a/src/biz/bokhorst/xprivacy/PrivacyProvider.java b/src/biz/bokhorst/xprivacy/PrivacyProvider.java
index 343a308..39395c1 100644
--- a/src/biz/bokhorst/xprivacy/PrivacyProvider.java
+++ b/src/biz/bokhorst/xprivacy/PrivacyProvider.java
@@ -532,11 +532,12 @@
 			// Process applications restrictions
 			PackageManager pm = context.getPackageManager();
 			for (ApplicationInfo appInfo : pm.getInstalledApplications(PackageManager.GET_META_DATA)) {
-				File prefFile = new File(getPrefFileName(PREF_RESTRICTION, +appInfo.uid));
+				File prefFile = new File(getPrefFileName(PREF_RESTRICTION, appInfo.uid));
 				if (prefFile.exists()) {
 					Util.log(null, Log.WARN, "Migrating " + prefFile);
 
-					SharedPreferences prefs = context.getSharedPreferences(PREF_SETTINGS, Context.MODE_WORLD_READABLE);
+					SharedPreferences prefs = context.getSharedPreferences(PREF_RESTRICTION + "." + appInfo.uid,
+							Context.MODE_WORLD_READABLE);
 
 					// Process restrictions
 					for (String restrictionName : PrivacyManager.getRestrictions())
