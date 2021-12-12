diff --git a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixObservableCollapser.java b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixObservableCollapser.java
index 77f9929..d4742a0 100644
--- a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixObservableCollapser.java
+++ b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixObservableCollapser.java
@@ -370,7 +370,7 @@
     public Observable<ResponseType> toObservable(Scheduler observeOn) {
 
         /* try from cache first */
-        if (getProperties().requestCachingEnabled().get()) {
+        if (getProperties().requestCacheEnabled().get()) {
             Observable<ResponseType> fromCache = requestCache.get(getCacheKey());
             if (fromCache != null) {
                 /* mark that we received this response from cache */
@@ -384,7 +384,7 @@
 
         RequestCollapser<BatchReturnType, ResponseType, RequestArgumentType> requestCollapser = collapserFactory.getRequestCollapser(collapserInstanceWrapper);
         Observable<ResponseType> response = requestCollapser.submitRequest(getRequestArgument());
-        if (getProperties().requestCachingEnabled().get()) {
+        if (getProperties().requestCacheEnabled().get()) {
             /*
              * A race can occur here with multiple threads queuing but only one will be cached.
              * This means we can have some duplication of requests in a thread-race but we're okay
