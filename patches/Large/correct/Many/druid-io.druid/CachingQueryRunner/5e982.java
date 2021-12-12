diff --git a/server/src/main/java/io/druid/client/CachingQueryRunner.java b/server/src/main/java/io/druid/client/CachingQueryRunner.java
index d92db64..ad2718e 100644
--- a/server/src/main/java/io/druid/client/CachingQueryRunner.java
+++ b/server/src/main/java/io/druid/client/CachingQueryRunner.java
@@ -82,7 +82,7 @@
 
     final boolean useCache = query.getContextUseCache(true)
         && strategy != null
-        && cacheConfig.isPopulateCache();
+        && cacheConfig.isUseCache();
 
     final Cache.NamedKey key;
     if(strategy != null && (useCache || populateCache)) {
