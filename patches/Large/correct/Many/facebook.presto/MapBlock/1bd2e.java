diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/block/MapBlock.java b/presto-spi/src/main/java/com/facebook/presto/spi/block/MapBlock.java
index 6457704..4957f6a 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/block/MapBlock.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/block/MapBlock.java
@@ -41,7 +41,7 @@
     private final Block valueBlock;
     private final int[] hashTables; // hash to location in map;
 
-    private long sizeInBytes;
+    private volatile long sizeInBytes;
     private final long retainedSizeInBytes;
 
     /**
@@ -125,7 +125,6 @@
     @Override
     public long getSizeInBytes()
     {
-        // this is racy but is safe because sizeInBytes is an int and the calculation is stable
         if (sizeInBytes < 0) {
             calculateSize();
         }
