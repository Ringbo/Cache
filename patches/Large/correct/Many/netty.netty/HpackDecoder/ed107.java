diff --git a/codec-http2/src/main/java/io/netty/handler/codec/http2/HpackDecoder.java b/codec-http2/src/main/java/io/netty/handler/codec/http2/HpackDecoder.java
index dad2c6f..e4d5c5f 100644
--- a/codec-http2/src/main/java/io/netty/handler/codec/http2/HpackDecoder.java
+++ b/codec-http2/src/main/java/io/netty/handler/codec/http2/HpackDecoder.java
@@ -49,7 +49,7 @@
 import static io.netty.util.internal.ObjectUtil.checkPositive;
 import static io.netty.util.internal.ThrowableUtil.unknownStackTrace;
 
-final class HpackDecoder {
+public final class HpackDecoder {
     private static final Http2Exception DECODE_ULE_128_DECOMPRESSION_EXCEPTION = unknownStackTrace(
             connectionError(COMPRESSION_ERROR, "HPACK - decompression failure"), HpackDecoder.class,
             "decodeULE128(..)");
@@ -96,7 +96,7 @@
      *  (which is dangerous).
      * @param initialHuffmanDecodeCapacity Size of an intermediate buffer used during huffman decode.
      */
-    HpackDecoder(long maxHeaderListSize, int initialHuffmanDecodeCapacity) {
+    public HpackDecoder(long maxHeaderListSize, int initialHuffmanDecodeCapacity) {
         this(maxHeaderListSize, initialHuffmanDecodeCapacity, DEFAULT_HEADER_TABLE_SIZE);
     }
 
@@ -104,7 +104,7 @@
      * Exposed Used for testing only! Default values used in the initial settings frame are overriden intentionally
      * for testing but violate the RFC if used outside the scope of testing.
      */
-    HpackDecoder(long maxHeaderListSize, int initialHuffmanDecodeCapacity, int maxHeaderTableSize) {
+    public HpackDecoder(long maxHeaderListSize, int initialHuffmanDecodeCapacity, int maxHeaderTableSize) {
         this.maxHeaderListSize = checkPositive(maxHeaderListSize, "maxHeaderListSize");
         this.maxHeaderListSizeGoAway = Http2CodecUtil.calculateMaxHeaderListSizeGoAway(maxHeaderListSize);
 
