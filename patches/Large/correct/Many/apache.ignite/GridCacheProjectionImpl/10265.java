diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProjectionImpl.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProjectionImpl.java
index 20be7f3..c6fc576 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProjectionImpl.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProjectionImpl.java
@@ -1171,7 +1171,7 @@
     }
 
     /** {@inheritDoc} */
-    @Override public Collection<GridDrStateTransfer> drListStateTransfers() {
+    @Override public Collection<GridDrStateTransferDescriptor> drListStateTransfers() {
         return cache.drListStateTransfers();
     }
 
@@ -1186,7 +1186,7 @@
     }
 
     /** {@inheritDoc} */
-    @Nullable @Override public GridDrPause drPauseState() {
+    @Nullable @Override public GridDrStatus drPauseState() {
         return cache.drPauseState();
     }
 
