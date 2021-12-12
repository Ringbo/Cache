diff --git a/test/org/apache/catalina/startup/TomcatBaseTest.java b/test/org/apache/catalina/startup/TomcatBaseTest.java
index f541971..ab8ee6e 100644
--- a/test/org/apache/catalina/startup/TomcatBaseTest.java
+++ b/test/org/apache/catalina/startup/TomcatBaseTest.java
@@ -494,7 +494,7 @@
             out.println("REQUEST-CHARACTER-ENCODING: " +
                         request.getCharacterEncoding());
             out.println("REQUEST-CONTENT-LENGTH: " +
-                        request.getContentLength());
+                        request.getContentLengthLong());
             out.println("REQUEST-CONTENT-TYPE: " + request.getContentType());
             out.println("REQUEST-LOCALE: " + request.getLocale());
 
