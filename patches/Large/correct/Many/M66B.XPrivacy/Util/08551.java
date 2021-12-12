diff --git a/src/biz/bokhorst/xprivacy/Util.java b/src/biz/bokhorst/xprivacy/Util.java
index 3e9f55f..f7b998a 100644
--- a/src/biz/bokhorst/xprivacy/Util.java
+++ b/src/biz/bokhorst/xprivacy/Util.java
@@ -396,7 +396,7 @@
 	public static boolean cannotRestrict(int uid, int xuid, String restrictionName, String methodName) {
 		int _uid = getAppId(uid);
 		if (_uid == Process.SYSTEM_UID && PrivacyManager.cIdentification.equals(restrictionName))
-			return false;
+			return true;
 		// @formatter:off
 		return
 			(_uid == getAppId(xuid)) &&
