diff --git a/android/src/com/google/zxing/client/android/share/LoadPackagesAsyncTask.java b/android/src/com/google/zxing/client/android/share/LoadPackagesAsyncTask.java
index db5d5d6..ee6b431 100644
--- a/android/src/com/google/zxing/client/android/share/LoadPackagesAsyncTask.java
+++ b/android/src/com/google/zxing/client/android/share/LoadPackagesAsyncTask.java
@@ -38,7 +38,7 @@
  *
  * @author Sean Owen
  */
-final class LoadPackagesAsyncTask extends AsyncTask<Void,Void,List<AppInfo>> {
+final class LoadPackagesAsyncTask extends AsyncTask<Object,Object,List<AppInfo>> {
 
   private static final String[] PKG_PREFIX_WHITELIST = {
       "com.google.android.apps.",
@@ -57,7 +57,7 @@
   }
 
   @Override
-  protected List<AppInfo> doInBackground(Void... objects) {
+  protected List<AppInfo> doInBackground(Object... objects) {
     List<AppInfo> labelsPackages = new ArrayList<>();
     PackageManager packageManager = activity.getPackageManager();
     Iterable<ApplicationInfo> appInfos = packageManager.getInstalledApplications(0);
