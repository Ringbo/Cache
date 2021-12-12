diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCachePartitionExchangeManager.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCachePartitionExchangeManager.java
index 5b4fee3..81ff028 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCachePartitionExchangeManager.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/GridCachePartitionExchangeManager.java
@@ -1357,7 +1357,7 @@
                             if (futQ.isEmpty()) {
                                 U.log(log, "Rebalancing required" +
                                     "[top=" + exchFut.topologyVersion() + ", evt=" + exchFut.discoveryEvent().name() +
-                                    ", node=" + exchFut.discoveryEvent().node().id() + ']');
+                                    ", node=" + exchFut.discoveryEvent().eventNode().id() + ']');
 
                                 if (marshR != null)
                                     try {
@@ -1402,12 +1402,12 @@
                             else
                                 U.log(log, "Skipping rebalancing (obsolete exchange ID) " +
                                     "[top=" + exchFut.topologyVersion() + ", evt=" + exchFut.discoveryEvent().name() +
-                                    ", node=" + exchFut.discoveryEvent().node().id() + ']');
+                                    ", node=" + exchFut.discoveryEvent().eventNode().id() + ']');
                         }
                         else
                             U.log(log, "Skipping rebalancing (nothing scheduled) " +
                                 "[top=" + exchFut.topologyVersion() + ", evt=" + exchFut.discoveryEvent().name() +
-                                ", node=" + exchFut.discoveryEvent().node().id() + ']');
+                                ", node=" + exchFut.discoveryEvent().eventNode().id() + ']');
                     }
                 }
                 catch (IgniteInterruptedCheckedException e) {
