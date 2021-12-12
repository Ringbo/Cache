diff --git a/core/server/master/src/main/java/alluxio/master/file/meta/InodeFile.java b/core/server/master/src/main/java/alluxio/master/file/meta/InodeFile.java
index 0f5eac5..6403b03 100644
--- a/core/server/master/src/main/java/alluxio/master/file/meta/InodeFile.java
+++ b/core/server/master/src/main/java/alluxio/master/file/meta/InodeFile.java
@@ -178,7 +178,7 @@
    * @return the updated object
    */
   public InodeFile setBlockIds(List<Long> blockIds) {
-    mBlocks = new ArrayList<>(Preconditions.checkNotNull(blockIds));
+    mBlocks = new ArrayList<>(Preconditions.checkNotNull(blockIds, "blockIds"));
     return getThis();
   }
 
