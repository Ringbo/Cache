diff --git a/modules/cpr/src/main/java/org/atmosphere/cache/HeaderBroadcasterCache.java b/modules/cpr/src/main/java/org/atmosphere/cache/HeaderBroadcasterCache.java
index 2902587..0f0f656 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cache/HeaderBroadcasterCache.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cache/HeaderBroadcasterCache.java
@@ -39,7 +39,7 @@
     @Override
     public void addToCache(String broadcasterId, AtmosphereResource r, Message e) {
 
-        long now = System.currentTimeMillis();
+        long now = System.nanoTime();
         put(e, now);
 
         if (r != null) {
@@ -55,7 +55,7 @@
 
         AtmosphereRequest request = r.getRequest();
         String cacheHeader = request.getHeader(X_CACHE_DATE);
-        r.getResponse().setHeader(X_CACHE_DATE, String.valueOf(System.currentTimeMillis()));
+        r.getResponse().setHeader(X_CACHE_DATE, String.valueOf(System.nanoTime()));
         if (cacheHeader == null || cacheHeader.isEmpty()) {
             return Collections.emptyList();
         }
