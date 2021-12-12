diff --git a/portal-ejb/src/com/liferay/portal/servlet/filters/layoutcache/LayoutCacheFilter.java b/portal-ejb/src/com/liferay/portal/servlet/filters/layoutcache/LayoutCacheFilter.java
index e48454bb..065a719 100644
--- a/portal-ejb/src/com/liferay/portal/servlet/filters/layoutcache/LayoutCacheFilter.java
+++ b/portal-ejb/src/com/liferay/portal/servlet/filters/layoutcache/LayoutCacheFilter.java
@@ -141,7 +141,7 @@
 
 				Map headers = data.getHeaders();
 
-				Iterator itr = headers.keySet().itrator();
+				Iterator itr = headers.keySet().iterator();
 
 				while (itr.hasNext()) {
 					String headerKey = (String)itr.next();
