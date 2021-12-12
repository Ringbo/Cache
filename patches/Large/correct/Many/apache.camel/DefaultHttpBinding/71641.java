diff --git a/components/camel-http/src/main/java/org/apache/camel/component/http/DefaultHttpBinding.java b/components/camel-http/src/main/java/org/apache/camel/component/http/DefaultHttpBinding.java
index 6a910be..feae40c 100644
--- a/components/camel-http/src/main/java/org/apache/camel/component/http/DefaultHttpBinding.java
+++ b/components/camel-http/src/main/java/org/apache/camel/component/http/DefaultHttpBinding.java
@@ -123,7 +123,7 @@
             }
         }
         
-        if (request.getMethod().equals("POST") && request.getContentType() != null && request.getContentType().equals("application/x-www-form-urlencoded")) {
+        if (request.getMethod().equals("POST") && request.getContentType() != null && request.getContentType().startsWith("application/x-www-form-urlencoded")) {
             String charset = request.getCharacterEncoding();
             if (charset == null) {
                 charset = "UTF-8";
