diff --git a/core/client/src/test/java/alluxio/client/block/UnderStoreBlockInStreamTest.java b/core/client/src/test/java/alluxio/client/block/UnderStoreBlockInStreamTest.java
index 7aa8b09..771aeee 100644
--- a/core/client/src/test/java/alluxio/client/block/UnderStoreBlockInStreamTest.java
+++ b/core/client/src/test/java/alluxio/client/block/UnderStoreBlockInStreamTest.java
@@ -83,7 +83,7 @@
    */
   private void singleByteReadInternal(UnderStoreBlockInStream inStream, int startIndex)
       throws IOException {
-    long remaining = mBlockStream.remaining();
+    long remaining = inStream.remaining();
     for (int i = startIndex; i < startIndex + BLOCK_LENGTH; i++) {
       Assert.assertEquals(i, inStream.read());
       remaining--;
