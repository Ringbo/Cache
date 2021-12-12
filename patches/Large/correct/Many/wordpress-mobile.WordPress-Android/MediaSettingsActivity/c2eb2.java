diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaSettingsActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaSettingsActivity.java
index e80beef..c120316 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaSettingsActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaSettingsActivity.java
@@ -483,7 +483,7 @@
     }
 
     private void showFullScreen() {
-        if (getSupportActionBar() != null) {
+        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && getSupportActionBar() != null) {
             getSupportActionBar().hide();
         }
 
