diff --git a/robospice-core-parent/robospice/src/com/octo/android/robospice/SpiceManager.java b/robospice-core-parent/robospice/src/com/octo/android/robospice/SpiceManager.java
index f5ebb33..375394b 100644
--- a/robospice-core-parent/robospice/src/com/octo/android/robospice/SpiceManager.java
+++ b/robospice-core-parent/robospice/src/com/octo/android/robospice/SpiceManager.java
@@ -365,15 +365,21 @@
     }
 
     /**
-     * Execute a request, put the result in cache with key
-     * <i>requestCacheKey</i> during <i>cacheDuration</i> millisecond and
-     * register listeners to notify when request is finished.
+     * Execute a request. Before invoking the method
+     * {@link SpiceRequest#loadDataFromNetwork()}, the cache will be checked :
+     * if a result has been cached with the cache key <i>requestCacheKey</i>,
+     * RoboSpice will consider the parameter <i>cacheExpiryDuration</i> to
+     * determine whether the result in the cache is expired or not. If it is not
+     * expired, then listeners will receive the data in cache. Otherwise, the
+     * method {@link SpiceRequest#loadDataFromNetwork()} will be invoked and the
+     * result will be stored in cache using the cache key
+     * <i>requestCacheKey</i>.
      * @param request
      *            the request to execute
      * @param requestCacheKey
      *            the key used to store and retrieve the result of the request
      *            in the cache
-     * @param cacheDuration
+     * @param cacheExpiryDuration
      *            duration in millisecond after which the content of the cache
      *            will be considered to be expired. For instance
      *            DurationInMillis.ALWAYS means that data in cache will always
@@ -386,10 +392,10 @@
      *            the listener to notify when the request will finish
      */
     public <T> void execute(final SpiceRequest<T> request,
-        final Object requestCacheKey, final long cacheDuration,
+        final Object requestCacheKey, final long cacheExpiryDuration,
         final RequestListener<T> requestListener) {
         final CachedSpiceRequest<T> cachedSpiceRequest = new CachedSpiceRequest<T>(
-            request, requestCacheKey, cacheDuration);
+            request, requestCacheKey, cacheExpiryDuration);
         execute(cachedSpiceRequest, requestListener);
     }
 
