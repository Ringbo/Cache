diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheExchangeMessageDuplicatedStateTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheExchangeMessageDuplicatedStateTest.java
index ed186ac..ac7222a 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheExchangeMessageDuplicatedStateTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheExchangeMessageDuplicatedStateTest.java
@@ -93,25 +93,25 @@
         {
             CacheConfiguration ccfg = new CacheConfiguration();
             ccfg.setName(AFF1_CACHE1);
-            ccfg.setAffinity(new RendezvousAffinityFunction());
+            ccfg.setAffinity(new RendezvousAffinityFunction(false,512));
             ccfgs.add(ccfg);
         }
         {
             CacheConfiguration ccfg = new CacheConfiguration();
             ccfg.setName(AFF1_CACHE2);
-            ccfg.setAffinity(new RendezvousAffinityFunction());
+            ccfg.setAffinity(new RendezvousAffinityFunction(false,512));
             ccfgs.add(ccfg);
         }
         {
             CacheConfiguration ccfg = new CacheConfiguration();
             ccfg.setName(AFF2_CACHE1);
-            ccfg.setAffinity(new FairAffinityFunction());
+            ccfg.setAffinity(new FairAffinityFunction(false,512));
             ccfgs.add(ccfg);
         }
         {
             CacheConfiguration ccfg = new CacheConfiguration();
             ccfg.setName(AFF2_CACHE2);
-            ccfg.setAffinity(new FairAffinityFunction());
+            ccfg.setAffinity(new FairAffinityFunction(false,512));
             ccfgs.add(ccfg);
         }
         {
