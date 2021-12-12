diff --git a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaPreviewActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaPreviewActivity.java
index c9fe53a..870ae8a 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/media/MediaPreviewActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/media/MediaPreviewActivity.java
@@ -139,7 +139,7 @@
     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         if (item.getItemId() == android.R.id.home) {
-            onBackPressed();
+            finish();
             return true;
         }
         return super.onOptionsItemSelected(item);
