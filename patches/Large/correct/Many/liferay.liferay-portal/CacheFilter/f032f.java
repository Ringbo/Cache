diff --git a/portal-impl/src/com/liferay/portal/servlet/filters/cache/CacheFilter.java b/portal-impl/src/com/liferay/portal/servlet/filters/cache/CacheFilter.java
index 99dac9f..775f9b3 100644
--- a/portal-impl/src/com/liferay/portal/servlet/filters/cache/CacheFilter.java
+++ b/portal-impl/src/com/liferay/portal/servlet/filters/cache/CacheFilter.java
@@ -89,7 +89,7 @@
 	}
 
 	protected String getCacheKey(HttpServletRequest request) {
-		StringBundler sb = new StringBundler(13);
+		StringBundler sb = new StringBundler(9);
 
 		// Url
 
