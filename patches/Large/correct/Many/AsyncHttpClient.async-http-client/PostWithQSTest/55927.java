diff --git a/src/test/java/com/ning/http/client/async/PostWithQSTest.java b/src/test/java/com/ning/http/client/async/PostWithQSTest.java
index 9e16598..b40b132 100644
--- a/src/test/java/com/ning/http/client/async/PostWithQSTest.java
+++ b/src/test/java/com/ning/http/client/async/PostWithQSTest.java
@@ -41,7 +41,7 @@
             if ("POST".equalsIgnoreCase(request.getMethod())) {
                 String qs = request.getQueryString();
                 ServletInputStream is = request.getInputStream();
-                if (qs != null && !qs.isEmpty() && is.available() == 3) {
+                if (qs != null && !qs.equals("") && is.available() == 3) {
                     response.setStatus(HttpServletResponse.SC_OK);
                     byte buf[] = new byte[is.available()];
                     is.readLine(buf, 0, is.available());
