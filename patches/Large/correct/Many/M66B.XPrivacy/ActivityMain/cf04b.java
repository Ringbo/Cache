diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 8281789..0a655ba 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -875,7 +875,7 @@
 		boolean fUser = PrivacyManager.getSettingBool(0, PrivacyManager.cSettingFUser, true, false);
 		boolean fSystem = PrivacyManager.getSettingBool(0, PrivacyManager.cSettingFSystem, false, false);
 
-		boolean ondemand = PrivacyManager.getSettingBool(0, PrivacyManager.cSettingOnDemand, false, false);
+		boolean ondemand = PrivacyManager.getSettingBool(0, PrivacyManager.cSettingOnDemand, true, false);
 
 		// Setup checkboxes
 		cbFUsed.setChecked(fUsed);
