diff --git a/flume-ng-node/src/main/java/org/apache/flume/conf/file/AbstractFileConfigurationProvider.java b/flume-ng-node/src/main/java/org/apache/flume/conf/file/AbstractFileConfigurationProvider.java
index 64f4e35..15ee8ad 100644
--- a/flume-ng-node/src/main/java/org/apache/flume/conf/file/AbstractFileConfigurationProvider.java
+++ b/flume-ng-node/src/main/java/org/apache/flume/conf/file/AbstractFileConfigurationProvider.java
@@ -69,8 +69,7 @@
     Preconditions.checkState(file != null,
         "The parameter file must not be null");
 
-    executorService = Executors
-        .newScheduledThreadPool(1,
+    executorService = Executors.newSingleThreadScheduledExecutor(
             new ThreadFactoryBuilder().setNameFormat("conf-file-poller-%d")
                 .build());
 
@@ -79,7 +78,7 @@
     fileWatcherRunnable.file = file;
     fileWatcherRunnable.counterGroup = counterGroup;
 
-    executorService.scheduleAtFixedRate(fileWatcherRunnable, 0, 30,
+    executorService.scheduleWithFixedDelay(fileWatcherRunnable, 0, 30,
         TimeUnit.SECONDS);
 
     lifecycleState = LifecycleState.START;
