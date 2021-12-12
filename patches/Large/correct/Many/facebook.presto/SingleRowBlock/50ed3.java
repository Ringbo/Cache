diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleRowBlock.java b/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleRowBlock.java
index 89867e9..33ee8fa 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleRowBlock.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleRowBlock.java
@@ -55,7 +55,7 @@
     {
         long sizeInBytes = 0;
         for (int i = 0; i < fieldBlocks.length; i++) {
-            sizeInBytes += getRawFieldBlock(i).getSizeInBytes();
+            sizeInBytes += getRawFieldBlock(i).getRegionSizeInBytes(rowIndex, 1);
         }
         return sizeInBytes;
     }
