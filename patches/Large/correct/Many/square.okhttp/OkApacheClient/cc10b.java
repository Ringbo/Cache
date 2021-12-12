diff --git a/okhttp-apache/src/main/java/com/squareup/okhttp/apache/OkApacheClient.java b/okhttp-apache/src/main/java/com/squareup/okhttp/apache/OkApacheClient.java
index 602a2c8..d307a33 100644
--- a/okhttp-apache/src/main/java/com/squareup/okhttp/apache/OkApacheClient.java
+++ b/okhttp-apache/src/main/java/com/squareup/okhttp/apache/OkApacheClient.java
@@ -49,7 +49,7 @@
     String contentType = null;
     for (Header header : request.getAllHeaders()) {
       String name = header.getName();
-      if ("Content-Type".equals(name)) {
+      if ("Content-Type".equalsIgnoreCase(name)) {
         contentType = header.getValue();
       } else {
         builder.header(name, header.getValue());
