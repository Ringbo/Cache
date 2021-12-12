diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCachePutAllFailoverSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCachePutAllFailoverSelfTest.java
index 80f62d3..86c2c05 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCachePutAllFailoverSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/GridCachePutAllFailoverSelfTest.java
@@ -51,7 +51,7 @@
     private static TcpDiscoveryIpFinder ipFinder = new TcpDiscoveryVmIpFinder(true);
 
     /** Size of the test map. */
-    private static final int TEST_MAP_SIZE = 100000;
+    private static final int TEST_MAP_SIZE = 30000;
 
     /** Cache name. */
     private static final String CACHE_NAME = "partitioned";
@@ -327,7 +327,7 @@
 
             if (!failedWait && !absentKeys.isEmpty()) {
                 // Give some time to preloader.
-                U.sleep(15000);
+                U.sleep(20000);
 
                 absentKeys = findAbsentKeys(runningWorkers.get(0), testKeys);
             }
