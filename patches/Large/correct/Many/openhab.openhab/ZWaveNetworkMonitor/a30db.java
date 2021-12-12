diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
index e3d67fb..2ac2c1a 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
@@ -265,7 +265,7 @@
 					logger.debug("NODE {}: DEAD node.", node.getNodeId());
 					// The node is dead, but we may have already started a Heal
 					// If so, don't start it again!
-					if(isNodeHealing(node.getNodeId())) {
+					if(!isNodeHealing(node.getNodeId())) {
 						logger.debug("NODE {}: DEAD node - requesting network heal.", node.getNodeId());
 
 						healNode(node.getNodeId());
