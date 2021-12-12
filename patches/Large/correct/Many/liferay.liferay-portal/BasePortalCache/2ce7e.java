diff --git a/portal-service/src/com/liferay/portal/kernel/cache/BasePortalCache.java b/portal-service/src/com/liferay/portal/kernel/cache/BasePortalCache.java
index e042bcb..ae361e6 100644
--- a/portal-service/src/com/liferay/portal/kernel/cache/BasePortalCache.java
+++ b/portal-service/src/com/liferay/portal/kernel/cache/BasePortalCache.java
@@ -34,7 +34,7 @@
 
 	protected String processKey(String key) {
 		if (!_debug && (key.length() > _CACHE_KEY_LENGTH_THRESHOLD)) {
-			return StringUtil.valueOf(key.hashCode());
+			return StringUtil.toHexString(key.hashCode());
 		}
 		else {
 			return key;
