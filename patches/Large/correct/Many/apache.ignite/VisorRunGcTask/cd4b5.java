diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorRunGcTask.java b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorRunGcTask.java
index 5534504..e9095d4 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorRunGcTask.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorRunGcTask.java
@@ -75,7 +75,7 @@
             System.gc();
 
             if (arg.dgc)
-                for (GridCache<?, ?> cache : g.cachesx(null))
+                for (GridCache<?, ?> cache : g.cachesx())
                     cache.dgc();
 
             return new VisorBeforeAfterResult(before, freeHeap(locNode));
