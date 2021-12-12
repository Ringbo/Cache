diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 64cd6bf..df84ac6 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -505,7 +505,7 @@
 		else if (buttonView == cbPermission) {
 			PrivacyManager.setSetting(null, ActivityMain.this, PrivacyManager.cSettingFPermission,
 					Boolean.toString(isChecked));
-			applyFilter();
+			selectRestriction(spRestriction.getSelectedItemPosition());
 		}
 	}
 
