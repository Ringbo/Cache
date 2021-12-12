diff --git a/curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java b/curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java
index 7c68868..70e0abd 100644
--- a/curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java
+++ b/curator-recipes/src/main/java/org/apache/curator/framework/recipes/cache/TreeCache.java
@@ -173,7 +173,7 @@
         /**
          * By default, TreeCache creates {@link org.apache.zookeeper.ZooKeeper} watches for every created path.
          * Change this behavior with this method.
-         * @param disableZkWatches false to create watches
+         * @param disableZkWatches true to disable zk watches
          * @return this for chaining
          */
         public Builder disableZkWatches(boolean disableZkWatches)
@@ -572,7 +572,7 @@
      */
     public TreeCache(CuratorFramework client, String path)
     {
-        this(client, path, true, false, Integer.MAX_VALUE, Executors.newSingleThreadExecutor(defaultThreadFactory), false, true, new DefaultTreeCacheSelector());
+        this(client, path, true, false, Integer.MAX_VALUE, Executors.newSingleThreadExecutor(defaultThreadFactory), false, false, new DefaultTreeCacheSelector());
     }
 
     /**
@@ -582,7 +582,7 @@
      * @param dataIsCompressed if true, data in the path is compressed
      * @param executorService  Closeable ExecutorService to use for the TreeCache's background thread
      * @param createParentNodes true to create parent nodes as containers
-     * @param disableZkWatches false to create Zookeeper watches
+     * @param disableZkWatches true to disable Zookeeper watches
      * @param selector         the selector to use
      */
     TreeCache(CuratorFramework client, String path, boolean cacheData, boolean dataIsCompressed, int maxDepth, final ExecutorService executorService, boolean createParentNodes, boolean disableZkWatches, TreeCacheSelector selector)
