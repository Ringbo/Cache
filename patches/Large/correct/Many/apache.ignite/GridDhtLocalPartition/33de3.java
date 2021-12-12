diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
index 716fe7b..8d41936 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
@@ -241,7 +241,7 @@
      * @return {@code True} if partition is empty.
      */
     public boolean isEmpty() {
-        return size() == 0;
+        return size() <= 0; // TODO
     }
 
     /**
