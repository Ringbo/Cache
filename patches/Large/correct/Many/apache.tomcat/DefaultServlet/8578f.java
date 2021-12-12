diff --git a/java/org/apache/catalina/servlets/DefaultServlet.java b/java/org/apache/catalina/servlets/DefaultServlet.java
index 0cb78bf..46210dc 100644
--- a/java/org/apache/catalina/servlets/DefaultServlet.java
+++ b/java/org/apache/catalina/servlets/DefaultServlet.java
@@ -877,7 +877,8 @@
                 // trying to serve a text file
                 if ( (contentType == null)
                         || (contentType.startsWith("text"))
-                        || (contentType.endsWith("xml")) ) {
+                        || (contentType.endsWith("xml"))
+                        || (contentType.contains("/javascript")) ) {
                     writer = response.getWriter();
                     // Cannot reliably serve partial content with a Writer
                     ranges = FULL;
