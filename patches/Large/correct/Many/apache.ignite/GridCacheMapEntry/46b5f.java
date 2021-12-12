diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
index 04b2745..a110af2 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCacheMapEntry.java
@@ -1670,7 +1670,7 @@
 
                             if (entry.modified()) {
                                 writeObj0 = cctx.unwrapTemporary(entry.getValue());
-                                writeObj = cctx.toCacheObject(updated0);
+                                writeObj = cctx.toCacheObject(writeObj0);
                             }
                             else {
                                 writeObj = oldVal;
