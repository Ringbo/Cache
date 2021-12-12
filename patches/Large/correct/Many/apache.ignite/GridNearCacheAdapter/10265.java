diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridNearCacheAdapter.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridNearCacheAdapter.java
index d3d5bde..6a024a2 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridNearCacheAdapter.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/distributed/near/GridNearCacheAdapter.java
@@ -654,7 +654,7 @@
     }
 
     /** {@inheritDoc} */
-    @Override public Collection<GridDrStateTransfer> drListStateTransfers() {
+    @Override public Collection<GridDrStateTransferDescriptor> drListStateTransfers() {
         return dht().drListStateTransfers();
     }
 
@@ -669,7 +669,7 @@
     }
 
     /** {@inheritDoc} */
-    @Nullable @Override public GridDrPause drPauseState() {
+    @Nullable @Override public GridDrStatus drPauseState() {
         return dht().drPauseState();
     }
 
