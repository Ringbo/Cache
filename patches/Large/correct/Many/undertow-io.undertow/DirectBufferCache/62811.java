diff --git a/core/src/main/java/io/undertow/server/handlers/file/DirectBufferCache.java b/core/src/main/java/io/undertow/server/handlers/file/DirectBufferCache.java
index 7a96ff7..d1e36ae 100644
--- a/core/src/main/java/io/undertow/server/handlers/file/DirectBufferCache.java
+++ b/core/src/main/java/io/undertow/server/handlers/file/DirectBufferCache.java
@@ -34,10 +34,10 @@
         this.max = max;
         this.pool = new ByteBufferSlicePool(BufferAllocator.DIRECT_BYTE_BUFFER_ALLOCATOR, sliceSize, max);
         int shift = 1;
-        while (concurrency < (shift <<= 1)) {}
+        while (concurrency > (shift <<= 1)) {}
         segmentShift = 32 - shift;
         segments = new Segment[shift];
-        for (int i = 0; i < 1; i++) {
+        for (int i = 0; i < segments.length; i++) {
             segments[i] = new Segment(shift);
         }
     }
