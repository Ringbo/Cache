diff --git a/core/java/android/webkit/CookieManager.java b/core/java/android/webkit/CookieManager.java
index 7c30d2a..de7d2d0 100644
--- a/core/java/android/webkit/CookieManager.java
+++ b/core/java/android/webkit/CookieManager.java
@@ -98,7 +98,7 @@
      * @param webview the {@link WebView} instance to get the cookie policy for
      * @return true if the {@link WebView} accepts third party cookies
      */
-    public synchronized boolean acceptThirdPartyCookies(WebView webview) {
+    public boolean acceptThirdPartyCookies(WebView webview) {
         throw new MustOverrideException();
     }
 
