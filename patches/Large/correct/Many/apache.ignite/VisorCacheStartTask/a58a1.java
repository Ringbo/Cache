diff --git a/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCacheStartTask.java b/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCacheStartTask.java
index 75cd1a9..758f39a 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCacheStartTask.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCacheStartTask.java
@@ -139,12 +139,12 @@
                 if (arg.near) {
                     NearCacheConfiguration nearCfg = Ignition.loadSpringBean(bais, "nearCacheConfiguration");
 
-                    ignite.createNearCache(VisorTaskUtils.unescapeName(arg.name()), nearCfg);
+                    ignite.getOrCreateNearCache(VisorTaskUtils.unescapeName(arg.name()), nearCfg);
                 }
                 else {
                     CacheConfiguration cacheCfg = Ignition.loadSpringBean(bais, "cacheConfiguration");
 
-                    ignite.createCache(cacheCfg);
+                    ignite.getOrCreateCache(cacheCfg);
                 }
             }
             catch (IOException e) {
