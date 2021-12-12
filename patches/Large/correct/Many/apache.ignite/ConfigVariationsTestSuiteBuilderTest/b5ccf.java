diff --git a/modules/core/src/test/java/org/apache/ignite/testframework/test/ConfigVariationsTestSuiteBuilderTest.java b/modules/core/src/test/java/org/apache/ignite/testframework/test/ConfigVariationsTestSuiteBuilderTest.java
index d237345..6ef9eb8 100644
--- a/modules/core/src/test/java/org/apache/ignite/testframework/test/ConfigVariationsTestSuiteBuilderTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/testframework/test/ConfigVariationsTestSuiteBuilderTest.java
@@ -41,7 +41,7 @@
         TestSuite dfltCacheSuite = new ConfigVariationsTestSuiteBuilder("testSuite", NoopTest.class)
             .withBasicCacheParams().build();
 
-        assertEquals(4 * 12, dfltCacheSuite.countTestCases());
+        assertEquals(4 * 4, dfltCacheSuite.countTestCases());
 
         // With clients.
         dfltSuite = new ConfigVariationsTestSuiteBuilder("testSuite", NoopTest.class)
@@ -52,7 +52,7 @@
         dfltCacheSuite = new ConfigVariationsTestSuiteBuilder("testSuite", NoopTest.class)
             .withBasicCacheParams().testedNodesCount(3).withClients().build();
 
-        assertEquals(4 * 12 * 3, dfltCacheSuite.countTestCases());
+        assertEquals(4 * 4 * 3, dfltCacheSuite.countTestCases());
     }
 
     /**
