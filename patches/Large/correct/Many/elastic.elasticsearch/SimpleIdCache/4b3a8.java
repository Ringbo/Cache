diff --git a/src/main/java/org/elasticsearch/index/cache/id/simple/SimpleIdCache.java b/src/main/java/org/elasticsearch/index/cache/id/simple/SimpleIdCache.java
index c7af35a..34f04f6 100644
--- a/src/main/java/org/elasticsearch/index/cache/id/simple/SimpleIdCache.java
+++ b/src/main/java/org/elasticsearch/index/cache/id/simple/SimpleIdCache.java
@@ -266,7 +266,7 @@
         if (readerCache.shardId != null) {
             IndexShard shard = indexService.shard(readerCache.shardId.id());
             if (shard != null) {
-                shard.idCache().onCached(readerCache.sizeInBytes());
+                shard.idCache().onRemoval(readerCache.sizeInBytes());
             }
         }
     }
