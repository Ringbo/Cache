diff --git a/library/src/com/loopj/android/http/AsyncHttpClient.java b/library/src/com/loopj/android/http/AsyncHttpClient.java
index 7e692d8..bc8c0af 100644
--- a/library/src/com/loopj/android/http/AsyncHttpClient.java
+++ b/library/src/com/loopj/android/http/AsyncHttpClient.java
@@ -213,7 +213,7 @@
 
         ThreadSafeClientConnManager cm = new ThreadSafeClientConnManager(httpParams, schemeRegistry);
 
-        threadPool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
+        threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(DEFAULT_MAX_CONNECTIONS);
         requestMap = new WeakHashMap<Context, List<WeakReference<Future<?>>>>();
         clientHeaderMap = new HashMap<String, String>();
 
@@ -286,7 +286,7 @@
 
     /**
      * Overrides the threadpool implementation used when queuing/pooling
-     * requests. By default, Executors.newCachedThreadPool() is used.
+     * requests. By default, Executors.newFixedThreadPool() is used.
      *
      * @param threadPool an instance of {@link ThreadPoolExecutor} to use for queuing/pooling requests.
      */
