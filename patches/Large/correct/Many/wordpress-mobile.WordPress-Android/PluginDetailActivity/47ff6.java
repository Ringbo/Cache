diff --git a/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
index 13f2bc1..3f5a514 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
@@ -204,7 +204,7 @@
     }
 
     private void refreshUpdateVersionViews() {
-        boolean isUpdateAvailable = !isUpdateAvailable();
+        boolean isUpdateAvailable = isUpdateAvailable();
         if (isUpdateAvailable && !isUpdatingVersion) {
             mUpdateVersionTextView.setVisibility(View.VISIBLE);
         } else {
@@ -226,7 +226,7 @@
     }
 
     private void updatePluginVersion() {
-        if (NetworkUtils.checkConnection(this)) {
+        if (!NetworkUtils.checkConnection(this)) {
             return;
         }
         if (!isUpdateAvailable() || isUpdatingVersion) {
