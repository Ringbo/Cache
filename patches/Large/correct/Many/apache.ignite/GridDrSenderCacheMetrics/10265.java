diff --git a/modules/core/java/org/gridgain/grid/dr/cache/sender/GridDrSenderCacheMetrics.java b/modules/core/java/org/gridgain/grid/dr/cache/sender/GridDrSenderCacheMetrics.java
index b1ba517..3cf9809 100644
--- a/modules/core/java/org/gridgain/grid/dr/cache/sender/GridDrSenderCacheMetrics.java
+++ b/modules/core/java/org/gridgain/grid/dr/cache/sender/GridDrSenderCacheMetrics.java
@@ -72,5 +72,5 @@
      *
      * @return Data center replication pause state {@code null} if replication is not paused.
      */
-    @Nullable public GridDrPause pauseState();
+    @Nullable public GridDrStatus pauseState();
 }
