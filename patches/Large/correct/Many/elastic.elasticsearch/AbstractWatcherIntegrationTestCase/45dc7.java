diff --git a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/test/AbstractWatcherIntegrationTestCase.java b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/test/AbstractWatcherIntegrationTestCase.java
index 38bb439..d38c44d 100644
--- a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/test/AbstractWatcherIntegrationTestCase.java
+++ b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/test/AbstractWatcherIntegrationTestCase.java
@@ -398,7 +398,7 @@
                 @Override
                 public void run() {
                     ClusterState state = client().admin().cluster().prepareState().get().getState();
-                    String[] watchHistoryIndices = indexNameExpressionResolver().concreteIndices(state, IndicesOptions.lenientExpandOpen(),
+                    String[] watchHistoryIndices = indexNameExpressionResolver().concreteIndexNames(state, IndicesOptions.lenientExpandOpen(),
                             HistoryStore.INDEX_PREFIX + "*");
                     assertThat(watchHistoryIndices, not(emptyArray()));
                     for (String index : watchHistoryIndices) {
@@ -468,7 +468,7 @@
                     // The watch_history index gets created in the background when the first watch is triggered
                     // so we to check first is this index is created and shards are started
                     ClusterState state = client().admin().cluster().prepareState().get().getState();
-                    String[] watchHistoryIndices = indexNameExpressionResolver().concreteIndices(state, IndicesOptions.lenientExpandOpen(),
+                    String[] watchHistoryIndices = indexNameExpressionResolver().concreteIndexNames(state, IndicesOptions.lenientExpandOpen(),
                             HistoryStore.INDEX_PREFIX + "*");
                     assertThat(watchHistoryIndices, not(emptyArray()));
                     for (String index : watchHistoryIndices) {
@@ -503,7 +503,7 @@
             @Override
             public void run() {
                 ClusterState state = client().admin().cluster().prepareState().get().getState();
-                String[] watchHistoryIndices = indexNameExpressionResolver().concreteIndices(state, IndicesOptions.lenientExpandOpen(),
+                String[] watchHistoryIndices = indexNameExpressionResolver().concreteIndexNames(state, IndicesOptions.lenientExpandOpen(),
                         HistoryStore.INDEX_PREFIX + "*");
                 assertThat(watchHistoryIndices, not(emptyArray()));
                 for (String index : watchHistoryIndices) {
