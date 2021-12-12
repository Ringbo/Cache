diff --git a/plugin/src/test/java/org/elasticsearch/xpack/watcher/condition/CompareConditionSearchTests.java b/plugin/src/test/java/org/elasticsearch/xpack/watcher/condition/CompareConditionSearchTests.java
index 5f9a800..3973e3b 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/watcher/condition/CompareConditionSearchTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/watcher/condition/CompareConditionSearchTests.java
@@ -83,7 +83,7 @@
         hit.shard(new SearchShardTarget("a", new Index("a", "indexUUID"), 0));
 
         InternalSearchResponse internalSearchResponse = new InternalSearchResponse(
-                new SearchHits(new SearchHit[]{hit}, 1L, 1f), null, null, null, false, false);
+                new SearchHits(new SearchHit[]{hit}, 1L, 1f), null, null, null, false, false, 1);
         SearchResponse response = new SearchResponse(internalSearchResponse, "", 3, 3, 500L, new ShardSearchFailure[0]);
 
         WatchExecutionContext ctx = mockExecutionContext("_watch_name", new Payload.XContent(response));
