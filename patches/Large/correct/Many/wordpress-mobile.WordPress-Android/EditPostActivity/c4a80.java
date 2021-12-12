diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
index d2a7394..56798a9 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
@@ -650,7 +650,7 @@
 
     @Override protected void onStop() {
         super.onStop();
-        if (mAztecImageLoader != null) {
+        if (mAztecImageLoader != null && isFinishing()) {
             mAztecImageLoader.clearTargets();
             mAztecImageLoader = null;
         }
