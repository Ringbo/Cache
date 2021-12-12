diff --git a/portal-impl/src/com/liferay/portal/cache/ehcache/LockBasedMVCCEhcachePortalCache.java b/portal-impl/src/com/liferay/portal/cache/ehcache/LockBasedMVCCEhcachePortalCache.java
index 8bd1f61..d654391 100644
--- a/portal-impl/src/com/liferay/portal/cache/ehcache/LockBasedMVCCEhcachePortalCache.java
+++ b/portal-impl/src/com/liferay/portal/cache/ehcache/LockBasedMVCCEhcachePortalCache.java
@@ -72,7 +72,7 @@
 
 		Element newElement = new Element(key, value);
 
-		if (timeToLive >= 0) {
+		if (timeToLive > 0) {
 			newElement.setTimeToLive(timeToLive);
 		}
 
