diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/GridKernal.java b/modules/core/src/main/java/org/gridgain/grid/kernal/GridKernal.java
index cdbe8a3..6b20628 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/GridKernal.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/GridKernal.java
@@ -685,7 +685,8 @@
             startProcessor(ctx, new GridStreamProcessor(ctx), attrs);
             startProcessor(ctx, (GridProcessor)GGFS.create(ctx, F.isEmpty(cfg.getGgfsConfiguration())), attrs);
             startProcessor(ctx, new GridContinuousProcessor(ctx), attrs);
-            startProcessor(ctx, (GridProcessor)(cfg.isPeerClassLoadingEnabled() ? GridComponentType.HADOOP.create(true):
+            startProcessor(ctx, (GridProcessor)(cfg.isPeerClassLoadingEnabled() ?
+                GridComponentType.HADOOP.create(ctx, true): // No-op when peer class loading is enabled.
                 GridComponentType.HADOOP.createIfInClassPath(ctx, cfg.getHadoopConfiguration() != null)), attrs);
             startProcessor(ctx, createComponent(GridDrProcessor.class, ctx), attrs);
 
