diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/DeleteReturnRouteMessageClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/DeleteReturnRouteMessageClass.java
index 9292405..4d26a51 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/DeleteReturnRouteMessageClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/DeleteReturnRouteMessageClass.java
@@ -59,7 +59,7 @@
 
 		logger.debug("NODE {}: Got DeleteReturnRoute request.", nodeId);
 		if(incomingMessage.getMessagePayloadByte(1) != 0x00) {
-			logger.error("NODE {}: Delete return routes failed with error 0x{}.", nodeId, Integer.toHexString(incomingMessage.getMessagePayloadByte(0)));
+			logger.error("NODE {}: Delete return routes failed with error 0x{}.", nodeId, Integer.toHexString(incomingMessage.getMessagePayloadByte(1)));
 
 			zController.notifyEventListeners(new ZWaveNetworkEvent(ZWaveNetworkEvent.Type.DeleteReturnRoute, nodeId,
 					ZWaveNetworkEvent.State.Failure));
