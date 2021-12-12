diff --git a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AddNodeMessageClass.java b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AddNodeMessageClass.java
index e8e5fe4..c67449e 100644
--- a/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AddNodeMessageClass.java
+++ b/bundles/binding/org.openhab.binding.zwave/src/main/java/org/openhab/binding/zwave/internal/protocol/serialmessage/AddNodeMessageClass.java
@@ -88,14 +88,14 @@
 			break;
 		case ADD_NODE_STATUS_DONE:
 			logger.debug("Done.");
-			zController.sendData(doRequestStop());
+			zController.enqueue(doRequestStop());
 			// If the node ID is 0, ignore!
 			if(incomingMessage.getMessagePayloadByte(2) != 0)
 				zController.notifyEventListeners(new ZWaveInclusionEvent(ZWaveInclusionEvent.Type.IncludeDone, incomingMessage.getMessagePayloadByte(2)));
 			break;
 		case ADD_NODE_STATUS_FAILED:
 			logger.debug("Failed.");
-			zController.sendData(doRequestStop());
+			zController.enqueue(doRequestStop());
 			zController.notifyEventListeners(new ZWaveInclusionEvent(ZWaveInclusionEvent.Type.IncludeFail));
 			break;
 		default:
