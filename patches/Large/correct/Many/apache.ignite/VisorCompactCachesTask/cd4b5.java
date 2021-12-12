diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorCompactCachesTask.java b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorCompactCachesTask.java
index ad6645f..1f48da2 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorCompactCachesTask.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorCompactCachesTask.java
@@ -36,7 +36,7 @@
         @Override protected VisorNamedBeforeAfterTaskResult run(VisorOneNodeNamesArg arg) throws GridException {
             final VisorNamedBeforeAfterTaskResult res = new VisorNamedBeforeAfterTaskResult();
 
-            for(GridCache cache : g.cachesx(null)) {
+            for(GridCache cache : g.cachesx()) {
                 String cacheName = cache.name();
 
                 if (arg.names().contains(cacheName)) {
