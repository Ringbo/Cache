diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
index cb6cc6e..5300780 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/EditPostActivity.java
@@ -1771,7 +1771,7 @@
                !NetworkUtils.isWiFiConnected(this)) {
             // Not on WiFi and optimize image is set to ON
             // Max picture size will be 3000px wide. That's the maximum resolution you can set in the current picker.
-            String optimizedPath = ImageUtils.createResizedImageWithMaxWidth(this, path, 3000);
+            String optimizedPath = ImageUtils.optimizeImage(this, path, 3000, 85);
 
             if (optimizedPath == null) {
                 AppLog.e(T.EDITOR, "Optimized picture was null!");
