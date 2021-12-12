diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/block/ArrayBlock.java b/presto-spi/src/main/java/com/facebook/presto/spi/block/ArrayBlock.java
index 6ad6271..8cf3d52 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/block/ArrayBlock.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/block/ArrayBlock.java
@@ -31,7 +31,7 @@
     private final Block values;
     private final int[] offsets;
 
-    private long sizeInBytes;
+    private volatile long sizeInBytes;
     private final long retainedSizeInBytes;
 
     public ArrayBlock(int positionCount, boolean[] valueIsNull, int[] offsets, Block values)
@@ -78,7 +78,6 @@
     @Override
     public long getSizeInBytes()
     {
-        // this is racy but is safe because sizeInBytes is an int and the calculation is stable
         if (sizeInBytes < 0) {
             calculateSize();
         }
