diff --git a/src/test/java/io/mycat/buffer/TestDirectByteBufferPool.java b/src/test/java/io/mycat/buffer/TestDirectByteBufferPool.java
index 3824c60..3fd146a 100644
--- a/src/test/java/io/mycat/buffer/TestDirectByteBufferPool.java
+++ b/src/test/java/io/mycat/buffer/TestDirectByteBufferPool.java
@@ -86,7 +86,7 @@
         int i = 0;
         for (; i < allocTimes; i++) {
             byteBuffer = pool.allocate(size);
-            if (byteBuffer == null) {
+            if (byteBuffer == null||!(byteBuffer instanceof DirectBuffer) ) {
                 break;
             }
             buffs.add(byteBuffer);
@@ -110,7 +110,7 @@
         int i = 0;
         for (; i < allocTimes; i++) {
             byteBuffer = pool.allocate(size);
-            if (byteBuffer == null) {
+            if (byteBuffer == null||!(byteBuffer instanceof DirectBuffer) ) {
                 break;
             }
             buffs.add(byteBuffer);
