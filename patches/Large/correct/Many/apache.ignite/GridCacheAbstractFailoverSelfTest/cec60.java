diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFailoverSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFailoverSelfTest.java
index de1848f..26f7529 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFailoverSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCacheAbstractFailoverSelfTest.java
@@ -78,7 +78,7 @@
         IgniteConfiguration cfg = super.getConfiguration(igniteInstanceName);
 
         cfg.setNetworkTimeout(60_000);
-        cfg.setMetricsUpdateFrequency(30_000);
+        cfg.setMetricsUpdateFrequency(5_000);
 
         TcpDiscoverySpi discoSpi = (TcpDiscoverySpi)cfg.getDiscoverySpi();
 
