diff --git a/plugin/src/test/java/org/elasticsearch/xpack/watcher/execution/TriggeredWatchStoreTests.java b/plugin/src/test/java/org/elasticsearch/xpack/watcher/execution/TriggeredWatchStoreTests.java
index 0f9b9dc..f782984 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/watcher/execution/TriggeredWatchStoreTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/watcher/execution/TriggeredWatchStoreTests.java
@@ -278,7 +278,7 @@
         hit.sourceRef(new BytesArray("{}"));
         hits = new SearchHits(new SearchHit[]{hit}, 1, 1.0f);
         SearchResponse searchResponse2 = new SearchResponse(
-                new InternalSearchResponse(hits, null, null, null, false, null), "_scrollId", 1, 1, 1, null);
+                new InternalSearchResponse(hits, null, null, null, false, null, 1), "_scrollId", 1, 1, 1, null);
         SearchResponse searchResponse3 = new SearchResponse(InternalSearchResponse.empty(), "_scrollId", 1, 1, 1, null);
         when(clientProxy.searchScroll(eq("_scrollId"), any(TimeValue.class))).thenReturn(searchResponse2, searchResponse3);
 
