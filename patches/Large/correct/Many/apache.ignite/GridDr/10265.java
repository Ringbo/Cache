diff --git a/modules/core/java/org/gridgain/grid/dr/GridDr.java b/modules/core/java/org/gridgain/grid/dr/GridDr.java
index e212f09..2b56a75 100644
--- a/modules/core/java/org/gridgain/grid/dr/GridDr.java
+++ b/modules/core/java/org/gridgain/grid/dr/GridDr.java
@@ -81,7 +81,7 @@
      * @param cacheName Cache name.
      * @return All currently active state transfers.
      */
-    public Collection<GridDrStateTransfer> senderCacheDrListStateTransfers(String cacheName);
+    public Collection<GridDrStateTransferDescriptor> senderCacheDrListStateTransfers(String cacheName);
 
     /**
      * Pauses data center replication for particular sender cache.
@@ -106,16 +106,16 @@
     public void senderCacheDrResume(String cacheName);
 
     /**
-     * Gets information about data center replication pause.
+     * Gets data center replication status for particular sender cache.
      * <p>
      * In case node doesn't have cache with the given name then {@link IllegalArgumentException}
      * will be thrown, and if this cache is not sender cache or grid is stopping then {@link IllegalStateException}
      * will be thrown.
      *
      * @param cacheName Cache name.
-     * @return Sender cache pause state or {@code null} in case data center replication is not paused.
+     * @return Data center replication status.
      */
-    @Nullable public GridDrPause senderCacheDrPauseState(String cacheName);
+    public GridDrStatus senderCacheDrStatus(String cacheName);
 
     /**
      * Gets sender cache metrics.
