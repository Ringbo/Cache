diff --git a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
index ccf4d92..32a0d97 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/IgniteKernal.java
@@ -751,7 +751,7 @@
             startProcessor(new GridTaskProcessor(ctx));
             startProcessor((GridProcessor)SCHEDULE.createOptional(ctx));
             startProcessor(new GridRestProcessor(ctx));
-            startProcessor(new GridDataLoaderProcessor(ctx));
+            startProcessor(new IgniteDataStreamerProcessor(ctx));
             startProcessor(new GridStreamProcessor(ctx));
             startProcessor((GridProcessor) IGFS.create(ctx, F.isEmpty(cfg.getFileSystemConfiguration())));
             startProcessor(new GridContinuousProcessor(ctx));
