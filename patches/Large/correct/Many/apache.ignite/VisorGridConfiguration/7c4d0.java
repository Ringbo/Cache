diff --git a/modules/core/src/main/java/org/apache/ignite/internal/visor/node/VisorGridConfiguration.java b/modules/core/src/main/java/org/apache/ignite/internal/visor/node/VisorGridConfiguration.java
index 180a729..a716a76 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/visor/node/VisorGridConfiguration.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/visor/node/VisorGridConfiguration.java
@@ -165,7 +165,7 @@
         BinaryConfiguration bc = c.getBinaryConfiguration();
 
         if (bc != null)
-            binaryCfg = new VisorBinaryConfiguration();
+            binaryCfg = new VisorBinaryConfiguration(bc);
 
         cacheKeyCfgs = VisorCacheKeyConfiguration.list(c.getCacheKeyConfiguration());
 
