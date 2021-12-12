diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/CacheLateAffinityAssignmentTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/CacheLateAffinityAssignmentTest.java
index 95e9479..7f2a5d0 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/CacheLateAffinityAssignmentTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/distributed/CacheLateAffinityAssignmentTest.java
@@ -184,7 +184,7 @@
 
         MemoryConfiguration cfg1 = new MemoryConfiguration();
 
-        cfg1.setDefaultMemoryPolicySize(100 * 1024 * 1024L);
+        cfg1.setDefaultMemoryPolicySize(150 * 1024 * 1024L);
 
         cfg.setMemoryConfiguration(cfg1);
 
