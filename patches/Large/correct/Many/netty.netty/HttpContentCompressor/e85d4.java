diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentCompressor.java b/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentCompressor.java
index 70dbfe9..ac9e08f 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentCompressor.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/HttpContentCompressor.java
@@ -141,7 +141,7 @@
             int equalsPos = encoding.indexOf('=');
             if (equalsPos != -1) {
                 try {
-                    q = Float.valueOf(encoding.substring(equalsPos + 1));
+                    q = Float.parseFloat(encoding.substring(equalsPos + 1));
                 } catch (NumberFormatException e) {
                     // Ignore encoding
                     q = 0.0f;
