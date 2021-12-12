diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridDrSenderCacheMetricsAdapter.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridDrSenderCacheMetricsAdapter.java
index 4104cd1..ebddfbb 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridDrSenderCacheMetricsAdapter.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridDrSenderCacheMetricsAdapter.java
@@ -42,7 +42,7 @@
     private volatile long backupQueueSize;
 
     /** Reason of replication pause. */
-    private volatile GridDrPause pause;
+    private volatile GridDrStatus pause;
 
     /**
      * No-args constructor.
@@ -101,7 +101,7 @@
     }
 
     /** {@inheritDoc} */
-    @Nullable @Override public GridDrPause pauseState() {
+    @Nullable @Override public GridDrStatus pauseState() {
         return pause;
     }
 
@@ -161,7 +161,7 @@
     public void onPauseStateChanged(@Nullable GridDrPauseReason pauseReason, @Nullable String errMsg) {
         assert pauseReason == null && errMsg == null || pauseReason != null;
 
-        this.pause = pauseReason != null ? new GridDrPause(pauseReason, errMsg) : null;
+        this.pause = pauseReason != null ? new GridDrStatus(pauseReason, errMsg) : null;
     }
 
     /**
@@ -198,7 +198,7 @@
         entriesAcked.add(in.readLong());
         batchesFailed.add(in.readInt());
         backupQueueSize = in.readLong();
-        pause = (GridDrPause)in.readObject();
+        pause = (GridDrStatus)in.readObject();
     }
 
     /** {@inheritDoc} */
