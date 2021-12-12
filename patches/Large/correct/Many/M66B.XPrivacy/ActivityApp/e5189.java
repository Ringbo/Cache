diff --git a/src/biz/bokhorst/xprivacy/ActivityApp.java b/src/biz/bokhorst/xprivacy/ActivityApp.java
index d35353a..008143f 100644
--- a/src/biz/bokhorst/xprivacy/ActivityApp.java
+++ b/src/biz/bokhorst/xprivacy/ActivityApp.java
@@ -87,7 +87,7 @@
 			@Override
 			public void onClick(View v) {
 
-				Dialog dialog = new Dialog(ActivityApp.this, mThemeId);
+				Dialog dialog = new Dialog(ActivityApp.this);
 				dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
 				dialog.setTitle(getString(R.string.help_application));
 				dialog.setContentView(R.layout.help);
