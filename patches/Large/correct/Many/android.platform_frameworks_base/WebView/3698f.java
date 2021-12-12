diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index 4c38266..333c44c 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -1649,7 +1649,7 @@
      * will be called with false if any URLs are malformed. The callback will be run on the UI
      * thread.
      */
-    public static void setSafeBrowsingWhitelist(@Nullable List<String> urls,
+    public static void setSafeBrowsingWhitelist(@NonNull List<String> urls,
             @Nullable ValueCallback<Boolean> callback) {
         getFactory().getStatics().setSafeBrowsingWhitelist(urls, callback);
     }
