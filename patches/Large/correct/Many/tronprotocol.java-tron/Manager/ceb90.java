diff --git a/src/main/java/org/tron/core/db/Manager.java b/src/main/java/org/tron/core/db/Manager.java
index 5607fa4..84301b1 100644
--- a/src/main/java/org/tron/core/db/Manager.java
+++ b/src/main/java/org/tron/core/db/Manager.java
@@ -192,7 +192,7 @@
 
   public BlockCapsule getHead() throws HeaderNotFound {
     List<BlockCapsule> blocks = getBlockStore().getBlockByLatestNum(1);
-    if (CollectionUtils.isEmpty(blocks)) {
+    if (CollectionUtils.isNotEmpty(blocks)) {
       return blocks.get(0);
     } else {
       logger.info("Header block Not Found");
