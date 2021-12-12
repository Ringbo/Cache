diff --git a/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
index 3c9c6e0..b2cb77d 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/comments/CommentsListFragment.java
@@ -111,7 +111,7 @@
     @Override
     public void onDestroy() {
         mDispatcher.unregister(this);
-        super.onStop();
+        super.onDestroy();
     }
 
     private void updateSiteOrFinishActivity(Bundle savedInstanceState) {
