diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/dr/GridCacheDrManager.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/dr/GridCacheDrManager.java
index d9723ad..19c6488 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/dr/GridCacheDrManager.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/dr/GridCacheDrManager.java
@@ -59,7 +59,7 @@
      * @return List of currently active state transfers.
      * @throws GridException If failed.
      */
-    public Collection<GridDrStateTransfer> listStateTransfers() throws GridException;
+    public Collection<GridDrStateTransferDescriptor> listStateTransfers() throws GridException;
 
     /**
      * Pauses data center replication.
@@ -80,7 +80,7 @@
      *
      * @return DR pause state.
      */
-    @Nullable public GridDrPause drPauseState();
+    public GridDrStatus drPauseState();
 
     /**
      * @return Count of keys enqueued for data center replication.
