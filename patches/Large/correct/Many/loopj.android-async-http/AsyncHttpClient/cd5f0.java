diff --git a/library/src/main/java/com/loopj/android/http/AsyncHttpClient.java b/library/src/main/java/com/loopj/android/http/AsyncHttpClient.java
index 6263127..24f409e 100644
--- a/library/src/main/java/com/loopj/android/http/AsyncHttpClient.java
+++ b/library/src/main/java/com/loopj/android/http/AsyncHttpClient.java
@@ -210,7 +210,7 @@
 
         ThreadSafeClientConnManager cm = new ThreadSafeClientConnManager(httpParams, schemeRegistry);
 
-        threadPool = Executors.newFixedThreadPool(DEFAULT_MAX_CONNECTIONS);
+        threadPool = Executors.newCachedThreadPool();
         requestMap = new WeakHashMap<Context, List<WeakReference<Future<?>>>>();
         clientHeaderMap = new HashMap<String, String>();
 
