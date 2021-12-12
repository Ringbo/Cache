diff --git a/src/biz/bokhorst/xprivacy/ActivityApp.java b/src/biz/bokhorst/xprivacy/ActivityApp.java
index b167098..de2c3bc 100644
--- a/src/biz/bokhorst/xprivacy/ActivityApp.java
+++ b/src/biz/bokhorst/xprivacy/ActivityApp.java
@@ -337,10 +337,11 @@
 			public void onClick(DialogInterface dialog, int which) {
 				// Get toggle
 				boolean restricted = false;
-				List<String> listRestriction = PrivacyManager.getRestrictions(false);
+				List<String> listRestriction = PrivacyManager.getRestrictions(true);
 				for (String restrictionName : listRestriction)
 					if (PrivacyManager.getSettingBool(null, ActivityApp.this, 0,
-							String.format("Template.%s", restrictionName), true, false))
+							String.format("Template.%s", restrictionName),
+							!PrivacyManager.isDangerousRestriction(restrictionName), false))
 						if (PrivacyManager.getRestricted(null, ActivityApp.this, mAppInfo.getUid(), restrictionName,
 								null, false, false)) {
 							restricted = true;
@@ -351,7 +352,8 @@
 				restricted = !restricted;
 				for (String restrictionName : listRestriction)
 					if (PrivacyManager.getSettingBool(null, ActivityApp.this, 0,
-							String.format("Template.%s", restrictionName), true, false))
+							String.format("Template.%s", restrictionName),
+							!PrivacyManager.isDangerousRestriction(restrictionName), false))
 						PrivacyManager.setRestricted(null, ActivityApp.this, mAppInfo.getUid(), restrictionName, null,
 								restricted);
 
