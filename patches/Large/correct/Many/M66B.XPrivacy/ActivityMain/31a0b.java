diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 604fdff..f8188b5 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -203,7 +203,7 @@
 		cbFPermission.setOnCheckedChangeListener(this);
 
 		// Setup user filter
-		boolean fUser = PrivacyManager.getSettingBool(null, ActivityMain.this, 0, PrivacyManager.cSettingFUser, false,
+		boolean fUser = PrivacyManager.getSettingBool(null, ActivityMain.this, 0, PrivacyManager.cSettingFUser, true,
 				false);
 		final CheckBox cbFUser = (CheckBox) findViewById(R.id.cbFUser);
 		cbFUser.setChecked(fUser);
@@ -211,7 +211,7 @@
 
 		// Setup system filter
 		boolean fSystem = PrivacyManager.getSettingBool(null, ActivityMain.this, 0, PrivacyManager.cSettingFSystem,
-				true, false);
+				false, false);
 		final CheckBox cbFSystem = (CheckBox) findViewById(R.id.cbFSystem);
 		cbFSystem.setChecked(fSystem);
 		cbFSystem.setOnCheckedChangeListener(this);
@@ -474,9 +474,9 @@
 			CheckBox cbFSystem = (CheckBox) findViewById(R.id.cbFSystem);
 			ProgressBar pbFilter = (ProgressBar) findViewById(R.id.pbFilter);
 			TextView tvStats = (TextView) findViewById(R.id.tvStats);
-			String filter = String.format("%s\n%b\n%b\n%b\n%b\n%b", etFilter.getText().toString(), cbUsed.isChecked(),
-					cbInternet.isChecked(), cbRestriction.isChecked(), cbFPermission.isChecked(), cbFUser.isChecked(),
-					cbFSystem.isChecked());
+			String filter = String.format("%s\n%b\n%b\n%b\n%b\n%b\n%b", etFilter.getText().toString(),
+					cbUsed.isChecked(), cbInternet.isChecked(), cbRestriction.isChecked(), cbFPermission.isChecked(),
+					cbFUser.isChecked(), cbFSystem.isChecked());
 			pbFilter.setVisibility(ProgressBar.VISIBLE);
 			tvStats.setVisibility(TextView.GONE);
 			mAppAdapter.getFilter().filter(filter);
@@ -920,12 +920,12 @@
 					// Get if user
 					boolean user = false;
 					if (fUser)
-						user = xAppInfo.getIsSystem();
+						user = !xAppInfo.getIsSystem();
 
 					// Get if system
 					boolean system = false;
 					if (fSystem)
-						system = !xAppInfo.getIsSystem();
+						system = xAppInfo.getIsSystem();
 
 					// Match application
 					if ((fName.equals("") ? true : contains) && (fUsed ? used : true) && (fInternet ? internet : true)
