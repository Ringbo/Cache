diff --git a/rt/transports/http/src/main/java/org/apache/cxf/transport/servlet/AbstractHTTPServlet.java b/rt/transports/http/src/main/java/org/apache/cxf/transport/servlet/AbstractHTTPServlet.java
index 520b448..c73c4da 100644
--- a/rt/transports/http/src/main/java/org/apache/cxf/transport/servlet/AbstractHTTPServlet.java
+++ b/rt/transports/http/src/main/java/org/apache/cxf/transport/servlet/AbstractHTTPServlet.java
@@ -402,7 +402,7 @@
         private String pathInfo;
         private String servletPath;
         
-        public HttpServletRequestRedirectFilter(HttpServletRequest request, 
+        HttpServletRequestRedirectFilter(HttpServletRequest request, 
                                         String pathInfo,
                                         String servletPath,
                                         boolean customServletPath) {
