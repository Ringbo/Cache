diff --git a/core/src/main/java/tachyon/worker/hierarchy/StorageDir.java b/core/src/main/java/tachyon/worker/hierarchy/StorageDir.java
index 606c72f..b2f92c5 100644
--- a/core/src/main/java/tachyon/worker/hierarchy/StorageDir.java
+++ b/core/src/main/java/tachyon/worker/hierarchy/StorageDir.java
@@ -717,7 +717,7 @@
     }
     // Check if this blocks is currently hold by other users.
     if (isBlockLocked(blockId) || !mToRemoveBlockIdSet.contains(blockId)) {
-      return false;
+      return true;
     }
     try {
       if (!mFs.delete(getBlockFilePath(blockId), false)) {
