diff --git a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCollapser.java b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCollapser.java
index ea58272..42e4a2f 100644
--- a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCollapser.java
+++ b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCollapser.java
@@ -378,7 +378,7 @@
     public Observable<ResponseType> toObservable(Scheduler observeOn) {
 
         /* try from cache first */
-        if (getProperties().requestCachingEnabled().get()) {
+        if (getProperties().requestCacheEnabled().get()) {
             Observable<ResponseType> fromCache = requestCache.get(getCacheKey());
             if (fromCache != null) {
                 metrics.markResponseFromCache();
@@ -389,7 +389,7 @@
         RequestCollapser<BatchReturnType, ResponseType, RequestArgumentType> requestCollapser = collapserFactory.getRequestCollapser(collapserInstanceWrapper);
         Observable<ResponseType> response = requestCollapser.submitRequest(getRequestArgument());
         metrics.markRequestBatched();
-        if (getProperties().requestCachingEnabled().get()) {
+        if (getProperties().requestCacheEnabled().get()) {
             /*
              * A race can occur here with multiple threads queuing but only one will be cached.
              * This means we can have some duplication of requests in a thread-race but we're okay
