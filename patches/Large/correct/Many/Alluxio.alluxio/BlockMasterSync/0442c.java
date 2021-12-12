diff --git a/servers/src/main/java/tachyon/worker/block/BlockMasterSync.java b/servers/src/main/java/tachyon/worker/block/BlockMasterSync.java
index cf01953..28a7195 100644
--- a/servers/src/main/java/tachyon/worker/block/BlockMasterSync.java
+++ b/servers/src/main/java/tachyon/worker/block/BlockMasterSync.java
@@ -153,7 +153,7 @@
 
   @Override
   public void close() {
-    mFixedExecutionService.shutdown();
+    mBlockRemovalService.shutdown();
   }
 
   /**
