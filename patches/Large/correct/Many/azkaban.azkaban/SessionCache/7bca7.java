diff --git a/src/java/azkaban/webapp/session/SessionCache.java b/src/java/azkaban/webapp/session/SessionCache.java
index be76c55..514606a 100644
--- a/src/java/azkaban/webapp/session/SessionCache.java
+++ b/src/java/azkaban/webapp/session/SessionCache.java
@@ -33,7 +33,7 @@
  */
 public class SessionCache {
 	private static final int MAX_NUM_SESSIONS = 10000;
-	private static final int SESSION_TIME_TO_LIVE = 10000;
+	private static final long SESSION_TIME_TO_LIVE = 24*60*60*1000L;
 //	private CacheManager manager = CacheManager.create();
 	private Cache cache;
 
@@ -48,7 +48,7 @@
 		cache = manager.createCache();
 		cache.setEjectionPolicy(EjectionPolicy.LRU);
 		cache.setMaxCacheSize(props.getInt("max.num.sessions", MAX_NUM_SESSIONS));
-		cache.setExpiryTimeToLiveMs(props.getInt("session.time.to.live", SESSION_TIME_TO_LIVE));
+		cache.setExpiryTimeToLiveMs(props.getLong("session.time.to.live", SESSION_TIME_TO_LIVE));
 	}
 
 	/**
