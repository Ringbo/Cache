diff --git a/modules/cpr/src/main/java/org/atmosphere/cache/EventCacheBroadcasterCache.java b/modules/cpr/src/main/java/org/atmosphere/cache/EventCacheBroadcasterCache.java
index c6d47d9..1af9a45 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cache/EventCacheBroadcasterCache.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cache/EventCacheBroadcasterCache.java
@@ -130,7 +130,7 @@
     }
 
     protected void invalidateExpiredEntries() {
-        long now = System.nanoTime();
+        long now = System.currentTimeMillis();
         synchronized (messages) {
 
             Set<String> inactiveClients = new HashSet<String>();
@@ -177,7 +177,7 @@
             logger.debug("Active clients {}", activeClients());
         }
 
-        long now = System.nanoTime();
+        long now = System.currentTimeMillis();
         String messageId = UUID.randomUUID().toString();
         CacheMessage cacheMessage = new CacheMessage(messageId, e);
         synchronized (messages) {
@@ -272,7 +272,7 @@
     @Override
     public List<Object> retrieveFromCache(String broadcasterId, AtmosphereResource r) {
         String clientId = r.uuid();
-        long now = System.nanoTime();
+        long now = System.currentTimeMillis();
 
         List<Object> result = new ArrayList<Object>();
 
