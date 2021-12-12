diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/persistence/IgnitePdsCacheRebalancingAbstractTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/persistence/IgnitePdsCacheRebalancingAbstractTest.java
index 2d237cb..96f832b 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/persistence/IgnitePdsCacheRebalancingAbstractTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/persistence/IgnitePdsCacheRebalancingAbstractTest.java
@@ -120,7 +120,7 @@
         MemoryPolicyConfiguration memPlcCfg = new MemoryPolicyConfiguration();
 
         memPlcCfg.setName("dfltMemPlc");
-        memPlcCfg.setMaxSize(100 * 1024 * 1024);
+        memPlcCfg.setMaxSize(150 * 1024 * 1024);
         memPlcCfg.setInitialSize(100 * 1024 * 1024);
         memPlcCfg.setSwapFilePath("work/swap");
 
