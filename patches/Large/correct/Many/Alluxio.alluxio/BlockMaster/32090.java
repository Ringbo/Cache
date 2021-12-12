diff --git a/servers/src/main/java/tachyon/master/block/BlockMaster.java b/servers/src/main/java/tachyon/master/block/BlockMaster.java
index 8c21c6a..508207b 100644
--- a/servers/src/main/java/tachyon/master/block/BlockMaster.java
+++ b/servers/src/main/java/tachyon/master/block/BlockMaster.java
@@ -613,7 +613,7 @@
    * @return the lost blocks in Tachyon Storage
    */
   public Set<Long> getLostBlocks() {
-    synchronized (mLostBlocks) {
+    synchronized (mBlocks) {
       return ImmutableSet.copyOf(mLostBlocks);
     }
   }
