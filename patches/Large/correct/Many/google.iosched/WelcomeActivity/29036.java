diff --git a/android/src/main/java/com/google/samples/apps/iosched/welcome/WelcomeActivity.java b/android/src/main/java/com/google/samples/apps/iosched/welcome/WelcomeActivity.java
index 7e5ab3a..6d3c961 100644
--- a/android/src/main/java/com/google/samples/apps/iosched/welcome/WelcomeActivity.java
+++ b/android/src/main/java/com/google/samples/apps/iosched/welcome/WelcomeActivity.java
@@ -86,7 +86,8 @@
         super.onResume();
 
         // Show the debug warning if debug tools are enabled and it hasn't been shown yet.
-        if (BuildConfig.ENABLE_DEBUG_TOOLS && !SettingsUtils.wasDebugWarningShown(this)) {
+        if (!BuildConfig.SUPPRESS_DOGFOOD_WARNING &&
+                BuildConfig.ENABLE_DEBUG_TOOLS && !SettingsUtils.wasDebugWarningShown(this)) {
             displayDogfoodWarningDialog();
         }
     }
