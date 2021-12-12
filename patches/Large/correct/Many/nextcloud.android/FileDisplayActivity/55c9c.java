diff --git a/src/com/owncloud/android/ui/activity/FileDisplayActivity.java b/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
index 7e60776..ef9de9e 100644
--- a/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
+++ b/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
@@ -256,7 +256,7 @@
             setNavigationListWithFolder(file);
             
             if (!stateWasRecovered) {
-                Log_OC.e(TAG, "Initializing Fragments in onAccountChanged..");
+                Log_OC.d(TAG, "Initializing Fragments in onAccountChanged..");
                 initFragmentsWithFile();
                 if (file.isFolder()) {
                     startSyncFolderOperation(file, false);
@@ -555,19 +555,19 @@
     }
 
     private void startSynchronization() {
-        Log_OC.e(TAG, "Got to start sync");
+        Log_OC.d(TAG, "Got to start sync");
         if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.KITKAT) {
-            Log_OC.e(TAG, "Canceling all syncs for " + MainApp.getAuthority());
+            Log_OC.d(TAG, "Canceling all syncs for " + MainApp.getAuthority());
             ContentResolver.cancelSync(null, MainApp.getAuthority());   // cancel the current synchronizations of any ownCloud account
             Bundle bundle = new Bundle();
             bundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
             bundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true);
-            Log_OC.e(TAG, "Requesting sync for " + getAccount().name + " at " + MainApp.getAuthority());
+            Log_OC.d(TAG, "Requesting sync for " + getAccount().name + " at " + MainApp.getAuthority());
             ContentResolver.requestSync(
                     getAccount(),
                     MainApp.getAuthority(), bundle);
         } else {
-            Log_OC.e(TAG, "Requesting sync for " + getAccount().name + " at " + MainApp.getAuthority() + " with new API");
+            Log_OC.d(TAG, "Requesting sync for " + getAccount().name + " at " + MainApp.getAuthority() + " with new API");
             SyncRequest.Builder builder = new SyncRequest.Builder();
             builder.setSyncAdapter(getAccount(), MainApp.getAuthority());
             builder.setExpedited(true);
@@ -699,7 +699,7 @@
 
         } finally {
             if (filepath == null) {
-                Log_OC.e(TAG, "Couldnt resolve path to file");
+                Log_OC.e(TAG, "Couldn't resolve path to file");
                 Toast t = Toast.makeText(this, getString(R.string.filedisplay_unexpected_bad_get_content), Toast.LENGTH_LONG);
                 t.show();
                 return;
@@ -786,7 +786,7 @@
     @Override
     protected void onSaveInstanceState(Bundle outState) {
         // responsibility of restore is preferred in onCreate() before than in onRestoreInstanceState when there are Fragments involved
-        Log_OC.e(TAG, "onSaveInstanceState() start");
+        Log_OC.d(TAG, "onSaveInstanceState() start");
         super.onSaveInstanceState(outState);
         outState.putParcelable(FileDisplayActivity.KEY_WAITING_TO_PREVIEW, mWaitingToPreview);
         outState.putBoolean(FileDisplayActivity.KEY_SYNC_IN_PROGRESS, mSyncInProgress);
@@ -801,7 +801,7 @@
     @Override
     protected void onResume() {
         super.onResume();
-        Log_OC.e(TAG, "onResume() start");
+        Log_OC.d(TAG, "onResume() start");
         
         // refresh list of files
         refreshListOfFilesFragment();
@@ -833,7 +833,7 @@
 
     @Override
     protected void onPause() {
-        Log_OC.e(TAG, "onPause() start");
+        Log_OC.d(TAG, "onPause() start");
         if (mSyncBroadcastReceiver != null) {
             unregisterReceiver(mSyncBroadcastReceiver);
             //LocalBroadcastManager.getInstance(this).unregisterReceiver(mSyncBroadcastReceiver);
