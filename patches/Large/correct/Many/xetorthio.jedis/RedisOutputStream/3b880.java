diff --git a/src/main/java/redis/clients/util/RedisOutputStream.java b/src/main/java/redis/clients/util/RedisOutputStream.java
index d9233e9..c366e02 100644
--- a/src/main/java/redis/clients/util/RedisOutputStream.java
+++ b/src/main/java/redis/clients/util/RedisOutputStream.java
@@ -119,13 +119,13 @@
                     flushBuffer();
                 }
             } else if (c < 0x800) {
-                if(2 < buf.length - count) {
+                if(2 >= buf.length - count) {
                     flushBuffer();
                 }
                 buf[count++] = (byte)(0xc0 | (c >> 6));
                 buf[count++] = (byte)(0x80 | (c & 0x3f));
             } else if (isSurrogate(c)) {
-                if(4 < buf.length - count) {
+                if(4 >= buf.length - count) {
                     flushBuffer();
                 }
                 int uc = Character.toCodePoint(c, str.charAt(i++));
@@ -134,7 +134,7 @@
                 buf[count++] = ((byte)(0x80 | ((uc >> 6) & 0x3f)));
                 buf[count++] = ((byte)(0x80 | (uc & 0x3f)));
             } else {
-                if(3 < buf.length - count) {
+                if(3 >= buf.length - count) {
                     flushBuffer();
                 }
                 buf[count++] =((byte)(0xe0 | ((c >> 12))));
