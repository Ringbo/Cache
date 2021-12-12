diff --git a/modules/core/src/main/java/org/gridgain/grid/kernal/GridKernal.java b/modules/core/src/main/java/org/gridgain/grid/kernal/GridKernal.java
index ce669ab..91bb60b 100644
--- a/modules/core/src/main/java/org/gridgain/grid/kernal/GridKernal.java
+++ b/modules/core/src/main/java/org/gridgain/grid/kernal/GridKernal.java
@@ -585,7 +585,7 @@
         // Run background network diagnostics.
         GridDiagnostic.runBackgroundCheck(gridName, cfg.getExecutorService(), log);
 
-        boolean notifyEnabled = GridSystemProperties.getBoolean(GG_UPDATE_NOTIFIER);
+        boolean notifyEnabled = GridSystemProperties.getBoolean(GG_UPDATE_NOTIFIER, true);
 
         GridUpdateNotifier verChecker0 = null;
 
