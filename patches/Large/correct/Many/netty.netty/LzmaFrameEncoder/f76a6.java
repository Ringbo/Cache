diff --git a/codec/src/main/java/io/netty/handler/codec/compression/LzmaFrameEncoder.java b/codec/src/main/java/io/netty/handler/codec/compression/LzmaFrameEncoder.java
index f502983..62cafc4 100644
--- a/codec/src/main/java/io/netty/handler/codec/compression/LzmaFrameEncoder.java
+++ b/codec/src/main/java/io/netty/handler/codec/compression/LzmaFrameEncoder.java
@@ -144,7 +144,7 @@
         if (pb < 0 || pb > 4) {
             throw new IllegalArgumentException("pb: " + pb + " (expected: 0-4)");
         }
-        if (lc + pb > 4) {
+        if (lc + lp > 4) {
             if (!warningLogged) {
                 logger.warn("The latest versions of LZMA libraries (for example, XZ Utils) " +
                         "has an additional requirement: lc + lp <= 4. Data which don't follow " +
