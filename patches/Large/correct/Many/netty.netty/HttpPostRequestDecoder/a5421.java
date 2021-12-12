diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/multipart/HttpPostRequestDecoder.java b/codec-http/src/main/java/io/netty/handler/codec/http/multipart/HttpPostRequestDecoder.java
index a5f1705..32d981c 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/http/multipart/HttpPostRequestDecoder.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/multipart/HttpPostRequestDecoder.java
@@ -1186,18 +1186,19 @@
     private String readLineStandard() throws NotEnoughDataDecoderException {
         int readerIndex = undecodedChunk.readerIndex();
         try {
-            StringBuilder sb = new StringBuilder(64);
+            ByteBuf line = buffer(64);
+
             while (undecodedChunk.readable()) {
                 byte nextByte = undecodedChunk.readByte();
                 if (nextByte == HttpConstants.CR) {
                     nextByte = undecodedChunk.readByte();
                     if (nextByte == HttpConstants.LF) {
-                        return sb.toString();
+                        return line.toString(charset);
                     }
                 } else if (nextByte == HttpConstants.LF) {
-                    return sb.toString();
+                    return line.toString(charset);
                 } else {
-                    sb.append((char) nextByte);
+                    line.writeByte(nextByte);
                 }
             }
         } catch (IndexOutOfBoundsException e) {
@@ -1225,7 +1226,8 @@
         }
         int readerIndex = undecodedChunk.readerIndex();
         try {
-            StringBuilder sb = new StringBuilder(64);
+            ByteBuf line = buffer(64);
+
             while (sao.pos < sao.limit) {
                 byte nextByte = sao.bytes[sao.pos++];
                 if (nextByte == HttpConstants.CR) {
@@ -1233,16 +1235,16 @@
                         nextByte = sao.bytes[sao.pos++];
                         if (nextByte == HttpConstants.LF) {
                             sao.setReadPosition(0);
-                            return sb.toString();
+                            return line.toString(charset);
                         }
                     } else {
-                        sb.append((char) nextByte);
+                        line.writeByte(nextByte);
                     }
                 } else if (nextByte == HttpConstants.LF) {
                     sao.setReadPosition(0);
-                    return sb.toString();
+                    return line.toString(charset);
                 } else {
-                    sb.append((char) nextByte);
+                    line.writeByte(nextByte);
                 }
             }
         } catch (IndexOutOfBoundsException e) {
