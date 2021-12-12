diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AssignReturnRouteMessageClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AssignReturnRouteMessageClass.java
index 7d772a4..73e0dd9 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AssignReturnRouteMessageClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AssignReturnRouteMessageClass.java
@@ -59,7 +59,7 @@
 
 		logger.debug("NODE {}: Got AssignReturnRoute request.", nodeId);
 		if(incomingMessage.getMessagePayloadByte(1) != 0x00) {
-			logger.error("NODE {}: Assign return routes failed with error 0x{}.", nodeId, Integer.toHexString(incomingMessage.getMessagePayloadByte(0)));
+			logger.error("NODE {}: Assign return routes failed with error 0x{}.", nodeId, Integer.toHexString(incomingMessage.getMessagePayloadByte(1)));
 			zController.notifyEventListeners(new ZWaveNetworkEvent(ZWaveNetworkEvent.Type.AssignReturnRoute, nodeId,
 					ZWaveNetworkEvent.State.Failure));
 		}
