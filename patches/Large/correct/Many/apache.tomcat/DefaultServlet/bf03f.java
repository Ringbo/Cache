diff --git a/java/org/apache/catalina/servlets/DefaultServlet.java b/java/org/apache/catalina/servlets/DefaultServlet.java
index 8afbaaf..ba61435 100644
--- a/java/org/apache/catalina/servlets/DefaultServlet.java
+++ b/java/org/apache/catalina/servlets/DefaultServlet.java
@@ -1567,7 +1567,7 @@
                 // If an If-None-Match header has been specified, if modified since
                 // is ignored.
                 if ((request.getHeader("If-None-Match") == null)
-                    && (lastModified <= headerValue + 1000)) {
+                    && (lastModified < headerValue + 1000)) {
                     // The entity has not been modified since the date
                     // specified by the client. This is not an error case.
                     response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
@@ -1658,7 +1658,7 @@
             long lastModified = resourceAttributes.getLastModified();
             long headerValue = request.getDateHeader("If-Unmodified-Since");
             if (headerValue != -1) {
-                if ( lastModified > (headerValue + 1000)) {
+                if ( lastModified >= (headerValue + 1000)) {
                     // The entity has not been modified since the date
                     // specified by the client. This is not an error case.
                     response.sendError(HttpServletResponse.SC_PRECONDITION_FAILED);
