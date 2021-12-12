diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AssignReturnRouteMessageClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AssignReturnRouteMessageClass.java
index 1ac3481..a747e8c 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AssignReturnRouteMessageClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AssignReturnRouteMessageClass.java
@@ -48,7 +48,7 @@
 			logger.error("NODE {}: AssignReturnRoute command failed.", nodeId);
 			zController.notifyEventListeners(new ZWaveNetworkEvent(ZWaveNetworkEvent.Type.AssignReturnRoute, nodeId,
 					ZWaveNetworkEvent.State.Failure));
-			incomingMessage.setTransActionCanceled(true);
+			incomingMessage.setTransactionCanceled(true);
 		}
 		
 		return true;
