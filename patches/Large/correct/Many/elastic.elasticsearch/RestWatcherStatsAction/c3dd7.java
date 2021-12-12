diff --git a/src/main/java/org/elasticsearch/watcher/rest/action/RestWatcherStatsAction.java b/src/main/java/org/elasticsearch/watcher/rest/action/RestWatcherStatsAction.java
index f9272d8..83eb2a9 100644
--- a/src/main/java/org/elasticsearch/watcher/rest/action/RestWatcherStatsAction.java
+++ b/src/main/java/org/elasticsearch/watcher/rest/action/RestWatcherStatsAction.java
@@ -35,7 +35,7 @@
 
     @Override
     protected void handleRequest(final RestRequest restRequest, RestChannel restChannel, WatcherClient client) throws Exception {
-        Set<String> metrics = Strings.splitStringByCommaToSet(restRequest.param("metric"));
+        Set<String> metrics = Strings.splitStringByCommaToSet(restRequest.param("metric", ""));
 
         WatcherStatsRequest request = new WatcherStatsRequest();
         if (metrics.size() == 1 && metrics.contains("_all")) {
