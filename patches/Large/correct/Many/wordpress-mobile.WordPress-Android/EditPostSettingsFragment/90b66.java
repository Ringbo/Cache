diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostSettingsFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
index f7d409f..6e46e10 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
@@ -174,7 +174,8 @@
                 new SiteSettingsListener() {
                     @Override
                     public void onSettingsUpdated(Exception error) {
-                        if (error == null) {
+                        // mEditPostActivityHook will be null if the fragment is detached
+                        if (error == null && mEditPostActivityHook != null) {
                             updatePostFormat(mSiteSettings.getDefaultPostFormat());
                         }
                     }
