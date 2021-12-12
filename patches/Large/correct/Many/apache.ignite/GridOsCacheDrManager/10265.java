diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/dr/os/GridOsCacheDrManager.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/dr/os/GridOsCacheDrManager.java
index d0bcc08..c73b7f8 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/dr/os/GridOsCacheDrManager.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/dr/os/GridOsCacheDrManager.java
@@ -68,7 +68,7 @@
     }
 
     /** {@inheritDoc} */
-    @Override public Collection<GridDrStateTransfer> listStateTransfers() throws GridException {
+    @Override public Collection<GridDrStateTransferDescriptor> listStateTransfers() throws GridException {
         return null;
     }
 
@@ -83,7 +83,7 @@
     }
 
     /** {@inheritDoc} */
-    @Nullable @Override public GridDrPause drPauseState() {
+    @Override public GridDrStatus drPauseState() {
         return null;
     }
 
