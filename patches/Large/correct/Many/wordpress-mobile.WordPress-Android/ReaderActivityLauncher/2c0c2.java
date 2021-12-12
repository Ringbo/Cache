diff --git a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderActivityLauncher.java b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderActivityLauncher.java
index ac3f63b..5b81820 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderActivityLauncher.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/reader/ReaderActivityLauncher.java
@@ -238,7 +238,11 @@
         }
 
         if (openUrlType == OpenUrlType.INTERNAL) {
-            WPWebViewActivity.openUrlByUsingMainWPCOMCredentials(context, url);
+            // Open the URL by using the internal browser without authenticating to wpcom.
+            // See: https://github.com/wordpress-mobile/WordPress-Android/issues/1921
+            // If you pass a wpcom URL that needs authentication to be viewed, it will work since
+            // the reader authenticates to wpcom at startup by calling ReaderAuthActions.updateCookies
+            WPWebViewActivity.openURL(context, url);
         } else {
             try {
                 Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
