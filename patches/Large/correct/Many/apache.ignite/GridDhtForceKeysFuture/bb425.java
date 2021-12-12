diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtForceKeysFuture.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtForceKeysFuture.java
index 7cbd77c..2f58ca9 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtForceKeysFuture.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/preloader/GridDhtForceKeysFuture.java
@@ -170,7 +170,7 @@
      * @param evt Discovery event.
      */
     @SuppressWarnings( {"unchecked"})
-    public void onDiscoveryEvent(DiscoveryEvent evt) {
+    void onDiscoveryEvent(DiscoveryEvent evt) {
         topCntr.incrementAndGet();
 
         int type = evt.type();
@@ -194,11 +194,10 @@
     }
 
     /**
-     * @param nodeId Node left callback.
      * @param res Response.
      */
     @SuppressWarnings( {"unchecked"})
-    public void onResult(UUID nodeId, GridDhtForceKeysResponse res) {
+    public void onResult(GridDhtForceKeysResponse res) {
         for (IgniteInternalFuture<Object> f : futures())
             if (isMini(f)) {
                 MiniFuture mini = (MiniFuture)f;
@@ -355,8 +354,7 @@
 
         if (locPart == null)
             invalidParts.add(part);
-        // If rebalance is disabled, then local partition is always MOVING.
-        else if (locPart.state() == MOVING) {
+        else if (!cctx.rebalanceEnabled() || locPart.state() == MOVING) {
             Collections.sort(owners, CU.nodeComparator(false));
 
             // Load from youngest owner.
@@ -541,7 +539,7 @@
 
                 GridDhtLocalPartition locPart = top.localPartition(p, AffinityTopologyVersion.NONE, false);
 
-                if (locPart != null && locPart.state() == MOVING && locPart.reserve()) {
+                if (locPart != null && (!cctx.rebalanceEnabled() || locPart.state() == MOVING) && locPart.reserve()) {
                     GridCacheEntryEx entry = cctx.dht().entryEx(info.key());
 
                     try {
