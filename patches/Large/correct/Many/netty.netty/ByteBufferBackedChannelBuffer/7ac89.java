diff --git a/buffer/src/main/java/io/netty/buffer/ByteBufferBackedChannelBuffer.java b/buffer/src/main/java/io/netty/buffer/ByteBufferBackedChannelBuffer.java
index f010618..76980e7 100644
--- a/buffer/src/main/java/io/netty/buffer/ByteBufferBackedChannelBuffer.java
+++ b/buffer/src/main/java/io/netty/buffer/ByteBufferBackedChannelBuffer.java
@@ -145,7 +145,7 @@
             tmpBuf.clear().position(index).limit(index + length);
         } catch (IllegalArgumentException e) {
             throw new IndexOutOfBoundsException("Too many bytes to read - Need "
-                    + (index + length) + ", maximum is " + data.limit());
+                    + (index + length) + ", maximum is " + buffer.limit());
         }
         tmpBuf.get(dst, dstIndex, length);
     }
@@ -157,7 +157,7 @@
             tmpBuf.clear().position(index).limit(index + bytesToCopy);
         } catch (IllegalArgumentException e) {
             throw new IndexOutOfBoundsException("Too many bytes to read - Need "
-                    + (index + bytesToCopy) + ", maximum is " + data.limit());
+                    + (index + bytesToCopy) + ", maximum is " + buffer.limit());
         }
         dst.put(tmpBuf);
     }
