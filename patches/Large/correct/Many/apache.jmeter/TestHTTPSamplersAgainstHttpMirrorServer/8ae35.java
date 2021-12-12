diff --git a/test/src/org/apache/jmeter/protocol/http/sampler/TestHTTPSamplersAgainstHttpMirrorServer.java b/test/src/org/apache/jmeter/protocol/http/sampler/TestHTTPSamplersAgainstHttpMirrorServer.java
index a8e81b1..c025c07 100644
--- a/test/src/org/apache/jmeter/protocol/http/sampler/TestHTTPSamplersAgainstHttpMirrorServer.java
+++ b/test/src/org/apache/jmeter/protocol/http/sampler/TestHTTPSamplersAgainstHttpMirrorServer.java
@@ -1279,7 +1279,7 @@
         output.write("\"".getBytes(ISO_8859_1));
         output.write(CRLF);
         output.write("Content-Type: text/plain".getBytes(ISO_8859_1));
-        if(contentEncoding != null) {
+        if(contentEncoding != null && !"US-ASCII".equalsIgnoreCase(contentEncoding)) {
             output.write("; charset=".getBytes(ISO_8859_1));
             output.write(contentEncoding.getBytes(ISO_8859_1));
         }
@@ -1302,7 +1302,7 @@
         output.write("\"".getBytes(ISO_8859_1));
         output.write(CRLF);
         output.write("Content-Type: text/plain".getBytes(ISO_8859_1));
-        if(contentEncoding != null) {
+        if(contentEncoding != null && !"US-ASCII".equalsIgnoreCase(contentEncoding)) {
             output.write("; charset=".getBytes(ISO_8859_1));
             output.write(contentEncoding.getBytes(ISO_8859_1));
         }
