diff --git a/java/org/apache/catalina/servlets/DefaultServlet.java b/java/org/apache/catalina/servlets/DefaultServlet.java
index 4fd5591..0cb78bf 100644
--- a/java/org/apache/catalina/servlets/DefaultServlet.java
+++ b/java/org/apache/catalina/servlets/DefaultServlet.java
@@ -923,7 +923,7 @@
                         contentLength);
                 // Don't set a content length if something else has already
                 // written to the response.
-                if (contentWritten > 0) {
+                if (contentWritten == 0) {
                     if (contentLength < Integer.MAX_VALUE) {
                         response.setContentLength((int) contentLength);
                     } else {
