diff --git a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
index 4cbe0c5..930de10 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
@@ -830,9 +830,9 @@
 
     @Override
     public void setTitle(@NonNull final String title) {
-        mToolbarTitle = title;
+        mToolbarTitle = title.isEmpty() ? getString(R.string.wordpress_as_site_title_when_no_title) : title;
         if (mToolbar != null) {
-            mToolbar.setTitle(title);
+            mToolbar.setTitle(mToolbarTitle);
         }
     }
 
