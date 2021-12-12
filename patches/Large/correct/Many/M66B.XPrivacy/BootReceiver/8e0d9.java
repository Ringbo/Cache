diff --git a/src/biz/bokhorst/xprivacy/BootReceiver.java b/src/biz/bokhorst/xprivacy/BootReceiver.java
index cc4a253..e3cce59 100644
--- a/src/biz/bokhorst/xprivacy/BootReceiver.java
+++ b/src/biz/bokhorst/xprivacy/BootReceiver.java
@@ -47,7 +47,7 @@
 	}
 
 	private void randomizeSettings(Context context, int uid) {
-		boolean random = PrivacyManager.getSettingBool(null, context, uid, PrivacyManager.cSettingRandom, true, false);
+		boolean random = PrivacyManager.getSettingBool(null, context, uid, PrivacyManager.cSettingRandom, false, false);
 		if (random) {
 			PrivacyManager.setSetting(null, context, uid, PrivacyManager.cSettingLatitude,
 					PrivacyManager.getRandomProp("LAT"));
