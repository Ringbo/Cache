diff --git a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
index e718418..c7ec5f3 100644
--- a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
+++ b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
@@ -282,7 +282,7 @@
         hit.shard(new SearchShardTarget("_node_id", indexName, 0));
         hit.sourceRef(new BytesArray("{}"));
         hits = new InternalSearchHits(new InternalSearchHit[]{hit}, 1, 1.0f);
-        SearchResponse searchResponse2 = new SearchResponse(new InternalSearchResponse(hits, null, null, false, null), "_scrollId", 1, 1, 1, null);
+        SearchResponse searchResponse2 = new SearchResponse(new InternalSearchResponse(hits, null, null, null, false, null), "_scrollId", 1, 1, 1, null);
         SearchResponse searchResponse3 = new SearchResponse(InternalSearchResponse.empty(), "_scrollId", 1, 1, 1, null);
         when(clientProxy.searchScroll(eq("_scrollId"), any(TimeValue.class))).thenReturn(searchResponse2, searchResponse3);
 
