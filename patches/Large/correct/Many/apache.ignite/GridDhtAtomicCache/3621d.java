diff --git a/modules/core/java/org/gridgain/grid/kernal/processors/cache/distributed/dht/atomic/GridDhtAtomicCache.java b/modules/core/java/org/gridgain/grid/kernal/processors/cache/distributed/dht/atomic/GridDhtAtomicCache.java
index 7b97d8e..fa04c3f 100644
--- a/modules/core/java/org/gridgain/grid/kernal/processors/cache/distributed/dht/atomic/GridDhtAtomicCache.java
+++ b/modules/core/java/org/gridgain/grid/kernal/processors/cache/distributed/dht/atomic/GridDhtAtomicCache.java
@@ -666,7 +666,7 @@
 
                 while (true) {
                     try {
-                        entry = ctx.isSwapEnabled() ? entryEx(key) : peekEx(key);
+                        entry = ctx.isSwapOrOffheapEnabled() ? entryEx(key) : peekEx(key);
 
                         // If our DHT cache do has value, then we peek it.
                         if (entry != null) {
