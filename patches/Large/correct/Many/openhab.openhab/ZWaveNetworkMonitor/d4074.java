diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
index 10700c5..930f98e 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
@@ -324,7 +324,7 @@
 				}
 				// Use the last sent time for comparisson.
 				// This avoids the situation where we only poll a dead node if we use the received time!
-				if (oldestNode == null) {
+				if (oldestNode == null || oldestNode.getLastSent() == null) {
 					oldestNode = node;
 				} else if (node.getLastSent() == null || node.getLastSent().getTime() < oldestNode.getLastSent().getTime()) {
 					oldestNode = node;
