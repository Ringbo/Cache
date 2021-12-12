diff --git a/AndroidAsync/src/com/koushikdutta/async/http/body/MultipartFormDataBody.java b/AndroidAsync/src/com/koushikdutta/async/http/body/MultipartFormDataBody.java
index 0a8a26d..34ea06d 100644
--- a/AndroidAsync/src/com/koushikdutta/async/http/body/MultipartFormDataBody.java
+++ b/AndroidAsync/src/com/koushikdutta/async/http/body/MultipartFormDataBody.java
@@ -184,7 +184,7 @@
         if (getBoundary() == null) {
             setBoundary("----------------------------" + UUID.randomUUID().toString().replace("-", ""));
         }
-        return CONTENT_TYPE + "; boundary=" + getBoundary();
+        return contentType + "; boundary=" + getBoundary();
     }
 
     @Override
