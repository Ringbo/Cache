diff --git a/Android/DevSample/small/src/main/java/net/wequick/small/ApkBundleLauncher.java b/Android/DevSample/small/src/main/java/net/wequick/small/ApkBundleLauncher.java
index 09a403a..19a8210 100644
--- a/Android/DevSample/small/src/main/java/net/wequick/small/ApkBundleLauncher.java
+++ b/Android/DevSample/small/src/main/java/net/wequick/small/ApkBundleLauncher.java
@@ -302,7 +302,7 @@
 
         File patch = bundle.getPatchFile();
         if (patch.exists()) {
-            PackageInfo patchInfo = pm.getPackageArchiveInfo(plugin.getPath(),
+            PackageInfo patchInfo = pm.getPackageArchiveInfo(patch.getPath(),
                     PackageManager.GET_ACTIVITIES);
             if (patchInfo.versionCode < pluginInfo.versionCode) {
                 Log.d(TAG, "Patch file should be later than built-in!");
