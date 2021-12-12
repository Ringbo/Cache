diff --git a/platform/platform-impl/src/com/intellij/openapi/project/CacheUpdateRunner.java b/platform/platform-impl/src/com/intellij/openapi/project/CacheUpdateRunner.java
index d32d11b..cd77bde 100644
--- a/platform/platform-impl/src/com/intellij/openapi/project/CacheUpdateRunner.java
+++ b/platform/platform-impl/src/com/intellij/openapi/project/CacheUpdateRunner.java
@@ -136,7 +136,7 @@
     try {
       int threadsCount = Registry.intValue("caches.indexerThreadsCount");
       if (threadsCount == -1) {
-        threadsCount = Math.min(Runtime.getRuntime().availableProcessors(), ApplicationManager.getApplication().isUnitTestMode() ? 4 : 2);
+        threadsCount = Math.min(Runtime.getRuntime().availableProcessors(), ApplicationManager.getApplication().isUnitTestMode() ? 1 : 2);
       }
       if (threadsCount == 1) {
         Runnable process = new MyRunnable(innerIndicator, queue, isFinished, progressUpdater, processInReadAction, application);
