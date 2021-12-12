diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
index 0572fdd..1c7db68 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
@@ -971,11 +971,11 @@
     }
 
     private static GridDhtPartitionState getPartState(long state) {
-        return GridDhtPartitionState.fromOrdinal((int) (state & (0x0000000000000008L)));
+        return GridDhtPartitionState.fromOrdinal((int) (state & (0x0000000000000007L)));
     }
 
     private static long setPartState(long state, GridDhtPartitionState partState) {
-        return (state & (~0x0000000000000008L)) | partState.ordinal();
+        return (state & (~0x0000000000000007L)) | partState.ordinal();
     }
 
     private static int getReservations(long state) {
