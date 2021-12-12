diff --git a/src/main/java/org/elasticsearch/action/search/ShardSearchFailure.java b/src/main/java/org/elasticsearch/action/search/ShardSearchFailure.java
index fcee4c3..e9bbe2b 100644
--- a/src/main/java/org/elasticsearch/action/search/ShardSearchFailure.java
+++ b/src/main/java/org/elasticsearch/action/search/ShardSearchFailure.java
@@ -35,8 +35,6 @@
 
 /**
  * Represents a failure to search on a specific shard.
- *
- *
  */
 public class ShardSearchFailure implements ShardOperationFailedException {
 
@@ -58,7 +56,7 @@
             this.shardTarget = ((SearchException) actual).shard();
         }
         if (actual != null && actual instanceof ElasticSearchException) {
-            status = ((ElasticSearchException) t).status();
+            status = ((ElasticSearchException) actual).status();
         } else {
             status = RestStatus.INTERNAL_SERVER_ERROR;
         }
