diff --git a/jetty-servlet/src/main/java/org/eclipse/jetty/servlet/DefaultServlet.java b/jetty-servlet/src/main/java/org/eclipse/jetty/servlet/DefaultServlet.java
index 2d41066..7e0ef42 100644
--- a/jetty-servlet/src/main/java/org/eclipse/jetty/servlet/DefaultServlet.java
+++ b/jetty-servlet/src/main/java/org/eclipse/jetty/servlet/DefaultServlet.java
@@ -767,7 +767,7 @@
                     if (ifnm!=null && etag!=null)
                     {
                         // Handle special case of exact match OR gzip exact match
-                        if (etag.equals(ifnm) || ifnm.endsWith(ETAG_GZIP_QUOTE) && ifnm.indexOf(',')<0 && etag.equals(removeGzipFromETag(etag)))
+                        if (etag.equals(ifnm) || ifnm.endsWith(ETAG_GZIP_QUOTE) && ifnm.indexOf(',')<0 && etag.equals(removeGzipFromETag(ifnm)))
                         {
                             response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
                             response.setHeader(HttpHeader.ETAG.asString(),ifnm);
