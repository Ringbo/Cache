diff --git a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/condition/compare/CompareConditionSearchTests.java b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/condition/compare/CompareConditionSearchTests.java
index 25df16f..cc074e8 100644
--- a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/condition/compare/CompareConditionSearchTests.java
+++ b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/condition/compare/CompareConditionSearchTests.java
@@ -83,7 +83,7 @@
         hit.score(1f);
         hit.shard(new SearchShardTarget("a", "a", 0));
 
-        InternalSearchResponse internalSearchResponse = new InternalSearchResponse(new InternalSearchHits(new InternalSearchHit[]{hit}, 1l, 1f), null, null, false, false);
+        InternalSearchResponse internalSearchResponse = new InternalSearchResponse(new InternalSearchHits(new InternalSearchHit[]{hit}, 1l, 1f), null, null, null, false, false);
         SearchResponse response = new SearchResponse(internalSearchResponse, "", 3, 3, 500l, new ShardSearchFailure[0]);
 
         WatchExecutionContext ctx = mockExecutionContext("_watch_name", new Payload.XContent(response));
