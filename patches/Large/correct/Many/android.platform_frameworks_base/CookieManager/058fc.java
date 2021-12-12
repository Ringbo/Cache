diff --git a/core/java/android/webkit/CookieManager.java b/core/java/android/webkit/CookieManager.java
index e1a7ba2..da99dd6 100644
--- a/core/java/android/webkit/CookieManager.java
+++ b/core/java/android/webkit/CookieManager.java
@@ -82,8 +82,7 @@
      * @param accept whether the {@link WebView} instance should accept
      *               third party cookies
      */
-    public synchronized void setAcceptThirdPartyCookies(WebView webview,
-            boolean accept) {
+    public void setAcceptThirdPartyCookies(WebView webview, boolean accept) {
         throw new MustOverrideException();
     }
 
