diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
index dc49e1e..b0d9295 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
@@ -614,7 +614,7 @@
         } else if (itemId == R.id.menu_post_settings) {
             InputMethodManager imm = ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE));
             imm.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
-            if (mShowNewEditor) {
+            if (mShowNewEditor || mShowAztecEditor) {
                 mEditPostSettingsFragment.updateFeaturedImage(mPost.getFeaturedImageId());
             }
             mViewPager.setCurrentItem(PAGE_SETTINGS);
@@ -1010,7 +1010,7 @@
 
         @Override
         public int getCount() {
-            return (mShowNewEditor ? NUM_PAGES_VISUAL_EDITOR : NUM_PAGES_LEGACY_EDITOR);
+            return ((mShowNewEditor || mShowAztecEditor) ? NUM_PAGES_VISUAL_EDITOR : NUM_PAGES_LEGACY_EDITOR);
         }
     }
 
