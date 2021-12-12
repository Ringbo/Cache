diff --git a/core/java/android/webkit/SslErrorHandler.java b/core/java/android/webkit/SslErrorHandler.java
index 426145a..3a43950 100644
--- a/core/java/android/webkit/SslErrorHandler.java
+++ b/core/java/android/webkit/SslErrorHandler.java
@@ -26,9 +26,9 @@
 public class SslErrorHandler extends Handler {
 
     /**
-     * Package-private constructor needed for API compatibility.
+     * @hide Only for use by WebViewProvider implementations.
      */
-    SslErrorHandler() {}
+    public SslErrorHandler() {}
 
     /**
      * Proceed with the SSL certificate.
