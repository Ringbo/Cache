diff --git a/app/src/main/java/de/robv/android/xposed/installer/installation/StatusInstallerFragment.java b/app/src/main/java/de/robv/android/xposed/installer/installation/StatusInstallerFragment.java
index 8678d76..079c2c7 100644
--- a/app/src/main/java/de/robv/android/xposed/installer/installation/StatusInstallerFragment.java
+++ b/app/src/main/java/de/robv/android/xposed/installer/installation/StatusInstallerFragment.java
@@ -252,12 +252,12 @@
         } else if (Build.VERSION.SDK_INT < 24 && !baseDir.equals(new File(appInfo.dataDir))) {
             Log.e(XposedApp.TAG, "Base directory: " + appInfo.dataDir);
             Log.e(XposedApp.TAG, "Expected: " + XposedApp.BASE_DIR);
-            issueName = getString(R.string.known_issue_wrong_base_directory);
+            issueName = getString(R.string.known_issue_wrong_base_directory, appInfo.dataDir);
             issueLink = "https://github.com/rovo89/XposedInstaller/issues/395";
         } else if (Build.VERSION.SDK_INT >= 24 && !baseDir.equals(new File(appInfo.deviceProtectedDataDir))) {
             Log.e(XposedApp.TAG, "Base directory: " + appInfo.deviceProtectedDataDir);
             Log.e(XposedApp.TAG, "Expected: " + XposedApp.BASE_DIR);
-            issueName = getString(R.string.known_issue_wrong_base_directory);
+            issueName = getString(R.string.known_issue_wrong_base_directory, appInfo.deviceProtectedDataDir);
             issueLink = "https://github.com/rovo89/XposedInstaller/issues/395";
         } else if (!baseDir.exists()) {
             issueName = getString(R.string.known_issue_missing_base_directory);
