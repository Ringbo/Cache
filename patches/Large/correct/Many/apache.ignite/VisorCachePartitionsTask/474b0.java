diff --git a/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCachePartitionsTask.java b/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCachePartitionsTask.java
index 80836c6..9cee477 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCachePartitionsTask.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/visor/cache/VisorCachePartitionsTask.java
@@ -126,7 +126,7 @@
                         for (GridDhtLocalPartition part : locParts) {
                             int p = part.id();
 
-                            int sz = part.size();
+                            int sz = part.publicSize();
 
                             // Pass -1 as topology version in order not to wait for topology version.
                             if (part.primary(AffinityTopologyVersion.NONE))
