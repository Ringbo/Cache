diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/block/SliceArrayBlock.java b/presto-spi/src/main/java/com/facebook/presto/spi/block/SliceArrayBlock.java
index 913511a..4b17fac 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/block/SliceArrayBlock.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/block/SliceArrayBlock.java
@@ -225,7 +225,7 @@
     private static long getSliceArrayRetainedSizeInBytes(Slice[] values)
     {
         long sizeInBytes = sizeOf(values);
-        Map<Object, Boolean> uniqueRetained = new IdentityHashMap<>(values.length);
+        Map<Object, Boolean> uniqueRetained = new IdentityHashMap<>();
         for (Slice value : values) {
             if (value == null) {
                 continue;
