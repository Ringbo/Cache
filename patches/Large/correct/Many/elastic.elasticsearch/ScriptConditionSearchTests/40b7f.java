diff --git a/elasticsearch/qa/messy-test-watcher-with-groovy/src/test/java/org/elasticsearch/messy/tests/ScriptConditionSearchTests.java b/elasticsearch/qa/messy-test-watcher-with-groovy/src/test/java/org/elasticsearch/messy/tests/ScriptConditionSearchTests.java
index 515b5c5..3201f7c 100644
--- a/elasticsearch/qa/messy-test-watcher-with-groovy/src/test/java/org/elasticsearch/messy/tests/ScriptConditionSearchTests.java
+++ b/elasticsearch/qa/messy-test-watcher-with-groovy/src/test/java/org/elasticsearch/messy/tests/ScriptConditionSearchTests.java
@@ -95,7 +95,7 @@
         hit.score(1f);
         hit.shard(new SearchShardTarget("a", "a", 0));
 
-        InternalSearchResponse internalSearchResponse = new InternalSearchResponse(new InternalSearchHits(new InternalSearchHit[]{hit}, 1l, 1f), null, null, false, false);
+        InternalSearchResponse internalSearchResponse = new InternalSearchResponse(new InternalSearchHits(new InternalSearchHit[]{hit}, 1l, 1f), null, null, null, false, false);
         SearchResponse response = new SearchResponse(internalSearchResponse, "", 3, 3, 500l, new ShardSearchFailure[0]);
 
         WatchExecutionContext ctx = mockExecutionContext("_watch_name", new Payload.XContent(response));
