diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheAffinityCallSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheAffinityCallSelfTest.java
index 90160e1..e107c21 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheAffinityCallSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/CacheAffinityCallSelfTest.java
@@ -145,9 +145,9 @@
 
         startGrid(0);
 
-        stopGrid(SERVERS_COUNT);
+        U.sleep(3000);
 
-        stopGrid(0);
+        stopAllGrids();
     }
 
     /**
