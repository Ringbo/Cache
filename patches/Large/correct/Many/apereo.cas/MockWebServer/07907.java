diff --git a/cas-server-support-x509/src/test/java/org/jasig/cas/adaptors/x509/util/MockWebServer.java b/cas-server-support-x509/src/test/java/org/jasig/cas/adaptors/x509/util/MockWebServer.java
index 4ea388b..fbbe27f 100644
--- a/cas-server-support-x509/src/test/java/org/jasig/cas/adaptors/x509/util/MockWebServer.java
+++ b/cas-server-support-x509/src/test/java/org/jasig/cas/adaptors/x509/util/MockWebServer.java
@@ -164,7 +164,7 @@
             socket.shutdownOutput();
         }
 
-        private byte[] header(final String name, final Object value) {
+        private static byte[] header(final String name, final Object value) {
             return String.format("%s: %s\r\n", name, value).getBytes();
         }
     }
