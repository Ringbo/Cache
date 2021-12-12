diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleArrayBlockWriter.java b/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleArrayBlockWriter.java
index e3a9fa6..ad1f9ef 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleArrayBlockWriter.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleArrayBlockWriter.java
@@ -36,7 +36,7 @@
     }
 
     @Override
-    protected BlockBuilder getBlock()
+    protected Block getBlock()
     {
         return blockBuilder;
     }
