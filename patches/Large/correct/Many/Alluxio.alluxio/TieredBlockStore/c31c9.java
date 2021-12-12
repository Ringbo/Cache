diff --git a/servers/src/main/java/tachyon/worker/block/TieredBlockStore.java b/servers/src/main/java/tachyon/worker/block/TieredBlockStore.java
index d971cd9..93c0ce1 100644
--- a/servers/src/main/java/tachyon/worker/block/TieredBlockStore.java
+++ b/servers/src/main/java/tachyon/worker/block/TieredBlockStore.java
@@ -292,7 +292,7 @@
   @Override
   public void removeBlock(long sessionId, long blockId) throws InvalidStateException,
       NotFoundException, IOException {
-    removeBlockInternal(sessionId, blockId, BlockStoreLocation.anyTier());
+    removeBlock(sessionId, blockId, BlockStoreLocation.anyTier());
   }
 
   @Override
