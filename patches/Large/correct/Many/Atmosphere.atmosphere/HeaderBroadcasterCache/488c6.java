diff --git a/modules/cpr/src/main/java/org/atmosphere/cache/HeaderBroadcasterCache.java b/modules/cpr/src/main/java/org/atmosphere/cache/HeaderBroadcasterCache.java
index d94b04b..1831378 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cache/HeaderBroadcasterCache.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cache/HeaderBroadcasterCache.java
@@ -42,7 +42,7 @@
         long now = System.nanoTime();
         CacheMessage cacheMessage = put(e, now, uuid);
 
-        if (uuid.equals(NULL)) {
+        if (!uuid.equals(NULL)) {
             AtmosphereResourceFactory.getDefault().find(uuid).getResponse().setHeader(X_CACHE_DATE, String.valueOf(now));
         }
         return cacheMessage;
