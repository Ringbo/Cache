diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorSwapBackupsCachesTask.java b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorSwapBackupsCachesTask.java
index 94e1b5d..fde5648 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorSwapBackupsCachesTask.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/visor/cmd/tasks/VisorSwapBackupsCachesTask.java
@@ -42,7 +42,7 @@
         protected VisorNamedBeforeAfterTaskResult run(VisorOneNodeNamesArg arg) throws GridException {
             VisorNamedBeforeAfterTaskResult total = new VisorNamedBeforeAfterTaskResult();
 
-            for (GridCache c: g.cachesx(null)) {
+            for (GridCache c: g.cachesx()) {
                 String cacheName = c.name();
 
                 if (arg.names().contains(cacheName)) {
