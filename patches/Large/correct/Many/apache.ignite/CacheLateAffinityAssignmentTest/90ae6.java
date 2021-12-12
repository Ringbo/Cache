diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/CacheLateAffinityAssignmentTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/CacheLateAffinityAssignmentTest.java
index 664f2ee..4fb17e8 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/CacheLateAffinityAssignmentTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/CacheLateAffinityAssignmentTest.java
@@ -1280,7 +1280,7 @@
 
         client.destroyCache(CACHE_NAME2);
 
-        checkAffinity(4, topVer(4, 2), true);
+        checkAffinity(4, topVer(4, 3), true);
     }
 
     /**
