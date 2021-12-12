diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/IgniteCacheDatabaseSharedManager.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/IgniteCacheDatabaseSharedManager.java
index 1c25724..91f1f63 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/IgniteCacheDatabaseSharedManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/IgniteCacheDatabaseSharedManager.java
@@ -189,7 +189,7 @@
 
         int concLvl = dbCfg.getConcurrencyLevel();
 
-        if (concLvl < 2)
+        if (concLvl < 1)
             concLvl = Runtime.getRuntime().availableProcessors();
 
         long fragmentSize = dbCfg.getPageCacheSize() / concLvl;
