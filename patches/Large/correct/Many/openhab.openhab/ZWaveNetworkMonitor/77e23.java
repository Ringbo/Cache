diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
index 8b7b028..530df7d 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/ZWaveNetworkMonitor.java
@@ -250,7 +250,7 @@
 	public void execute() {
 		// Don't start the next node if there's a queue
 		if(zController.getSendQueueLength() > 1) {
-			logger.debug("Queue length is {} - deferring HEAL.");
+			logger.debug("Queue length is {} - deferring HEAL.", zController.getSendQueueLength());
 			return;
 		}
 
