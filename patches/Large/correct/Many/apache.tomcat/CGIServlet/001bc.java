diff --git a/java/org/apache/catalina/servlets/CGIServlet.java b/java/org/apache/catalina/servlets/CGIServlet.java
index b9f875d..7b5399e 100644
--- a/java/org/apache/catalina/servlets/CGIServlet.java
+++ b/java/org/apache/catalina/servlets/CGIServlet.java
@@ -371,7 +371,7 @@
         out.println("<li><b>characterEncoding</b> = " +
                        req.getCharacterEncoding());
         out.println("<li><b>contentLength</b> = " +
-                       req.getContentLength());
+                       req.getContentLengthLong());
         out.println("<li><b>contentType</b> = " +
                        req.getContentType());
         Enumeration<Locale> locales = req.getLocales();
@@ -1078,9 +1078,9 @@
              * if there is no content, so we cannot put 0 or -1 in as per the
              * Servlet API spec.
              */
-            int contentLength = req.getContentLength();
+            long contentLength = req.getContentLengthLong();
             String sContentLength = (contentLength <= 0 ? "" :
-                Integer.toString(contentLength));
+                Long.toString(contentLength));
             envp.put("CONTENT_LENGTH", sContentLength);
 
 
