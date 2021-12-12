diff --git a/modules/apps/foundation/portal-cache/portal-cache/src/main/java/com/liferay/portal/cache/internal/dao/orm/EntityCacheImpl.java b/modules/apps/foundation/portal-cache/portal-cache/src/main/java/com/liferay/portal/cache/internal/dao/orm/EntityCacheImpl.java
index 1abf69143..ea6396b 100644
--- a/modules/apps/foundation/portal-cache/portal-cache/src/main/java/com/liferay/portal/cache/internal/dao/orm/EntityCacheImpl.java
+++ b/modules/apps/foundation/portal-cache/portal-cache/src/main/java/com/liferay/portal/cache/internal/dao/orm/EntityCacheImpl.java
@@ -372,7 +372,7 @@
 			_localCacheAvailable = true;
 
 			_localCache = new CentralizedThreadLocal<>(
-				FinderCacheImpl.class + "._localCache",
+				EntityCacheImpl.class + "._localCache",
 				() -> new LRUMap(localCacheMaxSize));
 		}
 		else {
