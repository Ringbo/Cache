diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/watcher/test/WatcherTestUtils.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/watcher/test/WatcherTestUtils.java
index e36c68e..e4130d3 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/watcher/test/WatcherTestUtils.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/watcher/test/WatcherTestUtils.java
@@ -253,9 +253,6 @@
     }
 
     public static SearchType getRandomSupportedSearchType() {
-        return randomFrom(
-                SearchType.QUERY_AND_FETCH,
-                SearchType.QUERY_THEN_FETCH,
-                SearchType.DFS_QUERY_THEN_FETCH);
+        return randomFrom(SearchType.QUERY_THEN_FETCH, SearchType.DFS_QUERY_THEN_FETCH);
     }
 }
