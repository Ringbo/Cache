diff --git a/modules/cpr/src/main/java/org/atmosphere/interceptor/AtmosphereResourceStateRecovery.java b/modules/cpr/src/main/java/org/atmosphere/interceptor/AtmosphereResourceStateRecovery.java
index ac22130..23ff78b 100644
--- a/modules/cpr/src/main/java/org/atmosphere/interceptor/AtmosphereResourceStateRecovery.java
+++ b/modules/cpr/src/main/java/org/atmosphere/interceptor/AtmosphereResourceStateRecovery.java
@@ -253,7 +253,7 @@
                 cache = b.getBroadcasterConfig().getBroadcasterCache();
                 List<Object> t = cache.retrieveFromCache(b.getID(), r);
 
-                t = b.getBroadcasterConfig().applyFilters(r, t);
+                cachedMessages = b.getBroadcasterConfig().applyFilters(r, t);
                 if (t.size() > 0) {
                     logger.trace("Found Cached Messages For AtmosphereResource {} with Broadcaster {}", r.uuid(), broadcasterID);
                     cachedMessages.addAll(t);
