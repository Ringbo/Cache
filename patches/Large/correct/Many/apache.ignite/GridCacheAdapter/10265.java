diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheAdapter.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheAdapter.java
index 1406b30..b32793d 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheAdapter.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheAdapter.java
@@ -3845,7 +3845,7 @@
     }
 
     /** {@inheritDoc} */
-    @Override public Collection<GridDrStateTransfer> drListStateTransfers() {
+    @Override public Collection<GridDrStateTransferDescriptor> drListStateTransfers() {
         checkDrEnabled();
 
         try {
@@ -3881,7 +3881,7 @@
     }
 
     /** {@inheritDoc} */
-    @Nullable @Override public GridDrPause drPauseState() {
+    @Nullable @Override public GridDrStatus drPauseState() {
         checkDrEnabled();
 
         return ctx.dr().drPauseState();
