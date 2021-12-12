diff --git a/src/biz/bokhorst/xprivacy/UpdateService.java b/src/biz/bokhorst/xprivacy/UpdateService.java
index d0ac3c8..a1e67f0 100644
--- a/src/biz/bokhorst/xprivacy/UpdateService.java
+++ b/src/biz/bokhorst/xprivacy/UpdateService.java
@@ -202,7 +202,7 @@
 
 	private static List<ParcelableSetting> getRandomizeWork(Context context, int uid) {
 		List<ParcelableSetting> listWork = new ArrayList<ParcelableSetting>();
-		if (PrivacyManager.getSettingBool(null, uid, PrivacyManager.cSettingRandom, false, true)) {
+		if (PrivacyManager.getSettingBool(null, -uid, PrivacyManager.cSettingRandom, false, true)) {
 			listWork.add(new ParcelableSetting(uid, PrivacyManager.cSettingLatitude, PrivacyManager
 					.getRandomProp("LAT")));
 			listWork.add(new ParcelableSetting(uid, PrivacyManager.cSettingLongitude, PrivacyManager
