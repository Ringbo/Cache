diff --git a/codec-http2/src/main/java/io/netty/handler/codec/http2/internal/hpack/Decoder.java b/codec-http2/src/main/java/io/netty/handler/codec/http2/internal/hpack/Decoder.java
index fa37aca..b67a9dc 100644
--- a/codec-http2/src/main/java/io/netty/handler/codec/http2/internal/hpack/Decoder.java
+++ b/codec-http2/src/main/java/io/netty/handler/codec/http2/internal/hpack/Decoder.java
@@ -213,7 +213,7 @@
                     if (index == 0x7f) {
                         state = READ_LITERAL_HEADER_NAME_LENGTH;
                     } else {
-                        if (nameLength > maxHeadersLength - headersLength) {
+                        if (index > maxHeadersLength - headersLength) {
                             maxHeaderSizeExceeded();
                         }
                         nameLength = index;
