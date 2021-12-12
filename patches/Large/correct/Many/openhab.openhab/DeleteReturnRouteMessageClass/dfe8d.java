diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/DeleteReturnRouteMessageClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/DeleteReturnRouteMessageClass.java
index 17f52ef..0723f8b 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/DeleteReturnRouteMessageClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/DeleteReturnRouteMessageClass.java
@@ -45,7 +45,7 @@
 		if(incomingMessage.getMessagePayloadByte(0) != 0x00) {
 			logger.debug("NODE {}: DeleteReturnRoute command in progress.", nodeId);
 		} else {
-			logger.error("NODE {}: DeleteReturnRoute command failed.");
+			logger.error("NODE {}: DeleteReturnRoute command failed.", nodeId);
 			zController.notifyEventListeners(new ZWaveNetworkEvent(ZWaveNetworkEvent.Type.DeleteReturnRoute, nodeId,
 					ZWaveNetworkEvent.State.Failure));
 		}
