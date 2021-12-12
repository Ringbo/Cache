diff --git a/servers/src/main/java/tachyon/master/lineage/recompute/RecomputeExecutor.java b/servers/src/main/java/tachyon/master/lineage/recompute/RecomputeExecutor.java
index 538e0fe..23ef45f 100644
--- a/servers/src/main/java/tachyon/master/lineage/recompute/RecomputeExecutor.java
+++ b/servers/src/main/java/tachyon/master/lineage/recompute/RecomputeExecutor.java
@@ -65,7 +65,7 @@
 
   @Override
   public void close() {
-    mFixedExecutionService.shutdown();
+    mRecomputeLauncherService.shutdown();
   }
 
   /**
