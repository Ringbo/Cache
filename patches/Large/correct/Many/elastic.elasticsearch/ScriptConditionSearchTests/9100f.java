diff --git a/plugin/src/test/java/org/elasticsearch/xpack/watcher/condition/ScriptConditionSearchTests.java b/plugin/src/test/java/org/elasticsearch/xpack/watcher/condition/ScriptConditionSearchTests.java
index ca6de31..b0bc231 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/watcher/condition/ScriptConditionSearchTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/watcher/condition/ScriptConditionSearchTests.java
@@ -112,7 +112,7 @@
         hit.shard(new SearchShardTarget("a", new Index("a", "testUUID"), 0));
 
         InternalSearchResponse internalSearchResponse = new InternalSearchResponse(new SearchHits(
-                new SearchHit[]{hit}, 1L, 1f), null, null, null, false, false);
+                new SearchHit[]{hit}, 1L, 1f), null, null, null, false, false, 1);
         SearchResponse response = new SearchResponse(internalSearchResponse, "", 3, 3, 500L, new ShardSearchFailure[0]);
 
         WatchExecutionContext ctx = mockExecutionContext("_watch_name", new Payload.XContent(response));
