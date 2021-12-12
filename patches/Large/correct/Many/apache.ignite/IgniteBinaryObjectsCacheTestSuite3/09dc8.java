diff --git a/modules/core/src/test/java/org/apache/ignite/testsuites/IgniteBinaryObjectsCacheTestSuite3.java b/modules/core/src/test/java/org/apache/ignite/testsuites/IgniteBinaryObjectsCacheTestSuite3.java
index bb29572..843245f 100644
--- a/modules/core/src/test/java/org/apache/ignite/testsuites/IgniteBinaryObjectsCacheTestSuite3.java
+++ b/modules/core/src/test/java/org/apache/ignite/testsuites/IgniteBinaryObjectsCacheTestSuite3.java
@@ -61,7 +61,7 @@
         GridTestProperties.setProperty(GridTestProperties.ENTRY_PROCESSOR_CLASS_NAME,
             "org.apache.ignite.tests.p2p.CacheDeploymentBinaryEntryProcessor");
 
-        List<Class<?>> suite = new ArrayList<>();
+        List<Class<?>> suite = new ArrayList<>(IgniteCacheTestSuite3.suite(ignoredTests));
 
         GridTestUtils.addTestIfNeeded(suite,GridCacheBinaryAtomicEntryProcessorDeploymentSelfTest.class, ignoredTests);
         GridTestUtils.addTestIfNeeded(suite,GridCacheBinaryTransactionalEntryProcessorDeploymentSelfTest.class, ignoredTests);
