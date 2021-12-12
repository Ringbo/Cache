diff --git a/core/src/main/java/io/undertow/conduits/ChunkedStreamSourceConduit.java b/core/src/main/java/io/undertow/conduits/ChunkedStreamSourceConduit.java
index bb2cab6..63579cc 100644
--- a/core/src/main/java/io/undertow/conduits/ChunkedStreamSourceConduit.java
+++ b/core/src/main/java/io/undertow/conduits/ChunkedStreamSourceConduit.java
@@ -198,7 +198,7 @@
                 while (anyAreSet(newVal, FLAG_READING_LENGTH)) {
                     while (buf.hasRemaining()) {
                         byte b = buf.get();
-                        if ((b >= '0' && b <= '9') || (b >= 'a' && b <= 'f') || (b >= 'A' && b < 'F')) {
+                        if ((b >= '0' && b <= '9') || (b >= 'a' && b <= 'f') || (b >= 'A' && b <= 'F')) {
                             chunkRemaining <<= 4; //shift it 4 bytes and then add the next value to the end
                             chunkRemaining += Integer.parseInt("" + (char) b, 16);
                         } else {
