diff --git a/core/java/android/webkit/HttpAuthHandler.java b/core/java/android/webkit/HttpAuthHandler.java
index b3571aa..296d960 100644
--- a/core/java/android/webkit/HttpAuthHandler.java
+++ b/core/java/android/webkit/HttpAuthHandler.java
@@ -28,9 +28,9 @@
 public class HttpAuthHandler extends Handler {
 
     /**
-     * Package-private constructor needed for API compatibility.
+     * @hide Only for use by WebViewProvider implementations.
      */
-    HttpAuthHandler() {
+    public HttpAuthHandler() {
     }
 
     /**
