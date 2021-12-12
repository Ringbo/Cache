diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorClearCachesTask.java b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorClearCachesTask.java
index 63f586b..e71d2d8 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorClearCachesTask.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorClearCachesTask.java
@@ -41,7 +41,7 @@
         @Override protected VisorNamedBeforeAfterTaskResult run(VisorOneNodeNamesArg arg) throws GridException {
             VisorNamedBeforeAfterTaskResult res = new VisorNamedBeforeAfterTaskResult();
 
-            for(GridCache cache : g.cachesx(null)) {
+            for(GridCache cache : g.cachesx()) {
                 String cacheName = cache.name();
 
                 if (arg.names().contains(cacheName)) {
