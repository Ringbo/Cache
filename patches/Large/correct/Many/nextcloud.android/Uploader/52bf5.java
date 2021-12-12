diff --git a/src/com/owncloud/android/ui/activity/Uploader.java b/src/com/owncloud/android/ui/activity/Uploader.java
index ebc5f37..cdbcb97 100644
--- a/src/com/owncloud/android/ui/activity/Uploader.java
+++ b/src/com/owncloud/android/ui/activity/Uploader.java
@@ -112,7 +112,7 @@
         super.onCreate(savedInstanceState);
         mParents = new Stack<String>();
 
-        ActionBar actionBar = getSherlock().getActionBar();
+        ActionBar actionBar = getSupportActionBar();
         actionBar.setIcon(DisplayUtils.getSeasonalIconId());
 
         if (prepareStreamsToUpload()) {
@@ -332,10 +332,10 @@
 
         String current_dir = mParents.peek();
         if(current_dir.equals("")){
-            getActionBar().setTitle(getString(R.string.default_display_name_for_root_folder));
+            getSupportActionBar().setTitle(getString(R.string.default_display_name_for_root_folder));
         }
         else{
-            getActionBar().setTitle(current_dir);
+            getSupportActionBar().setTitle(current_dir);
         }
 
         String full_path = generatePath(mParents);
