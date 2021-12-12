diff --git a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
index 3bab4e9..dd25eda 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
@@ -665,9 +665,10 @@
 
     @Override
     public void setTitle(final String title) {
-        mToolbarTitle = title;
+        mToolbarTitle = title.isEmpty() ? getString(R.string.wordpress_as_site_title) : title;
+
         if (mToolbar != null) {
-            mToolbar.setTitle(title);
+            mToolbar.setTitle(mToolbarTitle);
         }
     }
 
