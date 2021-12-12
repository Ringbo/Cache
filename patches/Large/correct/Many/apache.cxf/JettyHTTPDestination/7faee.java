diff --git a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
index b2b22c0..7dfaac6 100644
--- a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
+++ b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
@@ -275,7 +275,7 @@
     static class JettyOutputStream extends FilterOutputStream implements CopyingOutputStream {
         final HttpOutput out;
         boolean written;
-        public JettyOutputStream(HttpOutput o) {
+        JettyOutputStream(HttpOutput o) {
             super(o);
             out = o;
         }
@@ -323,7 +323,7 @@
     }
     static class CountingInputStream extends FilterInputStream {
         int count;
-        public CountingInputStream(InputStream in) {
+        CountingInputStream(InputStream in) {
             super(in);
         }
         public int getCount() {
