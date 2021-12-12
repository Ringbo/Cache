diff --git a/xutils/src/main/java/org/xutils/http/request/HttpRequest.java b/xutils/src/main/java/org/xutils/http/request/HttpRequest.java
index f86df61..fe5320a 100644
--- a/xutils/src/main/java/org/xutils/http/request/HttpRequest.java
+++ b/xutils/src/main/java/org/xutils/http/request/HttpRequest.java
@@ -188,7 +188,7 @@
         if (code >= 300) {
             HttpException httpException = new HttpException(code, this.getResponseMessage());
             try {
-                httpException.setResult(IOUtil.readStr(connection.getInputStream(), params.getCharset()));
+                httpException.setResult(IOUtil.readStr(connection.getErrorStream(), params.getCharset()));
             } catch (Throwable ignored) {
             }
             LogUtil.e(httpException.toString() + ", url: " + queryUrl);
