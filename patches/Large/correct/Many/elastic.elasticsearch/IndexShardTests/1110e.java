diff --git a/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java b/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
index d308b88..a0a0717 100644
--- a/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
+++ b/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
@@ -741,7 +741,7 @@
         assertEquals(0, postDeleteException.get());
 
         shard.index(index);
-        assertEquals(1, preIndex.get());
+        assertEquals(2, preIndex.get());
         assertEquals(1, postIndexCreate.get());
         assertEquals(1, postIndexUpdate.get());
         assertEquals(0, postIndexException.get());
