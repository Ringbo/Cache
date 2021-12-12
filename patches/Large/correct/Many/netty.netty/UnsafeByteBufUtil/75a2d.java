diff --git a/buffer/src/main/java/io/netty/buffer/UnsafeByteBufUtil.java b/buffer/src/main/java/io/netty/buffer/UnsafeByteBufUtil.java
index 5cbd676..9cbf069 100644
--- a/buffer/src/main/java/io/netty/buffer/UnsafeByteBufUtil.java
+++ b/buffer/src/main/java/io/netty/buffer/UnsafeByteBufUtil.java
@@ -251,7 +251,8 @@
             short v = PlatformDependent.getShort(array, index);
             return BIG_ENDIAN_NATIVE_ORDER ? v : Short.reverseBytes(v);
         }
-        return (short) (PlatformDependent.getByte(index) << 8 | PlatformDependent.getByte(index + 1) & 0xff);
+        return (short) (PlatformDependent.getByte(array, index) << 8 |
+                PlatformDependent.getByte(array, index + 1) & 0xff);
     }
 
     static short getShortLE(byte[] array, int index) {
