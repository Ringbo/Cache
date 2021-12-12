diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
index 9f9b5c5..90d4c4a 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
@@ -1881,7 +1881,7 @@
                     key,
                     evtNodeId,
                     null,
-                    newVer,
+                    updateVer,
                     EVT_CACHE_OBJECT_READ,
                     evtOld, evtOld != null,
                     evtOld, evtOld != null,
@@ -1908,7 +1908,7 @@
                         key,
                         evtNodeId,
                         null,
-                        newVer,
+                        updateVer,
                         EVT_CACHE_OBJECT_PUT,
                         updateVal,
                         true,
@@ -1925,7 +1925,7 @@
 
                 clearReaders();
 
-                drReplicate(drType, null, newVer, topVer);
+                drReplicate(drType, null, updateVer, topVer);
 
                 recordNodeId(affNodeId, topVer);
 
@@ -1936,7 +1936,8 @@
                     cctx.events().addEvent(partition(),
                         key,
                         evtNodeId,
-                        null, newVer,
+                        null,
+                        updateVer,
                         EVT_CACHE_OBJECT_REMOVED,
                         null, false,
                         evtOld, evtOld != null,
