diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProjectionEx.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProjectionEx.java
index 8afcc0d..3ab10ef 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProjectionEx.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProjectionEx.java
@@ -378,7 +378,7 @@
      *
      * @return Collection of currently active state transfers.
      */
-    public Collection<GridDrStateTransfer> drListStateTransfers();
+    public Collection<GridDrStateTransferDescriptor> drListStateTransfers();
 
     /**
      * Pauses data center replication for this cache.
@@ -395,5 +395,5 @@
      *
      * @return DR pause state.
      */
-    @Nullable public GridDrPause drPauseState();
+    @Nullable public GridDrStatus drPauseState();
 }
