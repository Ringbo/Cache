diff --git a/AndroidAsync/src/com/koushikdutta/async/http/AsyncSocketMiddleware.java b/AndroidAsync/src/com/koushikdutta/async/http/AsyncSocketMiddleware.java
index a38c60e..f21653a 100644
--- a/AndroidAsync/src/com/koushikdutta/async/http/AsyncSocketMiddleware.java
+++ b/AndroidAsync/src/com/koushikdutta/async/http/AsyncSocketMiddleware.java
@@ -30,7 +30,7 @@
     }
     
     public int getSchemePort(URI uri) {
-        if (!uri.getScheme().equals(scheme))
+        if (uri.getScheme() == null || !uri.getScheme().equals(scheme))
             return -1;
         if (uri.getPort() == -1) {
             return port;
