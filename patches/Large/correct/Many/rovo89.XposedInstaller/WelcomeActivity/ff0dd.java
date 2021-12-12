diff --git a/app/src/main/java/de/robv/android/xposed/installer/WelcomeActivity.java b/app/src/main/java/de/robv/android/xposed/installer/WelcomeActivity.java
index a545e90..07a25a1 100644
--- a/app/src/main/java/de/robv/android/xposed/installer/WelcomeActivity.java
+++ b/app/src/main/java/de/robv/android/xposed/installer/WelcomeActivity.java
@@ -78,7 +78,8 @@
 
 		Bundle extras = getIntent().getExtras();
 		if (extras != null) {
-			int value = extras.getInt("fragment");
+			int value = extras.getInt("fragment",
+					prefs.getInt("default_view", 0));
 			switchFragment(value);
 		}
 
