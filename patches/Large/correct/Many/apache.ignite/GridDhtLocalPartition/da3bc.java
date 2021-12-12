diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
index 45a6665..4977326 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/distributed/dht/GridDhtLocalPartition.java
@@ -631,7 +631,7 @@
         while (true) {
             int cnt = evictGuard.get();
 
-            if (cnt < 0)
+            if (cnt != 0)
                 return false;
 
             if (evictGuard.compareAndSet(cnt, cnt + 1))
