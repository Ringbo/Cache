diff --git a/servers/src/main/java/tachyon/worker/block/meta/BlockMeta.java b/servers/src/main/java/tachyon/worker/block/meta/BlockMeta.java
index e19367b..8ff913e 100644
--- a/servers/src/main/java/tachyon/worker/block/meta/BlockMeta.java
+++ b/servers/src/main/java/tachyon/worker/block/meta/BlockMeta.java
@@ -30,7 +30,8 @@
 
   public BlockMeta(TempBlockMeta tempBlock) {
     super(tempBlock.getBlockId(), tempBlock.getParentDir());
-    mBlockSize = new File(tempBlock.getCommitPath()).length();
+    // NOTE: TempBlockMeta must be committed before the actual data block file is moved.
+    mBlockSize = new File(tempBlock.getPath()).length();
   }
 
   @Override
