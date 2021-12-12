diff --git a/java/org/apache/catalina/valves/ExtendedAccessLogValve.java b/java/org/apache/catalina/valves/ExtendedAccessLogValve.java
index e54b4fa..c3b7008 100644
--- a/java/org/apache/catalina/valves/ExtendedAccessLogValve.java
+++ b/java/org/apache/catalina/valves/ExtendedAccessLogValve.java
@@ -813,7 +813,7 @@
                 @Override
                 public void addElement(CharArrayWriter buf, Date date,
                         Request request, Response response, long time) {
-                    buf.append(wrap("" + request.getContentLength()));
+                    buf.append(wrap("" + request.getContentLengthLong()));
                 }
             };
         } else if ("characterEncoding".equals(parameter)) {
