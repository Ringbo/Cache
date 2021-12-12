diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/block/AbstractSingleArrayBlock.java b/presto-spi/src/main/java/com/facebook/presto/spi/block/AbstractSingleArrayBlock.java
index 2c15685..69351eb 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/block/AbstractSingleArrayBlock.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/block/AbstractSingleArrayBlock.java
@@ -25,7 +25,7 @@
         this.start = start;
     }
 
-    protected abstract BlockBuilder getBlock();
+    protected abstract Block getBlock();
 
     private void checkReadablePosition(int position)
     {
