diff --git a/portal-impl/src/com/liferay/portal/cache/ehcache/EhcacheListenerFactory.java b/portal-impl/src/com/liferay/portal/cache/ehcache/EhcacheListenerFactory.java
index 7249f96..cd0f614 100644
--- a/portal-impl/src/com/liferay/portal/cache/ehcache/EhcacheListenerFactory.java
+++ b/portal-impl/src/com/liferay/portal/cache/ehcache/EhcacheListenerFactory.java
@@ -121,7 +121,7 @@
 					cacheEventListener);
 		}
 
-		return new EhcacheCacheListenerAdapter<Serializable, Serializable>(
+		return new EhcacheCacheListenerAdapter<Serializable, Object>(
 			cacheEventListener);
 	}
 
