diff --git a/OsmAnd/src/net/osmand/plus/dashboard/DashChooseAppDirFragment.java b/OsmAnd/src/net/osmand/plus/dashboard/DashChooseAppDirFragment.java
index 8d5b0ff..f2e1dc7 100644
--- a/OsmAnd/src/net/osmand/plus/dashboard/DashChooseAppDirFragment.java
+++ b/OsmAnd/src/net/osmand/plus/dashboard/DashChooseAppDirFragment.java
@@ -70,7 +70,7 @@
 		private Dialog dlg;
 
 		private int typeTemp = -1;
-		private File selectedFileTemp;
+		private String selectePathTemp;
 
 		public ChooseAppDirFragment(Activity activity, Fragment f) {
 			this.activity = activity;
@@ -241,7 +241,7 @@
 										&& !DownloadActivity.hasPermissionToWriteExternalStorage(activity)) {
 
 									typeTemp = types.get(which);
-									selectedFileTemp = new File(paths.get(which));
+									selectePathTemp = paths.get(which);
 									dialog.dismiss();
 
 									ActivityCompat.requestPermissions(activity,
@@ -263,10 +263,10 @@
 		}
 
 		public void processPermissionGranted() {
-			if (typeTemp != -1 && selectedFileTemp != null) {
+			if (typeTemp != -1 && selectePathTemp != null) {
 				mapsCopied = false;
 				type = typeTemp;
-				selectedFile = selectedFileTemp;
+				selectedFile = new File(selectePathTemp);
 				updateView();
 			}
 		}
