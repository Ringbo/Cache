diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 70b9e7f..66a20b7 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -196,7 +196,7 @@
 		ivHelp.setOnClickListener(new View.OnClickListener() {
 			@Override
 			public void onClick(View v) {
-				Dialog dialog = new Dialog(ActivityMain.this, mThemeId);
+				Dialog dialog = new Dialog(ActivityMain.this);
 				dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
 				dialog.setTitle(getString(R.string.help_application));
 				dialog.setContentView(R.layout.help);
@@ -412,7 +412,7 @@
 				&& Build.VERSION.SDK_INT != Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1
 				&& Build.VERSION.SDK_INT != Build.VERSION_CODES.JELLY_BEAN
 				&& Build.VERSION.SDK_INT != Build.VERSION_CODES.JELLY_BEAN_MR1) {
-			AlertDialog alertDialog = new AlertDialog.Builder(this, mThemeId).create();
+			AlertDialog alertDialog = new AlertDialog.Builder(this).create();
 			alertDialog.setTitle(getString(R.string.app_name));
 			alertDialog.setMessage(getString(R.string.app_wrongandroid));
 			alertDialog.setIcon(R.drawable.ic_launcher);
@@ -433,7 +433,7 @@
 			String msg = String.format(getString(R.string.app_notxposed), PrivacyManager.cXposedMinVersion);
 			Util.log(null, Log.WARN, msg);
 
-			AlertDialog alertDialog = new AlertDialog.Builder(this, mThemeId).create();
+			AlertDialog alertDialog = new AlertDialog.Builder(this).create();
 			alertDialog.setTitle(getString(R.string.app_name));
 			alertDialog.setMessage(msg);
 			alertDialog.setIcon(R.drawable.ic_launcher);
@@ -453,7 +453,7 @@
 			String msg = getString(R.string.app_notenabled);
 			Util.log(null, Log.WARN, msg);
 
-			AlertDialog alertDialog = new AlertDialog.Builder(this, mThemeId).create();
+			AlertDialog alertDialog = new AlertDialog.Builder(this).create();
 			alertDialog.setTitle(getString(R.string.app_name));
 			alertDialog.setMessage(msg);
 			alertDialog.setIcon(R.drawable.ic_launcher);
@@ -595,7 +595,7 @@
 
 	private void optionSettings() {
 		// Build dialog
-		final Dialog dlgSettings = new Dialog(this, mThemeId);
+		final Dialog dlgSettings = new Dialog(this);
 		dlgSettings.requestWindowFeature(Window.FEATURE_LEFT_ICON);
 		dlgSettings.setTitle(getString(R.string.app_name));
 		dlgSettings.setContentView(R.layout.settings);
@@ -794,7 +794,7 @@
 
 	private void optionAbout() {
 		// About
-		Dialog dlgAbout = new Dialog(this, mThemeId);
+		Dialog dlgAbout = new Dialog(this);
 		dlgAbout.requestWindowFeature(Window.FEATURE_LEFT_ICON);
 		dlgAbout.setTitle(getString(R.string.app_name));
 		dlgAbout.setContentView(R.layout.about);
@@ -924,7 +924,7 @@
 		String msg = String.format("Incompatible %s", clazz.getName());
 		Util.log(null, Log.WARN, msg);
 
-		AlertDialog alertDialog = new AlertDialog.Builder(this, mThemeId).create();
+		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
 		alertDialog.setTitle(getString(R.string.app_name));
 		alertDialog.setMessage(msg);
 		alertDialog.setIcon(R.drawable.ic_launcher);
@@ -1277,7 +1277,7 @@
 
 			// Show progress dialog
 			ListView lvApp = (ListView) findViewById(R.id.lvApp);
-			mProgressDialog = new ProgressDialog(lvApp.getContext(), mThemeId);
+			mProgressDialog = new ProgressDialog(lvApp.getContext());
 			mProgressDialog.setMessage(getString(R.string.msg_loading));
 			mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
 			mProgressDialog.setCancelable(false);
