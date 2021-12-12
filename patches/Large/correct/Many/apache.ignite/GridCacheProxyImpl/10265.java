diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProxyImpl.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProxyImpl.java
index 2469190..d84434e 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProxyImpl.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/GridCacheProxyImpl.java
@@ -1866,7 +1866,7 @@
     }
 
     /** {@inheritDoc} */
-    @Override public Collection<GridDrStateTransfer> drListStateTransfers() {
+    @Override public Collection<GridDrStateTransferDescriptor> drListStateTransfers() {
         GridCacheProjectionImpl<K, V> prev = gate.enter(prj);
 
         try {
@@ -1902,7 +1902,7 @@
     }
 
     /** {@inheritDoc} */
-    @Nullable @Override public GridDrPause drPauseState() {
+    @Nullable @Override public GridDrStatus drPauseState() {
         GridCacheProjectionImpl<K, V> prev = gate.enter(prj);
 
         try {
