diff --git a/app/src/main/java/de/robv/android/xposed/installer/InstallerFragment.java b/app/src/main/java/de/robv/android/xposed/installer/InstallerFragment.java
index aed1c6c..7853a06 100644
--- a/app/src/main/java/de/robv/android/xposed/installer/InstallerFragment.java
+++ b/app/src/main/java/de/robv/android/xposed/installer/InstallerFragment.java
@@ -895,7 +895,7 @@
 							architecture, sdk, version));
 				}
 
-				if (Build.VERSION.SDK_INT > 21) {
+				if (Build.VERSION.SDK_INT >= 21) {
 					for (int i = 0; i < uninstallerArray.length(); i++) {
 						JSONObject jsonObject = uninstallerArray
 								.getJSONObject(i);
